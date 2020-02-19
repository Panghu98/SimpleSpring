package com.panghu.service;

import com.panghu.dao.UserDao;

/**
 * @author panghu
 */
public class UserServiceImpl implements UserService {

    UserDao dao;

    public void find() {
        System.out.println("service");
        dao.query();
    }

    //public void setDao(UserDao dao) {
       // this.dao = dao;
   // }
}
