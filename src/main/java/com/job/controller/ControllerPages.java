/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.job.controller;

import com.job.service.CongViecService;
import java.text.Normalizer;
import java.util.regex.Pattern;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
/**
 *
 * @author Yanagi
 */
@Controller
@RequestMapping(value = "")
public class ControllerPages {
    @Autowired
    private CongViecService congviecService;

    @RequestMapping(value = "index.htm", method = RequestMethod.GET)
    public String viewHome(ModelMap mm) {
        mm.put("listCongViec", congviecService.getAll());
        return "pages/index";
    }
}
