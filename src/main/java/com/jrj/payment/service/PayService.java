package com.jrj.payment.service;

import j.u.XList;
import j.u.XMap;

import org.springframework.stereotype.Component;

import com.jrj.payment.dao.PayDb;
@Component("payService")
public class PayService {
	
	
	
	public static XMap getPayByid(String product_id){
		return PayDb.getPayByid(product_id);
		
	}
	
	
	public static XList getPays() {
		return PayDb.getPays("");
	}
	


}
