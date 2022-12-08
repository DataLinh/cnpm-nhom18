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
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import org.hibernate.Session;
import org.hibernate.Transaction;


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
    public List<DeTai> getAllByNganh(String maNganh) {
        List<DeTai> deTai = null;
        try ( Session session = HibernateUtil.getFactory().openSession()) {
           
            deTai=  session.createQuery("Select d FROM DeTai d Where d.nganh.maNganh = :maNganh").setParameter("maNganh", maNganh).list();            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return deTai;
    }

    @Override
    public void themGVPB(String maDeTai, String maGiangVien) {
        Transaction transaction = null;
        DeTai deTai = null;
        try ( Session session = HibernateUtil.getFactory().openSession()) {
            transaction = session.beginTransaction();
                deTai = session.get(DeTai.class,maDeTai);
                deTai.setGvPhanBien(session.get(User.class, maGiangVien));  
                session.update(deTai);
            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
            if (transaction != null){
                transaction.rollback();
            }
        }
    }
}
