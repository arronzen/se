package com.Group.dao;

import java.util.List;

import org.hibernate.LockOptions;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.Group.model.Act;

/**
 * A data access object (DAO) providing persistence and search support for Act
 * entities. Transaction control of the save(), update() and delete() operations
 * can directly support Spring container-managed transactions or they can be
 * augmented to handle user-managed Spring transactions. Each of these methods
 * provides additional information for how to configure it for the desired type
 * of transaction control.
 * 
 * @see com.Group.dao.Act
 * @author MyEclipse Persistence Tools
 */
public class ActDAO extends BaseHibernateDAO {
	private static final Logger log = LoggerFactory.getLogger(ActDAO.class);
	// property constants
	public static final String ACT_NAME = "actName";
	public static final String GROUP_ID = "groupId";
	public static final String ACT_MEMBER = "actMember";
	public static final String ACT_FINE = "actFine";
	public static final String ACT_PLACE = "actPlace";
	public static final String OTHER_INFO = "otherInfo";
	public static final String ACT_REPLY = "actReply";

	public void save(Act transientInstance) {
		log.debug("saving Act instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Act persistentInstance) {
		log.debug("deleting Act instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Act findById(java.lang.String id) {
		log.debug("getting Act instance with id: " + id);
		try {
			Act instance = (Act) getSession().get("com.Group.model.Act", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Act instance) {
		log.debug("finding Act instance by example");
		try {
			List results = getSession().createCriteria("com.Group.model.Act")
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
		log.debug("finding Act instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Act as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByActName(Object actName) {
		return findByProperty(ACT_NAME, actName);
	}

	public List findByGroupId(Object groupId) {
		return findByProperty(GROUP_ID, groupId);
	}

	public List findByActMember(Object actMember) {
		return findByProperty(ACT_MEMBER, actMember);
	}

	public List findByActFine(Object actFine) {
		return findByProperty(ACT_FINE, actFine);
	}

	public List findByActPlace(Object actPlace) {
		return findByProperty(ACT_PLACE, actPlace);
	}

	public List findByOtherInfo(Object otherInfo) {
		return findByProperty(OTHER_INFO, otherInfo);
	}

	public List findByActReply(Object actReply) {
		return findByProperty(ACT_REPLY, actReply);
	}

	public List findAll() {
		log.debug("finding all Act instances");
		try {
			String queryString = "from Act";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Act merge(Act detachedInstance) {
		log.debug("merging Act instance");
		try {
			Act result = (Act) getSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Act instance) {
		log.debug("attaching dirty Act instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Act instance) {
		log.debug("attaching clean Act instance");
		try {
			getSession().buildLockRequest(LockOptions.NONE).lock(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}