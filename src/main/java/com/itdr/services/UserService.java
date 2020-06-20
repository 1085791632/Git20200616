package com.itdr.services;

import com.itdr.common.ResponseCode;
import com.itdr.dao.UserDao;
import com.itdr.pojo.User;

public class UserService {
    private UserDao userDao=new UserDao();
    public ResponseCode login(String phone, String password){
        User user=userDao.selectByPhoneAndPassword(phone,password);
        //判断数据
        if(user.getPhone()==null){
            return ResponseCode.toFailed("用户不存在或密码错误");
        }
        return ResponseCode.toSuccess(user);
    }
}
