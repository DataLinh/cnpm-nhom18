/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cnpm.service.impl;

import com.mycompany.cnpm.dao.DeTaiDao;
import com.mycompany.cnpm.dao.UserDao;
import com.mycompany.cnpm.dao.impl.DeTaiDaoImpl;
import com.mycompany.cnpm.dao.impl.UserDaoImpl;
import com.mycompany.cnpm.entities.DeTai;
import com.mycompany.cnpm.entities.User;
import com.mycompany.cnpm.service.DeTaiService;
import java.util.List;

/**
 *
 * @author Linh
 */
public class DeTaiServiceImpl implements DeTaiService {

    DeTaiDao deTaiDao = new DeTaiDaoImpl();

    @Override
    public List<DeTai> getAllDeTai() {
        List<DeTai> deTai = deTaiDao.getAll();
        return deTai;
    }

    @Override
    public void themGVPB(String maDeTai, String maGiangVien) {
        deTaiDao.themGVPB(maDeTai, maGiangVien);
    }

    @Override
    public List<User> getAllGiangVien() {
        UserDao userDao = new UserDaoImpl();
        return userDao.getAllGiangVien();
    }

    @Override
    public List<DeTai> getAllByNganh(String maNganh) {
        return deTaiDao.getAllByNganh(maNganh);
    }
    
}
