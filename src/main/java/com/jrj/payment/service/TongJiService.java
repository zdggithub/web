package com.jrj.payment.service;

import j.u.XList;
import j.u.XMap;

import org.springframework.stereotype.Component;

import com.jrj.payment.dao.PayDb;
import com.jrj.payment.dao.TongJiDb;
@Component("TongJiService")
public class TongJiService {


	public static XList getNum() {
		return TongJiDb.getNum("");
	}

}
