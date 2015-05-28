package com.Group.model;

import java.util.Date;

/**
 * GroupInfo entity. @author MyEclipse Persistence Tools
 */

public class GroupInfo implements java.io.Serializable {

	// Fields

	private String groupId;
	private String groupName;
	private Date groupSetTime;
	private Integer groupAccount;
	private String groupLeader;
	private String leaderPhone;
	private String otherInfo;
	private String adminId;
	private String passoword;

	// Constructors

	/** default constructor */
	public GroupInfo() {
	}

	/** minimal constructor */
	public GroupInfo(String groupId, String groupName, Date groupSetTime,
			Integer groupAccount, String groupLeader, String leaderPhone,
			String adminId, String passoword) {
		this.groupId = groupId;
		this.groupName = groupName;
		this.groupSetTime = groupSetTime;
		this.groupAccount = groupAccount;
		this.groupLeader = groupLeader;
		this.leaderPhone = leaderPhone;
		this.adminId = adminId;
		this.passoword = passoword;
	}

	/** full constructor */
	public GroupInfo(String groupId, String groupName, Date groupSetTime,
			Integer groupAccount, String groupLeader, String leaderPhone,
			String otherInfo, String adminId, String passoword) {
		this.groupId = groupId;
		this.groupName = groupName;
		this.groupSetTime = groupSetTime;
		this.groupAccount = groupAccount;
		this.groupLeader = groupLeader;
		this.leaderPhone = leaderPhone;
		this.otherInfo = otherInfo;
		this.adminId = adminId;
		this.passoword = passoword;
	}

	// Property accessors

	public String getGroupId() {
		return this.groupId;
	}

	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}

	public String getGroupName() {
		return this.groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	public Date getGroupSetTime() {
		return this.groupSetTime;
	}

	public void setGroupSetTime(Date groupSetTime) {
		this.groupSetTime = groupSetTime;
	}

	public Integer getGroupAccount() {
		return this.groupAccount;
	}

	public void setGroupAccount(Integer groupAccount) {
		this.groupAccount = groupAccount;
	}

	public String getGroupLeader() {
		return this.groupLeader;
	}

	public void setGroupLeader(String groupLeader) {
		this.groupLeader = groupLeader;
	}

	public String getLeaderPhone() {
		return this.leaderPhone;
	}

	public void setLeaderPhone(String leaderPhone) {
		this.leaderPhone = leaderPhone;
	}

	public String getOtherInfo() {
		return this.otherInfo;
	}

	public void setOtherInfo(String otherInfo) {
		this.otherInfo = otherInfo;
	}

	public String getAdminId() {
		return this.adminId;
	}

	public void setAdminId(String adminId) {
		this.adminId = adminId;
	}

	public String getPassoword() {
		return this.passoword;
	}

	public void setPassoword(String passoword) {
		this.passoword = passoword;
	}

}