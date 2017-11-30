package com.csigroup.entity;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;


/**
 * The persistent class for the tblAuthMAuthorize database table.
 * 
 */
@Entity
@Table(name="tblAuthMAuthorize")
@NamedQuery(name="AuthMAuthorize.findAll", query="SELECT a FROM AuthMAuthorize a")
public class AuthMAuthorize implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="AuthorizedId")
	private int authorizedId;

	@Column(name="CreateBy")
	private String createBy;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="CreateDate")
	private Date createDate;

	@Column(name="ProgramCode")
	private String programCode;

	@Column(name="RoleShortName")
	private String roleShortName;

	@Column(name="UpdateBy")
	private String updateBy;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="UpdateDate")
	private Date updateDate;

	@Transient
	private int version;

	public AuthMAuthorize() {
	}

	public int getAuthorizedId() {
		return this.authorizedId;
	}

	public void setAuthorizedId(int authorizedId) {
		this.authorizedId = authorizedId;
	}

	public String getCreateBy() {
		return this.createBy;
	}

	public void setCreateBy(String createBy) {
		this.createBy = createBy;
	}

	public Object getCreateDate() {
		return this.createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public String getProgramCode() {
		return this.programCode;
	}

	public void setProgramCode(String programCode) {
		this.programCode = programCode;
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

	public void setUpdateDate(Timestamp updateDate) {
		this.updateDate = updateDate;
	}

	public int getVersion() {
		return this.version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

}