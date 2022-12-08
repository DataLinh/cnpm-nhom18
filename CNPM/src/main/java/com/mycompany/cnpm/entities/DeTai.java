/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cnpm.entities;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author Linh
 */
@Entity
@Table(name = "DeTai")
public class DeTai {

    @Id
    @Column(name = "maDeTai")
    private String maDeTai;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "loaiDeTai")
    private LoaiDeTai loaiDeTai;

    @OneToOne
    @JoinColumn(name = "maNganh")
    private Nganh nganh;

    @OneToOne
    @JoinColumn(name = "gvHuongDan")
    private User gvHuongDan;

    @OneToOne
    @JoinColumn(name = "gvPhanBien")
    private User gvPhanBien;

    @OneToOne
    @JoinColumn(name = "maSinhVien")
    private User maSinhVien;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "maHoiDong")
    private HoiDong hoiDong;

    /**
     * @return the maDeTai
     */
    public String getMaDeTai() {
        return maDeTai;
    }

    /**
     * @param maDeTai the maDeTai to set
     */
    public void setMaDeTai(String maDeTai) {
        this.maDeTai = maDeTai;
    }

    /**
     * @return the loaiDeTai
     */
    public LoaiDeTai getLoaiDeTai() {
        return loaiDeTai;
    }

    /**
     * @param loaiDeTai the loaiDeTai to set
     */
    public void setLoaiDeTai(LoaiDeTai loaiDeTai) {
        this.loaiDeTai = loaiDeTai;
    }

    /**
     * @return the nganh
     */
    public Nganh getNganh() {
        return nganh;
    }

    /**
     * @param nganh the nganh to set
     */
    public void setNganh(Nganh nganh) {
        this.nganh = nganh;
    }

    /**
     * @return the gvHuongDan
     */
    public User getGvHuongDan() {
        return gvHuongDan;
    }

    /**
     * @param gvHuongDan the gvHuongDan to set
     */
    public void setGvHuongDan(User gvHuongDan) {
        this.gvHuongDan = gvHuongDan;
    }

    /**
     * @return the gvPhanBien
     */
    public User getGvPhanBien() {
        return gvPhanBien;
    }

    /**
     * @param gvPhanBien the gvPhanBien to set
     */
    public void setGvPhanBien(User gvPhanBien) {
        this.gvPhanBien = gvPhanBien;
    }

    /**
     * @return the maSinhVien
     */
    public User getMaSinhVien() {
        return maSinhVien;
    }

    /**
     * @param maSinhVien the maSinhVien to set
     */
    public void setMaSinhVien(User maSinhVien) {
        this.maSinhVien = maSinhVien;
    }

    /**
     * @return the hoiDong
     */
    public HoiDong getHoiDong() {
        return hoiDong;
    }

    /**
     * @param hoiDong the hoiDong to set
     */
    public void setHoiDong(HoiDong hoiDong) {
        this.hoiDong = hoiDong;
    }

}
