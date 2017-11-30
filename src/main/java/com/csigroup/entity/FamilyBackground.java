package com.csigroup.entity;


import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity  
@Table(name = "tblFamilyBackground")  
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})  
public class FamilyBackground implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6487671769189399340L;
	
	@Id  
	@GeneratedValue(strategy=GenerationType.AUTO)  
	@Column(name = "Id") 
	private int id;
	
	@Column(name = "AppFormId")
	private String appFormId;
	
	@Column(name = "Name")
	private String name;
	
	@Column(name = "Age")
	private String age;
	
	@Column(name = "Relationship")
	private String relationship;
	
	@Column(name = "Occupation")
	private String occupation;
	
	@Column(name = "Status")
	private Character status;
	
	@Column(name = "EmergencyFlag")
	private Character emergencyFlag;
	
	@Column(name = "AddressFlag")
	private Integer addressFlag;
	
	@Column(name = "Address")
	private String address;
	
	@Column(name = "AddressNo")
	private String addressNo;
	
	@Column(name = "Country")
	private String country;
	
	@Column(name = "Province")
	private String province;
	
	@Column(name = "District")
	private String district;
	
	@Column(name = "SubDistrict")
	private String subDistrict;
	
	@Column(name = "PostalCode")
	private String postalCode;
	
	@Column(name = "Soi")
	private String soi;
	
	@Column(name = "Street")
	private String street;
	
	@Column(name = "Tel")
	private String tel;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CreatedDate")
	private Date createdDate;
	
	@Column(name = "CreatedBy")
	private String createdBy;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "UpdatedDate")
	private Date updatedDate;
	
	@Column(name = "UpdatedBy")
	private String updatedBy;
	
	@Transient
	private Integer recordState;
	
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the appFormId
	 */
	public String getAppFormId() {
		return appFormId;
	}
	/**
	 * @param appFormId the appFormId to set
	 */
	public void setAppFormId(String appFormId) {
		this.appFormId = appFormId;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the age
	 */
	public String getAge() {
		return age;
	}
	/**
	 * @param age the age to set
	 */
	public void setAge(String age) {
		this.age = age;
	}
	/**
	 * @return the relationship
	 */
	public String getRelationship() {
		return relationship;
	}
	/**
	 * @param relationship the relationship to set
	 */
	public void setRelationship(String relationship) {
		this.relationship = relationship;
	}
	/**
	 * @return the occupation
	 */
	public String getOccupation() {
		return occupation;
	}
	/**
	 * @param occupation the occupation to set
	 */
	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}
	/**
	 * @return the status
	 */
	public Character getStatus() {
		return status;
	}
	/**
	 * @param status the status to set
	 */
	public void setStatus(Character status) {
		this.status = status;
	}
	/**
	 * @return the emergencyFlag
	 */
	public Character getEmergencyFlag() {
		return emergencyFlag;
	}
	/**
	 * @param emergencyFlag the emergencyFlag to set
	 */
	public void setEmergencyFlag(Character emergencyFlag) {
		this.emergencyFlag = emergencyFlag;
	}
	/**
	 * @return the addressFlag
	 */
	public Integer getAddressFlag() {
		return addressFlag;
	}
	/**
	 * @param addressFlag the addressFlag to set
	 */
	public void setAddressFlag(Integer addressFlag) {
		this.addressFlag = addressFlag;
	}
	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}
	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}
	/**
	 * @return the addressNo
	 */
	public String getAddressNo() {
		return addressNo;
	}
	/**
	 * @param addressNo the addressNo to set
	 */
	public void setAddressNo(String addressNo) {
		this.addressNo = addressNo;
	}
	/**
	 * @return the country
	 */
	public String getCountry() {
		return country;
	}
	/**
	 * @param country the country to set
	 */
	public void setCountry(String country) {
		this.country = country;
	}
	/**
	 * @return the province
	 */
	public String getProvince() {
		return province;
	}
	/**
	 * @param province the province to set
	 */
	public void setProvince(String province) {
		this.province = province;
	}
	/**
	 * @return the district
	 */
	public String getDistrict() {
		return district;
	}
	/**
	 * @param district the district to set
	 */
	public void setDistrict(String district) {
		this.district = district;
	}
	/**
	 * @return the subDistrict
	 */
	public String getSubDistrict() {
		return subDistrict;
	}
	/**
	 * @param subDistrict the subDistrict to set
	 */
	public void setSubDistrict(String subDistrict) {
		this.subDistrict = subDistrict;
	}
	/**
	 * @return the postalCode
	 */
	public String getPostalCode() {
		return postalCode;
	}
	/**
	 * @param postalCode the postalCode to set
	 */
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	/**
	 * @return the soi
	 */
	public String getSoi() {
		return soi;
	}
	/**
	 * @param soi the soi to set
	 */
	public void setSoi(String soi) {
		this.soi = soi;
	}
	/**
	 * @return the street
	 */
	public String getStreet() {
		return street;
	}
	/**
	 * @param street the street to set
	 */
	public void setStreet(String street) {
		this.street = street;
	}
	/**
	 * @return the tel
	 */
	public String getTel() {
		return tel;
	}
	/**
	 * @param tel the tel to set
	 */
	public void setTel(String tel) {
		this.tel = tel;
	}
	/**
	 * @return the createdDate
	 */
	public Date getCreatedDate() {
		return createdDate;
	}
	/**
	 * @param createdDate the createdDate to set
	 */
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	/**
	 * @return the createdBy
	 */
	public String getCreatedBy() {
		return createdBy;
	}
	/**
	 * @param createdBy the createdBy to set
	 */
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	/**
	 * @return the updatedDate
	 */
	public Date getUpdatedDate() {
		return updatedDate;
	}
	/**
	 * @param updatedDate the updatedDate to set
	 */
	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}
	/**
	 * @return the updatedBy
	 */
	public String getUpdatedBy() {
		return updatedBy;
	}
	/**
	 * @param updatedBy the updatedBy to set
	 */
	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}
	public Integer getRecordState() {
		return recordState;
	}
	public void setRecordState(Integer recordState) {
		this.recordState = recordState;
	}


}
