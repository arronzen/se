package com.Group.dao;

import java.util.List;

import org.hibernate.LockOptions;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.Group.model.MemberInfo;

/**
 * A data access object (DAO) providing persistence and search support for
 * MemberInfo entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.Group.dao.MemberInfo
 * @author MyEclipse Persistence Tools
 */
public class MemberInfoDAO extends BaseHibernateDAO {
	private static final Logger log = LoggerFactory
			.getLogger(MemberInfoDAO.class);
	// property constants
	public static final String GROUP_ID = "groupId";
	public static final String MEMBER_NAME = "memberName";
	public static final String MEMBER_GRADE = "memberGrade";
	public static final String MEMBER_PHONE = "memberPhone";
	public static final String MEMBERPOST = "memberpost";
	public static final String OTHER_INFO = "otherInfo";

	public void save(MemberInfo transientInstance) {
		log.debug("saving MemberInfo instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(MemberInfo persistentInstance) {
		log.debug("deleting MemberInfo instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public MemberInfo findById(java.lang.String id) {
		log.debug("getting MemberInfo instance with id: " + id);
		try {
			MemberInfo instance = (MemberInfo) getSession().get(
					"com.Group.model.MemberInfo", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(MemberInfo instance) {
		log.debug("finding MemberInfo instance by example");
		try {
			List results = getSession()
					.createCriteria("com.Group.model.MemberInfo")
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
		log.debug("finding MemberInfo instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from MemberInfo as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByGroupId(Object groupId) {
		return findByProperty(GROUP_ID, groupId);
	}

	public List findByMemberName(Object memberName) {
		return findByProperty(MEMBER_NAME, memberName);
	}

	public List findByMemberGrade(Object memberGrade) {
		return findByProperty(MEMBER_GRADE, memberGrade);
	}

	public List findByMemberPhone(Object memberPhone) {
		return findByProperty(MEMBER_PHONE, memberPhone);
	}

	public List findByMemberpost(Object memberpost) {
		return findByProperty(MEMBERPOST, memberpost);
	}

	public List findByOtherInfo(Object otherInfo) {
		return findByProperty(OTHER_INFO, otherInfo);
	}

	public List findAll() {
		log.debug("finding all MemberInfo instances");
		try {
			String queryString = "from MemberInfo";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public MemberInfo merge(MemberInfo detachedInstance) {
		log.debug("merging MemberInfo instance");
		try {
			MemberInfo result = (MemberInfo) getSession().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(MemberInfo instance) {
		log.debug("attaching dirty MemberInfo instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(MemberInfo instance) {
		log.debug("attaching clean MemberInfo instance");
		try {
			getSession().buildLockRequest(LockOptions.NONE).lock(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}