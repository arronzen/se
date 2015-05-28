package com.Group.control;

import javax.swing.JOptionPane;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.Group.dao.AdminDAO;
import com.Group.factory.HibernateSessionFactory;
import com.Group.model.Admin;

public class AdminControl {
	
	private static AdminControl control = null;
	public static AdminControl getAdminControl(){
		if(control == null){
			control = new AdminControl();
		}
		return control;
	}
	
	AdminDAO adminDao = null;
	Session session = null;
	
	private AdminControl(){
		adminDao = new AdminDAO();
		session = HibernateSessionFactory.getSession();
	}
	
	public void save(Admin admin){
		Transaction transaction = session.beginTransaction();
		adminDao.save(admin);
		transaction.commit();
		session.flush();
	}
	public Admin find (String str){
		Transaction transaction = session.beginTransaction();
		String userName = str;
		Admin findAdmin = new Admin();
		findAdmin=adminDao.findById(userName);
		transaction.commit();
		
		//if(findAdmin.getAdminPassword().equals("14")) System.out.print("Æ¥Åä³É¹¦£¡µÇÂ¼");
		//else System.out.print("Æ¥ÅäÊ§°Ü£¡ÎÞ·¨µÇÂ¼");
		session.flush();
	    return findAdmin;
	}
	public void delete(Admin admin){
		Transaction transaction = session.beginTransaction();
		adminDao.delete(admin);
		transaction.commit();
		session.flush();
	}

}
