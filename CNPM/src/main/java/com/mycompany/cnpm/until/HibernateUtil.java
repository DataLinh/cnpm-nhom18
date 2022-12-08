/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cnpm.until;

import com.mycompany.cnpm.entities.DeTai;
import com.mycompany.cnpm.entities.HoiDong;
import com.mycompany.cnpm.entities.LoaiDeTai;
import com.mycompany.cnpm.entities.Nganh;
import com.mycompany.cnpm.entities.User;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

/**
 *
 * @author Linh
 */
public class HibernateUtil {

    private static final SessionFactory FACTORY;

    static {
        Configuration conf = new Configuration();
        conf.configure("hibernate.cfg.xml");

        conf.addAnnotatedClass(LoaiDeTai.class);
        
        
        conf.addAnnotatedClass(Nganh.class);
        
        
        
        conf.addAnnotatedClass(HoiDong.class);
        conf.addAnnotatedClass(User.class);
        conf.addAnnotatedClass(DeTai.class);
        
        ServiceRegistry registry = new StandardServiceRegistryBuilder().applySettings(conf.getProperties()).build();

        FACTORY = conf.buildSessionFactory(registry);
        
        
    }

    public static SessionFactory getFactory() {
        return FACTORY;
    }

    public static Object getSessionFactory() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
