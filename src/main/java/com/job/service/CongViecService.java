/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.job.service;

import com.job.model.CongViec;
import java.util.List;
/**
 *
 * @author Yanagi
 */
public interface CongViecService {
     // create
    public boolean create(CongViec object);

    // update
    public boolean update(CongViec object);

    // delete
    public boolean delete(CongViec object);

    // find by id
    public CongViec findById(int cvId);

    // load list category
    public List<CongViec> getAll();
}
