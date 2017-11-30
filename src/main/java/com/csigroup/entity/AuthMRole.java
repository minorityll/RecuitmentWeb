package com.csigroup.entity;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.fasterxml.jackson.annotation.JsonBackReference;


/**
 * The persistent class for the tblAuthMRole database table.
 * 
 */
@Entity
@Table(name="tblAuthMRole")
@NamedQuery(name="AuthMRole.findAll", query="SELECT a FROM AuthMRole a")
public class AuthMRole implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO) 
	@Column(name="RoleId")
	private int roleId;

	@Column(name="CreateBy")
	private String createBy;

	@Column(name="CreateDate")
	private Timestamp createDate;

	@Column(name="IsStandardRole")
	private String isStandardRole;

	@Column(name="RoleFullName")
	private String roleFullName;

	@Column(name="RoleShortName")
	private String roleShortName;

	@Column(name="UpdateBy")
	private String updateBy;

	@Column(name="UpdateDate")
	private Timestamp updateDate;

	@Transient
	private int version;
	
	@OneToMany(mappedBy = "role", fetch = FetchType.EAGER)
	@JsonBackReference
    private List<AuthMRoleMenu> roleMenu;

	public AuthMRole() {
	}

	public int getRoleId() {
		return this.roleId;
	}

	public void setRoleId(int roleId) {
		this.roleId = roleId;
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

	public String getIsStandardRole() {
		return this.isStandardRole;
	}

	public void setIsStandardRole(String isStandardRole) {
		this.isStandardRole = isStandardRole;
	}

	public String getRoleFullName() {
		return this.roleFullName;
	}

	public void setRoleFullName(String roleFullName) {
		this.roleFullName = roleFullName;
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

	public List<AuthMRoleMenu> getRoleMenu() {
		return roleMenu;
	}

	public void setRoleMenu(List<AuthMRoleMenu> roleMenu) {
		this.roleMenu = roleMenu;
	}

}