package com.mycompany.cnpm.dao.impl;

import javax.transaction.SystemException;
import javax.transaction.Transaction;

import com.mycompany.cnpm.dao.TaiKhoanDao;
import com.mycompany.cnpm.entities.User;
import com.mycompany.cnpm.until.HibernateUtil;
import org.hibernate.Session;
import com.mycompany.cnpm.until.HibernateUtil;
import java.util.List;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import org.hibernate.Session;

public class TaiKhoanDaoImpl  implements TaiKhoanDao  {

	@Override
    public int themTaiKhoan(User u) {
        org.hibernate.Transaction transaction = null;
        try ( Session session = HibernateUtil.getFactory().openSession()) {
            transaction = session.beginTransaction();
            session.save(u);
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
	    public List<User> allTaiKhoan() {
	        List<User> users = null;
	        try ( Session session = HibernateUtil.getFactory().openSession()) {
	            CriteriaBuilder builder = session.getCriteriaBuilder();
	            CriteriaQuery<User> criteriaQuery = builder.createQuery(User.class);
	            criteriaQuery.from(User.class);
	            users = session.createQuery(criteriaQuery).getResultList();
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	        return users;
	    }
	    
	   @Override
	    public void xoaTaiKhoan(User u) {
		 org.hibernate.Transaction transaction = null;
	        try ( Session session = HibernateUtil.getFactory().openSession()) {
	            transaction =  session.beginTransaction();
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
	        User user = null;
	        try ( Session session = HibernateUtil.getFactory().openSession()) {

	            user = session.get(User.class, id);

	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	        return user;
	    }
	
}
