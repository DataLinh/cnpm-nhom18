/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cnpm.service.impl;

import com.mycompany.cnpm.dao.HoiDongDao;
import com.mycompany.cnpm.dao.impl.HoiDongDaoImpl;
import com.mycompany.cnpm.dao.impl.UserDaoImpl;
import com.mycompany.cnpm.entities.HoiDong;
import com.mycompany.cnpm.entities.User;
import com.mycompany.cnpm.service.HoiDongService;
import java.util.List;

/**
 *
 * @author Linh
 */
public class HoiDongServiceImpl implements HoiDongService {

    HoiDongDao hoiDongDao = new HoiDongDaoImpl();
    UserDaoImpl userDao = new UserDaoImpl();

    @Override
    public int themHoiDong(HoiDong h) {
        return hoiDongDao.themHoiDong(h);
    }

    @Override
    public List<HoiDong> allHoiDong() {
        return hoiDongDao.allHoiDong();
    }

    @Override
    public void xoaHoiDong(String id) {
        hoiDongDao.xoaHoiDong(hoiDongDao.get(id));
    }

    

}
