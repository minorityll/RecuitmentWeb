package com.csigroup.entity;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

import com.fasterxml.jackson.annotation.JsonBackReference;


/**
 * The persistent class for the tblAuthMUserRole database table.
 * 
 */
@Entity
@Table(name="tblAuthMUserRole")
@NamedQuery(name="AuthMUserRole.findAll", query="SELECT a FROM AuthMUserRole a")
public class AuthMUserRole implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="UserRoleId")
	private int userRoleId;

	@Column(name="CreateBy")
	private String createBy;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="CreateDate")
	private Date createDate;

	@Column(name="LoginId")
	private int loginId;

	@Column(name="RoleShortName")
	private String roleShortName;

	@Column(name="UpdateBy")
	private String updateBy;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="UpdateDate")
	private Date updateDate;

	@Transient
	private int version;
	
	@JoinColumn(name = "LoginId", insertable = false , updatable = false)
	@ManyToOne
	@JsonBackReference
	private AuthMUser user;

	public AuthMUser getUser() {
		return user;
	}

	public void setUser(AuthMUser user) {
		this.user = user;
	}

	public AuthMUserRole() {
	}

	public int getUserRoleId() {
		return this.userRoleId;
	}

	public void setUserRoleId(int userRoleId) {
		this.userRoleId = userRoleId;
	}

	public String getCreateBy() {
		return this.createBy;
	}

	public void setCreateBy(String createBy) {
		this.createBy = createBy;
	}

	public Date getCreateDate() {
		return this.createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public int getLoginId() {
		return this.loginId;
	}

	public void setLoginId(int loginId) {
		this.loginId = loginId;
	}

	public String getRoleShortName() {
		return this.roleShortName;
	}

	public void setRoleShortName(String roleShortName) {
		this.roleShortName = roleShortName;
	}

	public String getUpdateBy() {
		return this.updateBy;
	}

	public void setUpdateBy(String updateBy) {
		this.updateBy = updateBy;
	}

	public Date getUpdateDate() {
		return this.updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

	public int getVersion() {
		return this.version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

}