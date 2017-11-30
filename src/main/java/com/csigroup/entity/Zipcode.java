package com.csigroup.entity;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The persistent class for the tblZipcode database table.
 * 
 */
@Entity
@Table(name = "tblZipcode")
@NamedQuery(name = "Zipcode.findAll", query = "SELECT t FROM Zipcode t")
public class Zipcode implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "zipcodeID")
	private Integer zipcodeID;

	@Column(name = "zipcode")
	private Integer zipcode;

	// @ManyToOne(fetch = FetchType.LAZY)
	// @JoinColumn(name = "subdistrictID", insertable = false, updatable =
	// false)
	// private SubDistrict subdistrictID;
	@Column(name = "subdistrictID")
	private Integer subDistrictID;

	public Zipcode() {
	}

	public Integer getZipcodeID() {
		return this.zipcodeID;
	}

	public void setZipcodeID(Integer zipcodeID) {
		this.zipcodeID = zipcodeID;
	}

	public Integer getZipcode() {
		return this.zipcode;
	}

	public void setZipcode(Integer zipcode) {
		this.zipcode = zipcode;
	}

	public Integer getSubDistrictID() {
		return subDistrictID;
	}

	public void setSubDistrictID(Integer subDistrictID) {
		this.subDistrictID = subDistrictID;
	}

}