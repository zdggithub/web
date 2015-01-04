package com.jrj.payment.controller;

import j.u.XMap;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jrj.payment.model.Borrow;
import com.jrj.payment.service.BorrowService;


@Controller
@RequestMapping(value = "/com/")
public class BorrowController {
    
	@Autowired
	private BorrowService BorrowService;
//    @RequestMapping(value = "test")
//    public @ResponseBody String exp(InputStream is) throws Exception {
////    	System.out.println("dddd");
//    	return "Hello world!";
//    }
//    
    @RequestMapping("borrow")
    public String aaa(HttpServletRequest res,String id) throws Exception {
  	
    	res.setAttribute("borrow", BorrowService.getBorrow());
    	
    	return "/borrow";
    }
    
    @RequestMapping("addBorrow")
    public String addBorrow(HttpServletRequest res,String id) throws Exception {

//    	res.setAttribute("borrow", BorrowService.getBorrow());
    	
    	return "/addBorrow";
    }
    
    @RequestMapping("insertBorrow")
    public String insertBorrow(HttpServletRequest res,Borrow bw) throws Exception {
    	res.setAttribute("borrow", BorrowService.insertBorrow(bw));
    	return "redirect:/com/borrow";
    }
    
    @RequestMapping("updateBorrow")
    public String updateBorrow(HttpServletRequest res,Borrow bw) throws Exception {
    	res.setAttribute("borrow", BorrowService.updateBorrow(bw));
    	return "redirect:/com/borrow";
    }
    @RequestMapping("updateStatus")
    public @ResponseBody String updateStatus(long id) throws Exception {
    	System.out.println(id);
    	BorrowService.updateStatus(id);
    	XMap map = BorrowService.getBorrowById(id);
//    	res.setAttribute("borrow", BorrowService.updateStatus());
    	return map.toJSON();
    }
    
}
		