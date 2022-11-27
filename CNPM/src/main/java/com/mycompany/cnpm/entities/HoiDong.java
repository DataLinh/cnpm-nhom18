/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cnpm.entities;

import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Linh
 */
@Entity
@Table(name = "HoiDong")
public class HoiDong {
    @Id
    @Column(name = "maHoiDong")
    private String maHoiDong;

    @Column
    private String tenHoiDong;
    
    @OneToMany(fetch = FetchType.LAZY,mappedBy="hoiDong", cascade=CascadeType.ALL)
    private List<DeTai> deTai;

    @OneToMany(fetch = FetchType.LAZY,mappedBy="hoiDong", cascade=CascadeType.ALL)
    private List<User> giangVien;
    /**
     * @return the maHoiDong
     */
    public String getMaHoiDong() {
        return maHoiDong;
    }

    /**
     * @param maHoiDong the maHoiDong to set
     */
    public void setMaHoiDong(String maHoiDong) {
        this.maHoiDong = maHoiDong;
    }


    /**
     * @return the deTai
     */
    public List<DeTai> getDeTai() {
        return deTai;
    }

    /**
     * @param deTai the deTai to set
     */
    public void setDeTai(List<DeTai> deTai) {
        this.deTai = deTai;
    }

    /**
     * @return the giangVien
     */
    public List<User> getGiangVien() {
        return giangVien;
    }

    /**
     * @param giangVien the giangVien to set
     */
    public void setGiangVien(List<User> giangVien) {
        this.giangVien = giangVien;
    }

    /**
     * @return the tenHoiDong
     */
    public String getTenHoiDong() {
        return tenHoiDong;
    }

    /**
     * @param tenHoiDong the tenHoiDong to set
     */
    public void setTenHoiDong(String tenHoiDong) {
        this.tenHoiDong = tenHoiDong;
    }
    
}
