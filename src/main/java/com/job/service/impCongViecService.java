/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.job.service;

import com.job.dao.CongViecDAO;
import com.job.model.CongViec;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
/**
 *
 * @author Yanagi
 */
public class impCongViecService implements CongViecService{
    @Autowired
    private CongViecDAO congviecDAO;

    @Override
    public boolean create(CongViec object) {
        return congviecDAO.create(object);
    }

    @Override
    public boolean update(CongViec object) {
        return congviecDAO.update(object);
    }

    @Override
    public boolean delete(CongViec object) {
        return congviecDAO.delete(object);
    }

    @Override
    public CongViec findById(int cvId) {
        return congviecDAO.findById(cvId);
    }

    @Override
    public List<CongViec> getAll() {
        return congviecDAO.getAll();
    }
}
