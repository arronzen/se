package com.Group.model;

/**
 * Admin entity. @author MyEclipse Persistence Tools
 */

public class Admin implements java.io.Serializable {

	// Fields

	private String adminId;
	private String adminPassword;
	private String adminType;

	// Constructors

	/** default constructor */
	public Admin() {
	}

	/** full constructor */
	public Admin(String adminId, String adminPassword, String adminType) {
		this.adminId = adminId;
		this.adminPassword = adminPassword;
		this.adminType = adminType;
	}

	// Property accessors

	public String getAdminId() {
		return this.adminId;
	}

	public void setAdminId(String adminId) {
		this.adminId = adminId;
	}

	public String getAdminPassword() {
		return this.adminPassword;
	}

	public void setAdminPassword(String adminPassword) {
		this.adminPassword = adminPassword;
	}

	public String getAdminType() {
		return this.adminType;
	}

	public void setAdminType(String adminType) {
		this.adminType = adminType;
	}

}