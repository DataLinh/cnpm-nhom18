/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cnpm.service.impl;

import com.mycompany.cnpm.dao.UserDao;
import com.mycompany.cnpm.dao.impl.UserDaoImpl;
import com.mycompany.cnpm.entities.User;
import com.mycompany.cnpm.service.LoginService;

/**
 *
 * @author Linh
 */
public class LoginServiceImpl implements LoginService {
	UserDao userDao = new UserDaoImpl();

    @Override
    public User login(String username, String password) {
        User user = this.userDao.login(username, password);
        if (user != null && password.equals(user.getPassword())) {
            return user;
        }
        return null;
    }

}
