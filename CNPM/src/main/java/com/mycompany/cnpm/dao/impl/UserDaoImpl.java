/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cnpm.dao.impl;

import com.mycompany.cnpm.dao.UserDao;
import com.mycompany.cnpm.entities.User;
import com.mycompany.cnpm.entities.HoiDong;
import com.mycompany.cnpm.until.HibernateUtil;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Linh
 */
public class UserDaoImpl implements UserDao {

    @Override
    public User login(String userName, String password) {
        Transaction transaction = null;
        User user = null;
        try ( Session session = HibernateUtil.getFactory().openSession()) {
            // start a transaction
            transaction = session.beginTransaction();
            // get an user object
            user = (User) session.createQuery("FROM User AS U WHERE U.username = :userName").setParameter("userName", userName)
                    .uniqueResult();

            if (user != null && user.getPassword().equals(password)) {
                return user;
            }
            // commit transaction
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<User> getAllGiangVien() {
        List<User> user = null;
        try ( Session session = HibernateUtil.getFactory().openSession()) {
            user = session.createQuery("FROM User AS U WHERE U.role = 'GiangVien'").list();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return user;
    }

    @Override
    public List<User> getAllGiangVienChuaCoHD() {
        List<User> user = null;
        try ( Session session = HibernateUtil.getFactory().openSession()) {
            user = session.createQuery("FROM User AS U WHERE (U.role = 'GiangVien' AND U.hoiDong IS NULL)").list();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return user;
    }

    @Override
    public void themHoiDong(String userId, String hoiDongId) {
        User user = null;

        Transaction transaction = null;
        try ( Session session = HibernateUtil.getFactory().openSession()) {
            transaction = session.beginTransaction();
            user = session.get(User.class, userId);
            HoiDong hoiDong = session.get(HoiDong.class, hoiDongId);
            user.setHoiDong(hoiDong);
            session.update(user);

            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
            if (transaction != null) {
                transaction.rollback();
            }
        }

    }
    @Override
    public int themTaiKhoan (User t) {
    	Transaction transaction = null;
        try ( Session session = HibernateUtil.getFactory().openSession()) {
            transaction = session.beginTransaction();
            session.save(t);
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
    public List<User> allTaiKhoan() {
    	 List<User> user = null;
         try ( Session session = HibernateUtil.getFactory().openSession()) {
             user = session.createQuery("Select * FROM User ").list();
         } catch (Exception e) {
             e.printStackTrace();
         }
         return user;
    }
  @Override
    public void xoaTaiKhoan(User u) {
        Transaction transaction = null;
        try ( Session session = HibernateUtil.getFactory().openSession()) {
            transaction = session.beginTransaction();
            session.delete(u);
            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
            if (transaction != null) {
                transaction.rollback();

            }
        }
    }
  @Override
    public User get(String id) {
        User taiKhoan = null;
        try ( Session session = HibernateUtil.getFactory().openSession()) {

            taiKhoan = session.get(User.class, id);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return taiKhoan;
    } 
    
}