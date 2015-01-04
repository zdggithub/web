package com.jrj.payment.dao;

import java.sql.SQLException;

import j.d.XDB;
import j.u.XList;
import j.u.XMap;

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
	
	private static final String GET_BORROW_ID = "SELECT * FROM borrow where id =?";
	public static XMap getBorrowById(long id) {
		XMap map = new XMap();
		BorrowDb db = new BorrowDb();
		db.open();
		db.prepareStatement(GET_BORROW_ID);
		db.setParameters(new Object[]{id});
		map = db.querySingleRow();
		db.close();
		return map;
	}
	
	private static final String ALTER_BORROW = "SELECT * FROM borrow";
	public static XList alterBorrow(String product_id) {
		XList map = new XList();
		BorrowDb db = new BorrowDb();
		db.open();
		db.prepareStatement(ALTER_BORROW);
		db.setParameters(new Object[]{product_id});
		map = db.queryRows();
		db.close();
		return map;
	}

	private static final String INSERT_BORROW = "INSERT INTO borrow(userId,totalLoan,annualRate,ctime,monthlyRepayment,totalRepayment,periods,title,purpose,illustrate,state)VALUES(?,?,?,?,?,?,?,?,?,?,?)";

	public static int insertBorrow(Borrow bw) {
		XList map = new XList();
		BorrowDb db = new BorrowDb();
		db.open();
		db.prepareStatement(INSERT_BORROW);
		db.setParameters(new Object[] { bw.getUserId(), bw.getTotalLoan(),
				bw.getAnnualRate(), bw.getCtime(), bw.getMonthlyRepayment(),
				bw.getTotalRepayment(), bw.getPeriods(), bw.getTitle(),
				bw.getPurpose(), bw.getIllustrate(), bw.getState() });
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
	
	private static final String UPDATE_BORROW = "UPDATE borrow SET totalLoan=?,annualRate=?,utime=?,monthlyRepayment=?,totalRepayment=?,periods=?,title=?,purpose=?,illustrate=?,state=? WHERE id=?";
	
	public static int updateBorrow(Borrow bw) {
		XList map = new XList();
		bw.setCtime("");
        BorrowDb db = new BorrowDb();
        db.open();
        db.prepareStatement(UPDATE_BORROW);
        db.setParameters(new Object[]{bw.getTotalLoan(),bw.getAnnualRate(),bw.getUtime(),bw.getMonthlyRepayment(),bw.getTotalRepayment(),bw.getPeriods(),bw.getTitle(),bw.getPurpose(),bw.getIllustrate(),bw.getState(),bw.getId()});
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
	
	
	private static final String UPDATE_STATUS = "UPDATE borrow SET state=state+1 WHERE id=?";
	
	public static int updateStatus(long id) {
		XList map = new XList();
		BorrowDb db = new BorrowDb();
		db.open();
		db.prepareStatement(UPDATE_STATUS);
		db.setParameters(new Object[]{id});
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
