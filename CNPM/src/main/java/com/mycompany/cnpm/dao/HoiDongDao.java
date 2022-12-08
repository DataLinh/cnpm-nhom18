/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cnpm.dao;

import com.mycompany.cnpm.entities.HoiDong;
import java.util.List;

/**
 *
 * @author Linh
 */
public interface HoiDongDao {

    int themHoiDong(HoiDong h);

    List<HoiDong> allHoiDong();
    
    void xoaHoiDong(HoiDong h);
    
    HoiDong get(String id);
}
