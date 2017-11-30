package com.csigroup.entity;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.fasterxml.jackson.annotation.JsonManagedReference;


/**
 * The persistent class for the tblAuthMRoleMenu database table.
 * 
 */
@Entity
@Table(name="tblAuthMRoleMenu")
@NamedQuery(name="AuthMRoleMenu.findAll", query="SELECT a FROM AuthMRoleMenu a")
public class AuthMRoleMenu implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="RoleMenuId")
	private int roleMenuId;

	@Column(name="CreateBy")
	private String createBy;

	@Column(name="CreateDate")
	private Timestamp createDate;

	@Column(name="ItemType")
	private String itemType;

	@Column(name="MenuLevel")
	private int menuLevel;

	@Column(name="MenuNameEn")
	private String menuNameEn;

	@Column(name="MenuNameTh")
	private String menuNameTh;

	@Column(name="ParentMenuId")
	private Integer parentMenuId;

	@Column(name="ProgramId")
	private Integer programId;

	@Column(name="RoleId")
	private int roleId;

	@Column(name="SeqNo")
	private int seqNo;

	@Column(name="UpdateBy")
	private String updateBy;

	@Column(name="UpdateDate")
	private Timestamp updateDate;

	@Transient
	private int version;
	
	@JoinColumn(name = "ProgramId", insertable = false , updatable = false)
	@ManyToOne(targetEntity = AuthMProgram.class)
	@JsonManagedReference
	private AuthMProgram program;
	
	@JoinColumn(name = "RoleId", insertable = false , updatable = false)
	@ManyToOne
	@JsonManagedReference
	private AuthMRole role;

	public AuthMRoleMenu() {
	}

	public int getRoleMenuId() {
		return this.roleMenuId;
	}

	public void setRoleMenuId(int roleMenuId) {
		this.roleMenuId = roleMenuId;
	}

	public String getCreateBy() {
		return this.createBy;
	}

	public void setCreateBy(String createBy) {
		this.createBy = createBy;
	}

	public Timestamp getCreateDate() {
		return this.createDate;
	}

	public void setCreateDate(Timestamp createDate) {
		this.createDate = createDate;
	}

	public String getItemType() {
		return this.itemType;
	}

	public void setItemType(String itemType) {
		this.itemType = itemType;
	}

	public int getMenuLevel() {
		return this.menuLevel;
	}

	public void setMenuLevel(int menuLevel) {
		this.menuLevel = menuLevel;
	}

	public String getMenuNameEn() {
		return this.menuNameEn;
	}

	public void setMenuNameEn(String menuNameEn) {
		this.menuNameEn = menuNameEn;
	}

	public String getMenuNameTh() {
		return this.menuNameTh;
	}

	public void setMenuNameTh(String menuNameTh) {
		this.menuNameTh = menuNameTh;
	}

	public int getRoleId() {
		return this.roleId;
	}

	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}

	public int getSeqNo() {
		return this.seqNo;
	}

	public void setSeqNo(int seqNo) {
		this.seqNo = seqNo;
	}

	public String getUpdateBy() {
		return this.updateBy;
	}

	public void setUpdateBy(String updateBy) {
		this.updateBy = updateBy;
	}

	public Timestamp getUpdateDate() {
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

	public AuthMProgram getProgram() {
		return program;
	}

	public void setProgram(AuthMProgram program) {
		this.program = program;
	}

	public AuthMRole getRole() {
		return role;
	}

	public void setRole(AuthMRole role) {
		this.role = role;
	}

	public Integer getParentMenuId() {
		return parentMenuId;
	}

	public void setParentMenuId(Integer parentMenuId) {
		this.parentMenuId = parentMenuId;
	}

	public Integer getProgramId() {
		return programId;
	}

	public void setProgramId(Integer programId) {
		this.programId = programId;
	}

}