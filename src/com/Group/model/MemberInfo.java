package com.Group.model;

/**
 * MemberInfo entity. @author MyEclipse Persistence Tools
 */

public class MemberInfo implements java.io.Serializable {

	// Fields

	private String memberId;
	private String groupId;
	private String memberName;
	private Integer memberGrade;
	private String memberPhone;
	private String memberpost;
	private String otherInfo;

	// Constructors

	/** default constructor */
	public MemberInfo() {
	}

	/** minimal constructor */
	public MemberInfo(String memberId, String groupId, String memberName,
			Integer memberGrade, String memberPhone, String memberpost) {
		this.memberId = memberId;
		this.groupId = groupId;
		this.memberName = memberName;
		this.memberGrade = memberGrade;
		this.memberPhone = memberPhone;
		this.memberpost = memberpost;
	}

	/** full constructor */
	public MemberInfo(String memberId, String groupId, String memberName,
			Integer memberGrade, String memberPhone, String memberpost,
			String otherInfo) {
		this.memberId = memberId;
		this.groupId = groupId;
		this.memberName = memberName;
		this.memberGrade = memberGrade;
		this.memberPhone = memberPhone;
		this.memberpost = memberpost;
		this.otherInfo = otherInfo;
	}

	// Property accessors

	public String getMemberId() {
		return this.memberId;
	}

	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	public String getGroupId() {
		return this.groupId;
	}

	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}

	public String getMemberName() {
		return this.memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	public Integer getMemberGrade() {
		return this.memberGrade;
	}

	public void setMemberGrade(Integer memberGrade) {
		this.memberGrade = memberGrade;
	}

	public String getMemberPhone() {
		return this.memberPhone;
	}

	public void setMemberPhone(String memberPhone) {
		this.memberPhone = memberPhone;
	}

	public String getMemberpost() {
		return this.memberpost;
	}

	public void setMemberpost(String memberpost) {
		this.memberpost = memberpost;
	}

	public String getOtherInfo() {
		return this.otherInfo;
	}

	public void setOtherInfo(String otherInfo) {
		this.otherInfo = otherInfo;
	}

}