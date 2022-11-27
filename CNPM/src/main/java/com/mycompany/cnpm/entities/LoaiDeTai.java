/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cnpm.entities;

/**
 *
 * @author Linh
 */
import java.util.List;
import javax.persistence.*;

@Entity
@Table(name = "LoaiDeTai")
public class LoaiDeTai {

    @Id
    @Column(name = "maLoaiDeTai")
    private String maLoaiDeTai;

    @Column
    private String tenLoaiDeTai;

    @Column
    private String hocKy;

    @Column
    private String nam;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "loaiDeTai", cascade = CascadeType.ALL)
    private List<DeTai> deTai;

    /**
     * @return the maLoaiDeTai
     */
    public String getMaLoaiDeTai() {
        return maLoaiDeTai;
    }

    /**
     * @param maLoaiDeTai the maLoaiDeTai to set
     */
    public void setMaLoaiDeTai(String maLoaiDeTai) {
        this.maLoaiDeTai = maLoaiDeTai;
    }

    /**
     * @return the tenLoaiDeTai
     */
    public String getTenLoaiDeTai() {
        return tenLoaiDeTai;
    }

    /**
     * @param tenLoaiDeTai the tenLoaiDeTai to set
     */
    public void setTenLoaiDeTai(String tenLoaiDeTai) {
        this.tenLoaiDeTai = tenLoaiDeTai;
    }

    /**
     * @return the hocKy
     */
    public String getHocKy() {
        return hocKy;
    }

    /**
     * @param hocKy the hocKy to set
     */
    public void setHocKy(String hocKy) {
        this.hocKy = hocKy;
    }

    /**
     * @return the nam
     */
    public String getNam() {
        return nam;
    }

    /**
     * @param nam the nam to set
     */
    public void setNam(String nam) {
        this.nam = nam;
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

}
