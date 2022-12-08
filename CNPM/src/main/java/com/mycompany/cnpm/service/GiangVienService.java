/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cnpm.service;

import com.mycompany.cnpm.entities.User;
import java.util.List;

/**
 *
 * @author Linh
 */
public interface GiangVienService {
    List<User> allGiangVien();
    List<User> allGiangVienChuaCoHD();
    
    void themHoiDong(String userId, String hoiDongId);
}
