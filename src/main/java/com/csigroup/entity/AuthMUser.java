package com.csigroup.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

import com.fasterxml.jackson.annotation.JsonManagedReference;


/**
 * The persistent class for the tblAuthMUser database table.
 * 
 */
@Entity
@Table(name="tblAuthMUser")
@NamedQuery(name="AuthMUser.findAll", query="SELECT a FROM AuthMUser a")
public class AuthMUser implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Id")
	private int id;

	@Column(name="CreateBy")
	private String createBy;

	@Column(name="CreateDate")
	private Date createDate;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="ExpireDateFrom")
	private Date expireDateFrom;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="ExpireDateTo")
	private Date expireDateTo;

	@Column(name="PassWord")
	private String passWord;

	@Column(name="RefAppFormId")
	private String refAppFormId;

	@Column(name="UpdateBy")
	private String updateBy;

	@Column(name="UpdateDate")
	private Date updateDate;

	@Column(name="UserName")
	private String userName;

	@Column(name="UserType")
	private char userType;

	@Transient
	private int version;
	
	@OneToMany(mappedBy = "user", fetch = FetchType.EAGER)
	@JsonManagedReference
    private List<AuthMUserRole> authUserRoles;
	
	@JoinColumn(name = "RefAppFormId", insertable = false , updatable = false)
	@ManyToOne
	@JsonManagedReference
	private PersonalInformation personalInformation;
	
	@Transient
	private String inputPassword;
	
	@Transient
	private String userTypeDesc;

	public PersonalInformation getPersonalInformation() {
		return personalInformation;
	}

	public void setPersonalInformation(PersonalInformation personalInformation) {
		this.personalInformation = personalInformation;
	}

	public List<AuthMUserRole> getAuthUserRoles() {
		return authUserRoles;
	}

	public void setAuthUserRoles(List<AuthMUserRole> authUserRoles) {
		this.authUserRoles = authUserRoles;
	}

	public AuthMUser() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
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

	public Date getExpireDateFrom() {
		return this.expireDateFrom;
	}

	public void setExpireDateFrom(Date expireDateFrom) {
		this.expireDateFrom = expireDateFrom;
	}

	public Date getExpireDateTo() {
		return this.expireDateTo;
	}

	public void setExpireDateTo(Date expireDateTo) {
		this.expireDateTo = expireDateTo;
	}

	public String getPassWord() {
		return this.passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

	public String getRefAppFormId() {
		return this.refAppFormId;
	}

	public void setRefAppFormId(String refAppFormId) {
		this.refAppFormId = refAppFormId;
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

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public char getUserType() {
		return this.userType;
	}

	public void setUserType(char userType) {
		this.userType = userType;
	}

	public int getVersion() {
		return this.version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

	public String getInputPassword() {
		return inputPassword;
	}

	public void setInputPassword(String inputPassword) {
		this.inputPassword = inputPassword;
	}

	public String getUserTypeDesc() {
		return userTypeDesc;
	}

	public void setUserTypeDesc(String userTypeDesc) {
		this.userTypeDesc = userTypeDesc;
	}

}