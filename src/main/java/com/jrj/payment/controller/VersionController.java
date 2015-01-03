package com.jrj.payment.controller;

import j.u.XMap;

import java.io.InputStream;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.jrj.payment.service.PayService;
import com.jrj.payment.service.TongJiService;


@Controller
@RequestMapping(value = "/com/")
public class VersionController {
    
	@Autowired
	private PayService payService;
    @RequestMapping(value = "test")
    public @ResponseBody String exp(InputStream is) throws Exception {
//    	System.out.println("dddd");
    	return "Hello world!";
    }
    
    @RequestMapping("ttt")
    public String aaa(HttpServletRequest res,String id) throws Exception {
    	System.out.println("dddd");
//    	return "home";
//    	ModelAndView a = new ModelAndView("/home");
//    	a.addObject("username", "zhengdegui");
    	
    	if(id == null || id.equals("")){
    		id = "1";
    	}
    	
    	XMap map = payService.getPayByid(id);
    	res.setAttribute("username", "zhengdegui");
    	res.setAttribute("data", map);
//    	res.setAttribute("list", payService.getPays());
    	res.setAttribute("tongji", TongJiService.getNum());
    	res.setAttribute("abc", "你好！");
//    	return a;
//    	return new ModelAndView("");
    	return "/home";
    }
}
