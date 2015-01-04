package com.jrj.payment.service;

import j.u.XList;
import j.u.XMap;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.stereotype.Component;

import com.jrj.payment.dao.BorrowDb;
import com.jrj.payment.model.Borrow;
@Component("BorrowService")
public class BorrowService {


	public static XList getBorrow() {
//		return null;
		return BorrowDb.getBorrow("");
	}
	public static XMap getBorrowById(Long id) {
//		return null;
		return BorrowDb.getBorrowById(id);
	}
	
	public static int insertBorrow(Borrow bw) {
    	SimpleDateFormat dateFormat  = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    	String ctime = dateFormat.format(new Date());
    	bw.setCtime(ctime);
    	bw.setUserId("jack");
    	bw.setState(0);
		return BorrowDb.insertBorrow(bw);
	}

	public static int updateBorrow(Borrow bw) {
		SimpleDateFormat dateFormat  = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    	String utime = dateFormat.format(new Date());
    	bw.setUtime(utime);
    	bw.setId(22L);
		return BorrowDb.updateBorrow(bw);
	}
	
	public static int updateStatus(long id) {
		
		return BorrowDb.updateStatus(id);
	}
}
