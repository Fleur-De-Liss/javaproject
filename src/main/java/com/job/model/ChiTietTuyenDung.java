/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.job.model;

import java.util.Date;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
/**
 *
 * @author Yanagi
 */
@Entity
@Table(name = "chitiettuyendungs")
public class ChiTietTuyenDung {
    private int cttdId;
    private CongViec cv;
    private NhaTuyenDung ntd;
    
    private int luong;
    private String diadiem;
    private String capbac;
    private String hinhthuclam;
    private int soluong;
    private Date hannop;
    private String nganhnghe;
    private String yeucau;
    private String mota;
    private String quyenloi;

    /**
     * @return the id
     */
    public int getId() {
        return cttdId;
    }

    /**
     * @param id the id to set
     */
    public void setId(int cttdId) {
        this.cttdId = cttdId;
    }

    /**
     * @return the luong
     */
    public int getLuong() {
        return luong;
    }

    /**
     * @param luong the luong to set
     */
    public void setLuong(int luong) {
        this.luong = luong;
    }

    /**
     * @return the diadiem
     */
    public String getDiadiem() {
        return diadiem;
    }

    /**
     * @param diadiem the diadiem to set
     */
    public void setDiadiem(String diadiem) {
        this.diadiem = diadiem;
    }

    /**
     * @return the capbac
     */
    public String getCapbac() {
        return capbac;
    }

    /**
     * @param capbac the capbac to set
     */
    public void setCapbac(String capbac) {
        this.capbac = capbac;
    }

    /**
     * @return the hinhthuclam
     */
    public String getHinhthuclam() {
        return hinhthuclam;
    }

    /**
     * @param hinhthuclam the hinhthuclam to set
     */
    public void setHinhthuclam(String hinhthuclam) {
        this.hinhthuclam = hinhthuclam;
    }

    /**
     * @return the soluong
     */
    public int getSoluong() {
        return soluong;
    }

    /**
     * @param soluong the soluong to set
     */
    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

    /**
     * @return the hannop
     */
    @Column(name = "hannop")
    @Temporal(TemporalType.DATE)
    public Date getHannop() {
        return hannop;
    }

    /**
     * @param hannop the hannop to set
     */
    public void setHannop(Date hannop) {
        this.hannop = hannop;
    }

    /**
     * @return the nganhnghe
     */
    public String getNganhnghe() {
        return nganhnghe;
    }

    /**
     * @param nganhnghe the nganhnghe to set
     */
    public void setNganhnghe(String nganhnghe) {
        this.nganhnghe = nganhnghe;
    }

    /**
     * @return the yeucau
     */
    public String getYeucau() {
        return yeucau;
    }

    /**
     * @param yeucau the yeucau to set
     */
    public void setYeucau(String yeucau) {
        this.yeucau = yeucau;
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
     * @return the quyenloi
     */
    public String getQuyenloi() {
        return quyenloi;
    }

    /**
     * @param quyenloi the quyenloi to set
     */
    public void setQuyenloi(String quyenloi) {
        this.quyenloi = quyenloi;
    }

    /**
     * @return the cv
     */
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "cv_id")
    public CongViec getCv() {
        return cv;
    }

    /**
     * @param cv the cv to set
     */
    public void setCv(CongViec cv) {
        this.cv = cv;
    }

    /**
     * @return the ntd
     */
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "ntd_id")
    public NhaTuyenDung getNtd() {
        return ntd;
    }

    /**
     * @param ntd the ntd to set
     */
    public void setNtd(NhaTuyenDung ntd) {
        this.ntd = ntd;
    }

}
