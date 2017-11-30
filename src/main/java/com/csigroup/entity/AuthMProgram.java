package com.csigroup.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;


/**
 * The persistent class for the tblAuthMProgram database table.
 * 
 */
@Entity
@Table(name="tblAuthMProgram")
@NamedQuery(name="AuthMProgram.findAll", query="SELECT a FROM AuthMProgram a")
public class AuthMProgram implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ProgramId")
	private int programId;

	@Column(name="CreateBy")
	private String createBy;

	@Column(name="CreateDate")
	private Date createDate;

	@Column(name="ProgramCode")
	private String programCode;

	@Column(name="ProgramNameEn")
	private String programNameEn;

	@Column(name="ProgramNameTh")
	private String programNameTh;

	@Column(name="UpdateBy")
	private String updateBy;

	@Column(name="UpdateDate")
	private Date updateDate;

	@Column(name="Url")
	private String url;

	@Transient
	private int version;
	
//	@OneToMany(mappedBy = "program", fetch = FetchType.LAZY)
//	@JsonBackReference
//    private List<AuthMRoleMenu> roleMenu;
	
	@Transient
	private boolean selected;
	
	@Transient
	private String programNameByLocal;

	public AuthMProgram() {
	}

	public int getProgramId() {
		return this.programId;
	}

	public void setProgramId(int programId) {
		this.programId = programId;
	}

	public String getCreateBy() {
		return this.createBy;
	}

	public void setCreateBy(String createBy) {
		this.createBy = createBy;
	}

	public String getProgramCode() {
		return this.programCode;
	}

	public void setProgramCode(String programCode) {
		this.programCode = programCode;
	}

	public String getProgramNameEn() {
		return this.programNameEn;
	}

	public void setProgramNameEn(String programNameEn) {
		this.programNameEn = programNameEn;
	}

	public String getProgramNameTh() {
		return this.programNameTh;
	}

	public void setProgramNameTh(String programNameTh) {
		this.programNameTh = programNameTh;
	}

	public String getUpdateBy() {
		return this.updateBy;
	}

	public void setUpdateBy(String updateBy) {
		this.updateBy = updateBy;
	}

	public String getUrl() {
		return this.url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public int getVersion() {
		return this.version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

	public boolean isSelected() {
		return selected;
	}

	public void setSelected(boolean selected) {
		this.selected = selected;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public Date getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

	public String getProgramNameByLocal() {
		return programNameByLocal;
	}

	public void setProgramNameByLocal(String programNameByLocal) {
		this.programNameByLocal = programNameByLocal;
	}

}