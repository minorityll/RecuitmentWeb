package com.csigroup.entity;

import java.io.Serializable;

import javax.persistence.*;

/**
 * The persistent class for the tblDistrict database table.
 * 
 */
@Entity
@Table(name = "tblDistrict")
@NamedQuery(name = "District.findAll", query = "SELECT t FROM District t")
public class District implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "districtID")
	private Integer districtID;

	@Column(name = "districtNameEN")
	private String districtNameEN;

	@Column(name = "districtNameTH")
	private String districtNameTH;

	// @ManyToOne(fetch = FetchType.LAZY)
	// @JoinColumn(name = "provinceID", insertable = false, updatable = false)
	// private Province provinceID;
	@Column(name = "provinceID")
	private Integer provinceID;

	// @OneToMany(mappedBy = "districtID")
	// private List<SubDistrict> subDistrictList;

	@Transient
	private String districtDesc;

	public District() {
	}

	public Integer getDistrictID() {
		return this.districtID;
	}

	public void setDistrictID(Integer districtID) {
		this.districtID = districtID;
	}

	public String getDistrictNameEN() {
		return this.districtNameEN;
	}

	public void setDistrictNameEN(String districtNameEN) {
		this.districtNameEN = districtNameEN;
	}

	public String getDistrictNameTH() {
		return this.districtNameTH;
	}

	public void setDistrictNameTH(String districtNameTH) {
		this.districtNameTH = districtNameTH;
	}

	public Integer getProvinceID() {
		return provinceID;
	}

	public void setProvinceID(Integer provinceID) {
		this.provinceID = provinceID;
	}

	public String getDistrictDesc() {
		return districtDesc;
	}

}