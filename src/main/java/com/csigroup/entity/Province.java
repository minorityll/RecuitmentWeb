package com.csigroup.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 * The persistent class for the tblProvince database table.
 * 
 */
@Entity
@Table(name = "tblProvince")
@NamedQuery(name = "Province.findAll", query = "SELECT t FROM Province t")
public class Province implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "provinceID")
	private Integer provinceID;

	@Column(name = "provinceNameEN")
	private String provinceNameEN;

	@Column(name = "provinceNameTH")
	private String provinceNameTH;

	// // one to many use mappedBy
	// @OneToMany(mappedBy = "provinceID")
	// private List<District> districtList;

	@Transient
	private String provinceDesc;

	public Province() {
	}

	public Integer getProvinceID() {
		return this.provinceID;
	}

	public void setProvinceID(Integer provinceID) {
		this.provinceID = provinceID;
	}

	public String getProvinceNameEN() {
		return this.provinceNameEN;
	}

	public void setProvinceNameEN(String provinceNameEN) {
		this.provinceNameEN = provinceNameEN;
	}

	public String getProvinceNameTH() {
		return this.provinceNameTH;
	}

	public void setProvinceNameTH(String provinceNameTH) {
		this.provinceNameTH = provinceNameTH;
	}

	public String getProvinceDesc() {
		return provinceDesc;
	}

}