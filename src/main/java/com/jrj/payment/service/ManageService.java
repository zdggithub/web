package com.jrj.payment.service;

import j.u.XList;

import org.springframework.stereotype.Component;

import com.jrj.payment.dao.ManageDb;
@Component("ManageService")
public class ManageService {


	public static XList getBorrow() {
//		return null;
		return ManageDb.getBorrow("");
	}
}
