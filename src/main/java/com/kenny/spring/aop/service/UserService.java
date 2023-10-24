package com.kenny.spring.aop.service;

import com.kenny.spring.aop.dao.UserDao;

/**
 * 用户服务
 */
public class UserService {
    private UserDao userDao;

    public void createUser(){
        if (1==1) {
            throw new RuntimeException("user already existed");
        }
        System.out.println("execute employee creation logic");
        userDao.insert();
    }

    public String generateRandomPassword(String type , Integer length){
        System.out.println("Based on " + type + " method generated "+ length  + " numbers random password");
        return "Zxcquei1";
    }

    public UserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
}
