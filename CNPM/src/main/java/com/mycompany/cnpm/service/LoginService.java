/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cnpm.service;

import com.mycompany.cnpm.entities.User;

/**
 *
 * @author Linh
 */
public interface LoginService {

    User login(String username, String password);

}
