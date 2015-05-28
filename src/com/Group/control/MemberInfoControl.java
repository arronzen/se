package com.Group.control;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.Group.dao.MemberInfoDAO;
import com.Group.factory.HibernateSessionFactory;
import com.Group.model.MemberInfo;

public class MemberInfoControl {
	private static MemberInfoControl memberInfoControl = null;
	public static MemberInfoControl getMemberInfoControl(){
		if(memberInfoControl == null){
			memberInfoControl = new MemberInfoControl();
		}
		return memberInfoControl;
	}

		MemberInfoDAO memberInfoDao = null;
		Session session = null;
		
		private MemberInfoControl(){
			memberInfoDao = new MemberInfoDAO();
			session = HibernateSessionFactory.getSession();
		}
		
		public void save(MemberInfo memberInfo)
		{
			Transaction transaction = session .beginTransaction();
			
		//	Transaction transaction = session.beginTransaction();
			memberInfoDao.save(memberInfo);
			transaction.commit();
			session.flush();
		}
		
		public MemberInfo findByID (String str){
			Transaction transaction = session.beginTransaction();
			String memberID = str;
			MemberInfo findMember = new MemberInfo();
			findMember = memberInfoDao.findById(memberID);
			transaction.commit();
			//if(findGroup.getGroupLeader().equals("ÀîÓÂ")) System.out.print("Æ¥Åä³É¹¦£¡µÇÂ¼");
			//else System.out.print("Æ¥ÅäÊ§°Ü£¡ÎÞ·¨µÇÂ¼");
			session.flush();
			return findMember;
		}
		
		public void delete(MemberInfo memberInfo)
		{
			Transaction transaction = session.beginTransaction();
			memberInfoDao.delete(memberInfo);
			transaction.commit();
			session.flush();
		}
		
		




}
