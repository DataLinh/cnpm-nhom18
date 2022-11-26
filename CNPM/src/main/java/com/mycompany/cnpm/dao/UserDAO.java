/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cnpm.dao;

import com.mycompany.cnpm.entities.User;

/**
 *
 * @author ashut
 */
public interface UserDao {

    User login(String userName, String password);

}
