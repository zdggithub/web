package com.jrj.payment.dao;

import j.d.XDB;
import j.u.XList;
import j.u.XMap;

import java.math.BigDecimal;

/**
 * @author 作者 Joe
 * @version
 * @date 创建时间：2014-7-30 下午2:03:11
 */
public class TongJiDb extends XDB {

/*	@Override
	protected String getPooledConnName() {
		// TODO Auto-generated method stub
		return "pay";
	}*/
	
	protected String getPooledConnName() {
		// TODO Auto-generated method stub
		return "daikuan";
	}
		
	
	private static final String GET_NUM= "SELECT * FROM jiekuan";
	public static XList getNum(String product_id) {
		XList map = new XList();
        TongJiDb db = new TongJiDb();
        db.open();
        db.prepareStatement(GET_NUM);
        db.setParameters(new Object[]{product_id});
        map = db.queryRows();
        db.close();
        return map;
    }

}
