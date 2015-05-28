package com.Group.model;

import java.util.Date;

/**
 * Act entity. @author MyEclipse Persistence Tools
 */

public class Act implements java.io.Serializable {

	// Fields

	private String actId;
	private String actName;
	private Date actStartTime;
	private Date actEndName;
	private String groupId;
	private String actMember;
	private String actFine;
	private String actPlace;
	private String otherInfo;
	private String actReply;

	// Constructors

	/** default constructor */
	public Act() {
	}

	/** minimal constructor */
	public Act(String actId, String actName, Date actStartTime,
			Date actEndName, String groupId, String actMember, String actFine,
			String actPlace) {
		this.actId = actId;
		this.actName = actName;
		this.actStartTime = actStartTime;
		this.actEndName = actEndName;
		this.groupId = groupId;
		this.actMember = actMember;
		this.actFine = actFine;
		this.actPlace = actPlace;
	}

	/** full constructor */
	public Act(String actId, String actName, Date actStartTime,
			Date actEndName, String groupId, String actMember, String actFine,
			String actPlace, String otherInfo, String actReply) {
		this.actId = actId;
		this.actName = actName;
		this.actStartTime = actStartTime;
		this.actEndName = actEndName;
		this.groupId = groupId;
		this.actMember = actMember;
		this.actFine = actFine;
		this.actPlace = actPlace;
		this.otherInfo = otherInfo;
		this.actReply = actReply;
	}

	// Property accessors

	public String getActId() {
		return this.actId;
	}

	public void setActId(String actId) {
		this.actId = actId;
	}

	public String getActName() {
		return this.actName;
	}

	public void setActName(String actName) {
		this.actName = actName;
	}

	public Date getActStartTime() {
		return this.actStartTime;
	}

	public void setActStartTime(Date actStartTime) {
		this.actStartTime = actStartTime;
	}

	public Date getActEndName() {
		return this.actEndName;
	}

	public void setActEndName(Date actEndName) {
		this.actEndName = actEndName;
	}

	public String getGroupId() {
		return this.groupId;
	}

	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}

	public String getActMember() {
		return this.actMember;
	}

	public void setActMember(String actMember) {
		this.actMember = actMember;
	}

	public String getActFine() {
		return this.actFine;
	}

	public void setActFine(String actFine) {
		this.actFine = actFine;
	}

	public String getActPlace() {
		return this.actPlace;
	}

	public void setActPlace(String actPlace) {
		this.actPlace = actPlace;
	}

	public String getOtherInfo() {
		return this.otherInfo;
	}

	public void setOtherInfo(String otherInfo) {
		this.otherInfo = otherInfo;
	}

	public String getActReply() {
		return this.actReply;
	}

	public void setActReply(String actReply) {
		this.actReply = actReply;
	}

}