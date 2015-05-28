package com.Group.control;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.Group.dao.GroupInfoDAO;
import com.Group.factory.HibernateSessionFactory;
import com.Group.model.GroupInfo;

public class GroupInfoControl {
	
	
	private static GroupInfoControl groupInfoControl = null;
	public static GroupInfoControl getGroupControl(){
		if(groupInfoControl == null){
			groupInfoControl = new GroupInfoControl();
		}
		return groupInfoControl;
	}

		GroupInfoDAO groupInfoDao = null;
		Session session = null;
		
		private GroupInfoControl(){
			groupInfoDao = new GroupInfoDAO();
			session = HibernateSessionFactory.getSession();
		}
		
		public void save(GroupInfo groupInfo)
		{
			Transaction transaction = session.beginTransaction();
			groupInfoDao.save(groupInfo);
			transaction.commit();
			session.flush();
		}
		public GroupInfo findByID (String str){
			Transaction transaction = session.beginTransaction();
			String groupID = str;
			GroupInfo findGroup = new GroupInfo();
			findGroup = groupInfoDao.findById(groupID);
			transaction.commit();
			//if(findGroup.getGroupLeader().equals("ÀîÓÂ")) System.out.print("Æ¥Åä³É¹¦£¡µÇÂ¼");
			//else System.out.print("Æ¥ÅäÊ§°Ü£¡ÎÞ·¨µÇÂ¼");
			session.flush();
			return findGroup;
		}
//		public GroupInfo findByName (String str){
//			Transaction transaction = session.beginTransaction();
//			String groupName = str;
//			GroupInfo findGroup = new GroupInfo();
//			findGroup = groupInfoDao.findById(groupName);
//			transaction.commit();
//			//if(findGroup.getGroupLeader().equals("ÀîÓÂ")) System.out.print("Æ¥Åä³É¹¦£¡µÇÂ¼");
//			//else System.out.print("Æ¥ÅäÊ§°Ü£¡ÎÞ·¨µÇÂ¼");
//			session.flush();
//			return findGroup;
//		}
		public void delete(GroupInfo groupInfo)
		{
			Transaction transaction = session.beginTransaction();
			groupInfoDao.delete(groupInfo);
			transaction.commit();
			session.flush();
		}
		
		



}

