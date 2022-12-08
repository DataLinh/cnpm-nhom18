/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cnpm.dao.impl;

import com.mycompany.cnpm.dao.NganhDao;
import com.mycompany.cnpm.entities.DeTai;
import com.mycompany.cnpm.entities.Nganh;
import com.mycompany.cnpm.until.HibernateUtil;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author Linh
 */
public class NganhDaoImpl implements NganhDao{

    @Override
    public List<Nganh> getAllNganh() {
        List<Nganh> nganh = null;
        try ( Session session = HibernateUtil.getFactory().openSession()) {
           
            nganh=  session.createQuery("FROM Nganh").list();            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return nganh;    }
    
}
