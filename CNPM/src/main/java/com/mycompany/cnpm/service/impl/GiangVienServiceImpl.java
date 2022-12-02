/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cnpm.service.impl;

import com.mycompany.cnpm.dao.UserDao;
import com.mycompany.cnpm.dao.impl.UserDaoImpl;
import com.mycompany.cnpm.entities.User;
import com.mycompany.cnpm.service.GiangVienService;
import java.util.List;

/**
 *
 * @author Linh
 */
public class GiangVienServiceImpl implements GiangVienService {

    UserDao giangVienDao = new UserDaoImpl();

    @Override
    public List<User> allGiangVien() {
        return giangVienDao.getAllGiangVien();
    }

    @Override
    public void themHoiDong(String userId, String hoiDongId) {
        giangVienDao.themHoiDong(userId, hoiDongId);
    }
}
