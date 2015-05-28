package com.Group.control;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.Group.dao.ActDAO;
import com.Group.factory.HibernateSessionFactory;
import com.Group.model.Act;
import com.Group.model.Admin;

public class ActControl {
	
	private static ActControl control = null;
	public static ActControl getAdminControl(){
		if(control == null){
			control = new ActControl();
		}
		return control;
	}
	
	ActDAO actDao = null;
	Session session = null;
	
	private ActControl(){
		actDao = new ActDAO();
		session = HibernateSessionFactory.getSession();
	}
	public void save(Act act){
		Transaction transaction = session.beginTransaction();
		actDao.save(act);
		transaction.commit();
		session.flush();
	}
	public Act find (String str){
		Transaction transaction = session.beginTransaction();
		String ID = str;
		Act findAct = new Act();
		findAct=actDao.findById(ID);
		transaction.commit();
		
		//if(findAdmin.getAdminPassword().equals("14")) System.out.print("Æ¥Åä³É¹¦£¡µÇÂ¼");
		//else System.out.print("Æ¥ÅäÊ§°Ü£¡ÎÞ·¨µÇÂ¼");
		session.flush();
		return findAct;
	}
	public void delete(Act act){
		Transaction transaction = session.beginTransaction();
		actDao.delete(act);
		transaction.commit();
		session.flush();
	}
	public List findAll()
	{
		Transaction transaction = session.beginTransaction();
		List allList = actDao.findAll();
		transaction.commit();
		session.flush();
		return allList;
	}
}
	