/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cnpm.entities;

import javax.persistence.*;

/**
 *
 * @author Linh
 */
@Entity
@Table(name = "Nganh")
public class Nganh {
    @Id
    @Column
    private String maNganh;
    
    @Column
    private String tenNganh;

    /**
     * @return the maNganh
     */
    public String getMaNganh() {
        return maNganh;
    }

    /**
     * @param maNganh the maNganh to set
     */
    public void setMaNganh(String maNganh) {
        this.maNganh = maNganh;
    }

    /**
     * @return the tenNganh
     */
    public String getTenNganh() {
        return tenNganh;
    }

    /**
     * @param tenNganh the tenNganh to set
     */
    public void setTenNganh(String tenNganh) {
        this.tenNganh = tenNganh;
    }
    
    
}
