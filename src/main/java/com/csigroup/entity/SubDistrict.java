package com.csigroup.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 * The persistent class for the tblSubDistrict database table.
 * 
 */
@Entity
@Table(name = "tblSubDistrict")
@NamedQuery(name = "SubDistrict.findAll", query = "SELECT t FROM SubDistrict t")
public class SubDistrict implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "subdistrictID")
	private Integer subdistrictID;

	@Column(name = "subdistrictNameEN")
	private String subdistrictNameEN;

	@Column(name = "subdistrictNameTH")
	private String subdistrictNameTH;

	// @ManyToOne(fetch = FetchType.LAZY)
	// @JoinColumn(name = "districtID", insertable = false, updatable = false)
	// private District districtID;
	@Column(name = "districtID")
	private Integer districtID;

	// @OneToMany(mappedBy = "zipcodeID")
	// private List<Zipcode> zipCodeList;

	@Transient
	private String subDistrictDesc;

	public SubDistrict() {
	}

	public Integer getSubdistrictID() {
		return this.subdistrictID;
	}

	public void setSubdistrictID(Integer subdistrictID) {
		this.subdistrictID = subdistrictID;
	}

	public String getSubdistrictNameEN() {
		return this.subdistrictNameEN;
	}

	public void setSubdistrictNameEN(String subdistrictNameEN) {
		this.subdistrictNameEN = subdistrictNameEN;
	}

	public String getSubdistrictNameTH() {
		return this.subdistrictNameTH;
	}

	public void setSubdistrictNameTH(String subdistrictNameTH) {
		this.subdistrictNameTH = subdistrictNameTH;
	}

	public Integer getDistrictID() {
		return districtID;
	}

	public void setDistrictID(Integer districtID) {
		this.districtID = districtID;
	}

	public String getSubDistrictDesc() {
		return subDistrictDesc;
	}

}