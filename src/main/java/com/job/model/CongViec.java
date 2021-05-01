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
@Table(name = "congviecs")
public class CongViec {
    private int cvId;
    private String name;
    
    private Set<ChiTietTuyenDung> chiTiets = new HashSet<ChiTietTuyenDung>();
    
    public CongViec() {
    }
 
    public CongViec(String name) {
        this.name = name;
    }

    @Id
    @GeneratedValue
    @Column(name = "cv_id")
    /**
     * @return the id
     */
    public int getId() {
        return cvId;
    }

    /**
     * @param id the id to set
     */
    public void setId(int cvId) {
        this.cvId = cvId;
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

//    /**
//     * @return the chiTiets
//     */
//    @OneToMany(mappedBy = "congviecs")
//    public Set<ChiTietTuyenDung> getChiTiets() {
//        return chiTiets;
//    }
//
//    /**
//     * @param chiTiets the chiTiets to set
//     */
//    public void setChiTiets(Set<ChiTietTuyenDung> chiTiets) {
//        this.chiTiets = chiTiets;
//    }
//    
//    public void addChiTiet(ChiTietTuyenDung chiTiet) {
//        this.chiTiets.add(chiTiet);
//    }
}
