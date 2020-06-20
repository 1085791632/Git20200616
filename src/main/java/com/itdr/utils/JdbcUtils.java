package com.itdr.utils;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class JdbcUtils {
    private static String url="";
    private static String username="";
    private static String password="";
    static {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Properties properties=new Properties();
            InputStream inputStream = JdbcUtils.class.getClassLoader().getResourceAsStream("db.properties");
            properties.load(inputStream);
            url=properties.getProperty("url");
            username=properties.getProperty("username");
            password=properties.getProperty("password");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    //连接数据库
    private static Connection getConnection(){
        Connection con=null;
        try {
            con= DriverManager.getConnection(url,username,password);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return con;
    }
    //增删改 关闭
    private static void close(PreparedStatement pstmt,Connection con){
        try {
            if(pstmt != null)
                pstmt.close();
            if(con!=null)
                con.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
    //查 关闭
    private static void close(ResultSet rs, PreparedStatement pstmt, Connection con){
        try {
            if(rs!=null)
                rs.close();
            close(pstmt,con);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
    //增删改接口
    public static int executeUpdate(String sql,Object... params){
        int result=0;
        Connection con=getConnection();
        PreparedStatement pstmt =null;
        try {
            pstmt=con.prepareStatement(sql);
            if(params!=null){
                for (int i=0;i<params.length;i++){
                    pstmt.setObject(i+1,params[i]);
                }
            }
            result=pstmt.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }finally {
            close(pstmt,con);
        }
        return result;
    }
    //查询接口
    public static <T> List<T> executeQuery(String sql,Class<T> clz,Object...params){
        List<T> list=new ArrayList<>();
        Connection con=getConnection();
        PreparedStatement pstmt =null;
        ResultSet rs=null;

        try {
            pstmt=con.prepareStatement(sql);
            if(params!=null){
                for (int i=0;i<params.length;i++){
                    pstmt.setObject(i+1,params[i]);
                }
            }
            rs=pstmt.executeQuery();
            while(rs.next()){
                T t=clz.newInstance();
                Field[] fields=clz.getDeclaredFields();
                for (Field field:fields){

                    try{
                        field.setAccessible(true);
                        field.set(t,rs.getObject(field.getName()));
                    }catch (Exception e){

                    }

                }
                list.add(t);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }finally {
            close(rs,pstmt,con);
        }

        return list;
    }
}