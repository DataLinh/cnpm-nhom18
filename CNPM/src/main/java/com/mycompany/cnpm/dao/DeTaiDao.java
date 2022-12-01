/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cnpm.dao;

import com.mycompany.cnpm.entities.DeTai;
import java.util.List;

/**
 *
 * @author Linh
 */
public interface DeTaiDao {
    List<DeTai> getAll();
    
    void themGVPB(String maDeTai, String maGiangVien);
}
