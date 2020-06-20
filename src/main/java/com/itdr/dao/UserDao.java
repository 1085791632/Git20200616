package com.itdr.dao;

import com.itdr.pojo.User;
import com.itdr.utils.JdbcUtils;

import java.util.List;

public class UserDao {
    //在数据层只有四种方法：增删改查
    public User selectByPhoneAndPassword(String phone, String password){
        User user=new User();
        try{
            String sql = "select * from user where phone='"+phone+"' and password='"+password+"'";
            List<User> list= JdbcUtils.executeQuery(sql,User.class);
            if(list!=null){
                user=list.get(0);
                //System.out.println(user);
            }
            else{
                user=null;
            }
        }catch (Exception e) {

        }
        return user;
    }
}
