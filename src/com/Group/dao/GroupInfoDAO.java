package com.Group.dao;

import java.util.List;

import org.hibernate.LockOptions;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.Group.model.GroupInfo;

/**
 * A data access object (DAO) providing persistence and search support for
 * GroupInfo entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.Group.dao.GroupInfo
 * @author MyEclipse Persistence Tools
 */
public class GroupInfoDAO extends BaseHibernateDAO {
	private static final Logger log = LoggerFactory
			.getLogger(GroupInfoDAO.class);
	// property constants
	public static final String GROUP_NAME = "groupName";
	public static final String GROUP_ACCOUNT = "groupAccount";
	public static final String GROUP_LEADER = "groupLeader";
	public static final String LEADER_PHONE = "leaderPhone";
	public static final String OTHER_INFO = "otherInfo";
	public static final String ADMIN_ID = "adminId";
	public static final String PASSOWORD = "passoword";

	public void save(GroupInfo transientInstance) {
		log.debug("saving GroupInfo instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(GroupInfo persistentInstance) {
		log.debug("deleting GroupInfo instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public GroupInfo findById(java.lang.String id) {
		log.debug("getting GroupInfo instance with id: " + id);
		try {
			GroupInfo instance = (GroupInfo) getSession().get(
					"com.Group.model.GroupInfo", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(GroupInfo instance) {
		log.debug("finding GroupInfo instance by example");
		try {
			List results = getSession()
					.createCriteria("com.Group.model.GroupInfo")
					.add(Example.create(instance)).list();
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List findByProperty(String propertyName, Object value) {
		log.debug("finding GroupInfo instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from GroupInfo as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByGroupName(Object groupName) {
		return findByProperty(GROUP_NAME, groupName);
	}

	public List findByGroupAccount(Object groupAccount) {
		return findByProperty(GROUP_ACCOUNT, groupAccount);
	}

	public List findByGroupLeader(Object groupLeader) {
		return findByProperty(GROUP_LEADER, groupLeader);
	}

	public List findByLeaderPhone(Object leaderPhone) {
		return findByProperty(LEADER_PHONE, leaderPhone);
	}

	public List findByOtherInfo(Object otherInfo) {
		return findByProperty(OTHER_INFO, otherInfo);
	}

	public List findByAdminId(Object adminId) {
		return findByProperty(ADMIN_ID, adminId);
	}

	public List findByPassoword(Object passoword) {
		return findByProperty(PASSOWORD, passoword);
	}

	public List findAll() {
		log.debug("finding all GroupInfo instances");
		try {
			String queryString = "from GroupInfo";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public GroupInfo merge(GroupInfo detachedInstance) {
		log.debug("merging GroupInfo instance");
		try {
			GroupInfo result = (GroupInfo) getSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(GroupInfo instance) {
		log.debug("attaching dirty GroupInfo instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(GroupInfo instance) {
		log.debug("attaching clean GroupInfo instance");
		try {
			getSession().buildLockRequest(LockOptions.NONE).lock(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}