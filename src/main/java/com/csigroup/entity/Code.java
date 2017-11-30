package com.csigroup.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Date;


/**
 * The persistent class for the tblCode database table.
 * 
 */
@Entity
@Table(name="tblCode")
@NamedQuery(name="Code.findAll", query="SELECT c FROM Code c")
public class Code implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private CodePK id;

	@Column(name="Active")
	private String active;

	@Column(name="CodeDesc")
	private String codeDesc;

	@Column(name="CreatedBy")
	private String createdBy;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="CreatedDate")
	private Date createdDate;

	@Column(name="Remark")
	private String remark;

	@Column(name="UpdatedBy")
	private String updatedBy;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="UpdatedDate")
	private Date updatedDate;

	public Code() {
	}

	public CodePK getId() {
		return this.id;
	}

	public void setId(CodePK id) {
		this.id = id;
	}

	public String getActive() {
		return this.active;
	}

	public void setActive(String active) {
		this.active = active;
	}

	public String getCodeDesc() {
		return this.codeDesc;
	}

	public void setCodeDesc(String codeDesc) {
		this.codeDesc = codeDesc;
	}

	public String getCreatedBy() {
		return this.createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public Date getCreatedDate() {
		return this.createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getUpdatedBy() {
		return this.updatedBy;
	}

	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}

	public Date getUpdatedDate() {
		return this.updatedDate;
	}

	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}

}