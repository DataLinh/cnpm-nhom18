/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cnpm.dao.impl;

import com.mycompany.cnpm.dao.DeTaiDao;
import com.mycompany.cnpm.entities.DeTai;
import com.mycompany.cnpm.entities.User;
import com.mycompany.cnpm.until.HibernateUtil;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import org.hibernate.Session;

/**
 *
 * @author Linh
 */
public class DeTaiDaoImpl implements DeTaiDao {

    @Override
    public List<DeTai> getAll() {
        List<DeTai> deTai = null;
        try ( Session session = HibernateUtil.getFactory().openSession()) {
           
            deTai=  session.createQuery("FROM DeTai").list();            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return deTai;
    }
}
