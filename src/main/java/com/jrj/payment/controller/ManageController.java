package com.jrj.payment.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jrj.payment.model.Borrow;
import com.jrj.payment.service.ManageService;


@Controller
@RequestMapping(value = "/com/")
public class ManageController {
    
	@Autowired
	private ManageService ManageService;
   
    @RequestMapping("manage")
    public String aaa(HttpServletRequest res,String id) throws Exception {
  	
    	res.setAttribute("manage", ManageService.getBorrow());
    	
    	return "/manage";
    }
}
		