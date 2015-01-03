package com.jrj.payment.service;

import j.u.XList;

import org.springframework.stereotype.Component;

import com.jrj.payment.dao.BorrowDb;
import com.jrj.payment.model.Borrow;
@Component("BorrowService")
public class BorrowService {


	public static XList getBorrow() {
//		return null;
		return BorrowDb.getBorrow("");
	}
	
	public static int insertBorrow(Borrow bw) {
//		return null;
		return BorrowDb.insertBorrow(bw);
	}

}
