package com.itdr.controller;

import com.google.gson.Gson;
import com.itdr.common.ResponseCode;
import com.itdr.services.UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "UserServlet",value = "/user/*")
public class UserServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //获取请求路径
        String requestURI=request.getRequestURI();
        //分割字符串
        String[] split=requestURI.split("/");
        //获取末尾路径内容
        String url=split[split.length-1];
        switch (url){
            case "login":
                login(request,response);
                break;
        }
    }
    private UserService userService=new UserService();
    //用户登录
    public void login(HttpServletRequest request, HttpServletResponse response) throws IOException {
        //获取请求参数
        String phone=request.getParameter("phone");
        String password=request.getParameter("password");

        //调用业务层方法
        ResponseCode rs = userService.login(phone,password);

        //处理json数据
        Gson g=new Gson();
        String rsc=g.toJson(rs);
        //返回前端
        response.getWriter().write(rsc);
    }

}
