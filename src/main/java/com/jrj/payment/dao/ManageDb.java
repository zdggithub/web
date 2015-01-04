package com.jrj.payment.dao;

import java.sql.SQLException;

import j.d.XDB;
import j.u.XList;

import com.jrj.payment.model.Borrow;

/**
 * @author 作者 Joe
 * @version
 * @date 创建时间：2014-7-30 下午2:03:11
 */
public class ManageDb extends XDB {

/*	@Override
	protected String getPooledConnName() {
		// TODO Auto-generated method stub
		return "pay";
	}*/
	
	protected String getPooledConnName() {
		// TODO Auto-generated method stub
		return "borrow";
	}
		
	
	private static final String GET_BORROW = "SELECT * FROM borrow";
	public static XList getBorrow(String product_id) {
		XList map = new XList();
        ManageDb db = new ManageDb();
        db.open();
        db.prepareStatement(GET_BORROW);
        db.setParameters(new Object[]{product_id});
        map = db.queryRows();
        db.close();
        return map;
    }
}
