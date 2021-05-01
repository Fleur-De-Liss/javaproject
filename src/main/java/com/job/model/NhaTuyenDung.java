/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.job.model;

import java.util.HashSet;
import java.util.Set;
 
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
/**
 *
 * @author Yanagi
 */
@Entity
@Table(name = "nhatuyendungs")
public class NhaTuyenDung {
    @Id
    @GeneratedValue
    private int ntdId;
    private String name;
    private String diachi;
    private String website;
    private String mota;
    
    private Set<ChiTietTuyenDung> chiTiets = new HashSet<ChiTietTuyenDung>();
    
    public NhaTuyenDung() {
    }
 
    public NhaTuyenDung(String name, String diachi, String website, String mota) {
        this.name = name;
        this.diachi = diachi;
        this.website = website;
        this.mota = mota;
    }

    /**
     * @return the id
     */
    public int getId() {
        return ntdId;
    }

    @Id
    @GeneratedValue
    @Column(name = "ntd_id")
    /**
     * @param id the id to set
     */
    public void setId(int ntdId) {
        this.ntdId = ntdId;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the diachi
     */
    public String getDiachi() {
        return diachi;
    }

    /**
     * @param diachi the diachi to set
     */
    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    /**
     * @return the website
     */
    public String getWebsite() {
        return website;
    }

    /**
     * @param website the website to set
     */
    public void setWebsite(String website) {
        this.website = website;
    }

    /**
     * @return the mota
     */
    public String getMota() {
        return mota;
    }

    /**
     * @param mota the mota to set
     */
    public void setMota(String mota) {
        this.mota = mota;
    }

    /**
     * @return the chiTiets
     */
    @OneToMany(mappedBy = "nhatuyendungs")
    public Set<ChiTietTuyenDung> getChiTiets() {
        return chiTiets;
    }

    /**
     * @param chiTiets the chiTiets to set
     */
    public void setChiTiets(Set<ChiTietTuyenDung> chiTiets) {
        this.chiTiets = chiTiets;
    }
    
    public void addChiTiet(ChiTietTuyenDung chiTiet) {
        this.chiTiets.add(chiTiet);
    }
}
