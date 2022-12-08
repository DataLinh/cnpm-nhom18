/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cnpm.dao.impl;

import com.mycompany.cnpm.dao.HoiDongDao;
import com.mycompany.cnpm.entities.DeTai;
import com.mycompany.cnpm.entities.HoiDong;
import com.mycompany.cnpm.entities.User;
import com.mycompany.cnpm.until.HibernateUtil;
import java.util.List;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Linh
 */
public class HoiDongDaoImpl implements HoiDongDao {

    @Override
    public int themHoiDong(HoiDong h) {
        Transaction transaction = null;
        try ( Session session = HibernateUtil.getFactory().openSession()) {
            transaction = session.beginTransaction();
            session.save(h);
            transaction.commit();
            return 1;
        } catch (Exception e) {
            e.printStackTrace();
            if (transaction != null) {
                transaction.rollback();

            }
        }
        return 0;
    }

    @Override
    public List<HoiDong> allHoiDong() {
        List<HoiDong> hoiDongs = null;
        try ( Session session = HibernateUtil.getFactory().openSession()) {
            CriteriaBuilder builder = session.getCriteriaBuilder();
            CriteriaQuery<HoiDong> criteriaQuery = builder.createQuery(HoiDong.class);
            criteriaQuery.from(HoiDong.class);
            hoiDongs = session.createQuery(criteriaQuery).getResultList();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return hoiDongs;
    }

    @Override
    public void xoaHoiDong(HoiDong h) {
        Transaction transaction = null;
        try ( Session session = HibernateUtil.getFactory().openSession()) {
            transaction = session.beginTransaction();
            session.delete(h);
            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
            if (transaction != null) {
                transaction.rollback();

            }
        }
    }

    @Override
    public HoiDong get(String id) {
        HoiDong hoiDong = null;
        try ( Session session = HibernateUtil.getFactory().openSession()) {

            hoiDong = session.get(HoiDong.class, id);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return hoiDong;
    }
}
