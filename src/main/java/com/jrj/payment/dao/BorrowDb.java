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
public class BorrowDb extends XDB {

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
        BorrowDb db = new BorrowDb();
        db.open();
        db.prepareStatement(GET_BORROW);
        db.setParameters(new Object[]{product_id});
        map = db.queryRows();
        db.close();
        return map;
    }

	private static final String INSERT_BORROW = "INSERT INTO borrow(totalLoan,annualRate,periods,title,purpose,illustrate)VALUES(?,?,?,?,?,?)";
	public static int insertBorrow(Borrow bw) {
//	public static XList insertBorrow(List<String>[] arr) {
		XList map = new XList();
		bw.setCtime("");
        BorrowDb db = new BorrowDb();
        db.open();
        db.prepareStatement(INSERT_BORROW);
        db.setParameters(new Object[]{bw.getTotalLoan(),bw.getAnnualRate(),bw.getPeriods(),bw.getTitle(),bw.getPurpose(),bw.getIllustrate()});
//      db.setParameters(new Object[]{arr[8]});
//        map = db.queryRows();
        int res = 0;
		try {
			res = db.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        db.close();
        return res;
    }
}
