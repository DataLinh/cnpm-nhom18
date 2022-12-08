/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cnpm.service;

import com.mycompany.cnpm.entities.HoiDong;
import java.util.List;

/**
 *
 * @author Linh
 */
public interface HoiDongService {

    int themHoiDong(HoiDong h);

    List<HoiDong> allHoiDong();

    void xoaHoiDong(String id);


}
