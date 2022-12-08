/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cnpm.service.impl;

import com.mycompany.cnpm.dao.NganhDao;
import com.mycompany.cnpm.dao.impl.NganhDaoImpl;
import com.mycompany.cnpm.entities.Nganh;
import com.mycompany.cnpm.service.NganhService;
import java.util.List;

/**
 *
 * @author Linh
 */
public class NganhServiceImpl implements NganhService {

    NganhDao nganhDao = new NganhDaoImpl();

    @Override
    public List<Nganh> getAllNganh() {
        return nganhDao.getAllNganh();
    }

}
