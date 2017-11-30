package com.csigroup.entity;

import java.io.Serializable;
import javax.persistence.*;



/**
 * The persistent class for the tblCountry database table.
 * 
 */
@Entity
@Table(name="tblCountry")
@NamedQuery(name="Country.findAll", query="SELECT t FROM Country t")
public class Country implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="CountryCode")
	private String countryCode;

	@Column(name="CountryNameEn")
	private String countryNameEn;

	@Column(name="CountryNameTh")
	private String countryNameTh;
	
	@Transient
	private String countryDesc;

	public Country() {
	}

	public String getCountryCode() {
		return this.countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public String getCountryNameEn() {
		return this.countryNameEn;
	}

	public void setCountryNameEn(String countryNameEn) {
		this.countryNameEn = countryNameEn;
	}

	public String getCountryNameTh() {
		return this.countryNameTh;
	}

	public void setCountryNameTh(String countryNameTh) {
		this.countryNameTh = countryNameTh;
	}

	public String getCountryDesc() {
		return countryDesc;
	}

}