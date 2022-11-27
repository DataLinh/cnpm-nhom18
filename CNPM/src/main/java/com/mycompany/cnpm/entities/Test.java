/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cnpm.entities;

import com.mycompany.cnpm.until.HibernateUtil;
import java.util.List;
import java.util.Set;
import org.hibernate.Session;

/**
 *
 * @author Linh
 */
public class Test {

    public static void main(String[] args) {
        try ( Session session = HibernateUtil.getFactory().openSession()) {
//            Category c = session.get(Category.class, 2);
//            System.out.println(c.getCategoryName());
//
//            Discount d = session.get(Discount.class, 2);
//            System.out.println(d.getName());
//
            Set<DeTai> detai =   (Set<DeTai>) session.createQuery("FROM DeTai").list();
            System.out.println(detai);

            session.close();
        }
    }

}
