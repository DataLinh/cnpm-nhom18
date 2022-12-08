/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cnpm.service;

import com.mycompany.cnpm.entities.DeTai;
import com.mycompany.cnpm.entities.User;
import java.util.List;

/**
 *
 * @author Linh
 */
public interface DeTaiService {

    List<DeTai> getAllDeTai();
    
    List<DeTai> getAllByNganh( String maNganh);

    void themGVPB(String maDeTai, String maGiangVien);

    List<User> getAllGiangVien();

}
