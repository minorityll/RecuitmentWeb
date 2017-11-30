package com.csigroup.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

/**
 * The persistent class for the tblPersonalInformation database table.
 * 
 */
@Entity
@Table(name="tblPersonalInformation")
@NamedQuery(name="PersonalInformation.findAll", query="SELECT t FROM PersonalInformation t")
public class PersonalInformation implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="AppFormId")
	private String appFormId;

	@Column(name="Age")
	private Integer age;

	@Column(name="AppFormStatus")
	private String appFormStatus;

	@Column(name="CarFlag")
	private Character carFlag;

	@Column(name="CreatedBy")
	private String createdBy;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="CreatedDate")
	private Date createdDate;

	@Temporal(TemporalType.DATE)
	@Column(name="DateOfBirth")
	private Date dateOfBirth;

	@Column(name="Disease")
	private String disease;

	@Column(name="EmailAddress")
	private String emailAddress;

	@Column(name="EmergencyContactAddress")
	private String emergencyContactAddress;

	@Column(name="EmergencyContactName")
	private String emergencyContactName;

	@Column(name="EmergencyContactRelationship")
	private String emergencyContactRelationship;

	@Column(name="EmergencyContactTel")
	private String emergencyContactTel;

	@Column(name="ExpectedSalary")
	private Integer expectedSalary;

	@Column(name="FirstNameEn")
	private String firstNameEn;

	@Column(name="FirstNameJp")
	private String firstNameJp;

	@Column(name="FirstNameTh")
	private String firstNameTh;

	@Column(name="Height")
	private Integer height;

	@Column(name="Id")
	private String id;

	@Column(name="IssuedAt")
	private String issuedAt;

	@Column(name="LastNameEn")
	private String lastNameEn;

	@Column(name="LastNameJp")
	private String lastNameJp;

	@Column(name="LastNameTh")
	private String lastNameTh;

	@Column(name="MaritalStatus")
	private Character maritalStatus;

	@Column(name="MilitaryCause")
	private String militaryCause;

	@Column(name="MilitaryStatus")
	private Character militaryStatus;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="MilitaryWhen")
	private Date militaryWhen;

	@Column(name="MobilePhoneNo")
	private String mobilePhoneNo;

	@Column(name="MotorcycleFlag")
	private Character motorcycleFlag;

	@Column(name="NamePrefix")
	private Character namePrefix;

	@Column(name="Nationality")
	private String nationality;

	@Column(name="NickName")
	private String nickName;

	@Column(name="OtherSkill")
	private String otherSkill;

	@Column(name="PlaceOfBirth")
	private String placeOfBirth;

	@Column(name="Position")
	private String position;

	@Column(name="PresentAddr")
	private String presentAddr;

	@Column(name="PresentAddress")
	private String presentAddress;

	@Column(name="PresentCountry")
	private String presentCountry;

	@Column(name="PresentDistrict")
	private Integer presentDistrict;

	@Column(name="PresentPostalCode")
	private String presentPostalCode;

	@Column(name="PresentProvince")
	private Integer presentProvince;

	@Column(name="PresentSoi")
	private String presentSoi;

	@Column(name="PresentStreet")
	private String presentStreet;

	@Column(name="PresentSubDistrict")
	private Integer presentSubDistrict;

	@Column(name="Race")
	private String race;

	@Column(name="RegAddr")
	private String regAddr;

	@Column(name="RegCountry")
	private String regCountry;

	@Column(name="RegDistrict")
	private Integer regDistrict;

	@Column(name="RegisterAddress")
	private String registerAddress;

	@Column(name="RegPostalCode")
	private String regPostalCode;

	@Column(name="RegProvince")
	private Integer regProvince;

	@Column(name="RegSoi")
	private String regSoi;

	@Column(name="RegStreet")
	private String regStreet;

	@Column(name="RegSubDistrict")
	private Integer regSubDistrict;

	@Column(name="Religion")
	private String religion;

	@Column(name="Remark")
	private String remark;

	@Column(name="Sex")
	private Character sex;

	@Column(name="Tel")
	private String tel;

	@Column(name="TrainingSpecialCourse")
	private String trainingSpecialCourse;

	@Column(name="TypingEn")
	private Integer typingEn;

	@Column(name="TypingTh")
	private Integer typingTh;

	@Column(name="UpdatedBy")
	private String updatedBy;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="UpdatedDate")
	private Date updatedDate;

	@Transient
	private Integer version;

	@Column(name="Weight")
	private Integer weight;
	
	@Column(name="Photo")
	private byte[] photo;
	
	@Transient
	private String appStatusDesc;
	
//	@OneToMany(mappedBy = "personalInformation", fetch = FetchType.EAGER)
//	@JsonBackReference
//    private List<AuthMUser> personUser;

//	public List<AuthMUser> getPersonUser() {
//		return personUser;
//	}
//
//	public void setPersonUser(List<AuthMUser> personUser) {
//		this.personUser = personUser;
//	}

	public PersonalInformation() {
	}

	public String getAppFormId() {
		return this.appFormId;
	}

	public void setAppFormId(String appFormId) {
		this.appFormId = appFormId;
	}

	public Integer getAge() {
		return this.age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getAppFormStatus() {
		return this.appFormStatus;
	}

	public void setAppFormStatus(String appFormStatus) {
		this.appFormStatus = appFormStatus;
	}

	public Character getCarFlag() {
		return this.carFlag;
	}

	public void setCarFlag(Character carFlag) {
		this.carFlag = carFlag;
	}

	public String getCreatedBy() {
		return this.createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public Date getCreatedDate() {
		return this.createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public Date getDateOfBirth() {
		return this.dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getDisease() {
		return this.disease;
	}

	public void setDisease(String disease) {
		this.disease = disease;
	}

	public String getEmailAddress() {
		return this.emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getEmergencyContactAddress() {
		return this.emergencyContactAddress;
	}

	public void setEmergencyContactAddress(String emergencyContactAddress) {
		this.emergencyContactAddress = emergencyContactAddress;
	}

	public String getEmergencyContactName() {
		return this.emergencyContactName;
	}

	public void setEmergencyContactName(String emergencyContactName) {
		this.emergencyContactName = emergencyContactName;
	}

	public String getEmergencyContactRelationship() {
		return this.emergencyContactRelationship;
	}

	public void setEmergencyContactRelationship(String emergencyContactRelationship) {
		this.emergencyContactRelationship = emergencyContactRelationship;
	}

	public String getEmergencyContactTel() {
		return this.emergencyContactTel;
	}

	public void setEmergencyContactTel(String emergencyContactTel) {
		this.emergencyContactTel = emergencyContactTel;
	}

	public Integer getExpectedSalary() {
		return this.expectedSalary;
	}

	public void setExpectedSalary(Integer expectedSalary) {
		this.expectedSalary = expectedSalary;
	}

	public String getFirstNameEn() {
		return this.firstNameEn;
	}

	public void setFirstNameEn(String firstNameEn) {
		this.firstNameEn = firstNameEn;
	}

	public String getFirstNameJp() {
		return this.firstNameJp;
	}

	public void setFirstNameJp(String firstNameJp) {
		this.firstNameJp = firstNameJp;
	}

	public String getFirstNameTh() {
		return this.firstNameTh;
	}

	public void setFirstNameTh(String firstNameTh) {
		this.firstNameTh = firstNameTh;
	}

	public Integer getHeight() {
		return this.height;
	}

	public void setHeight(Integer height) {
		this.height = height;
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getIssuedAt() {
		return this.issuedAt;
	}

	public void setIssuedAt(String issuedAt) {
		this.issuedAt = issuedAt;
	}

	public String getLastNameEn() {
		return this.lastNameEn;
	}

	public void setLastNameEn(String lastNameEn) {
		this.lastNameEn = lastNameEn;
	}

	public String getLastNameJp() {
		return this.lastNameJp;
	}

	public void setLastNameJp(String lastNameJp) {
		this.lastNameJp = lastNameJp;
	}

	public String getLastNameTh() {
		return this.lastNameTh;
	}

	public void setLastNameTh(String lastNameTh) {
		this.lastNameTh = lastNameTh;
	}

	public Character getMaritalStatus() {
		return this.maritalStatus;
	}

	public void setMaritalStatus(Character maritalStatus) {
		this.maritalStatus = maritalStatus;
	}

	public String getMilitaryCause() {
		return this.militaryCause;
	}

	public void setMilitaryCause(String militaryCause) {
		this.militaryCause = militaryCause;
	}

	public Character getMilitaryStatus() {
		return this.militaryStatus;
	}

	public void setMilitaryStatus(Character militaryStatus) {
		this.militaryStatus = militaryStatus;
	}

	public Date getMilitaryWhen() {
		return this.militaryWhen;
	}

	public void setMilitaryWhen(Date militaryWhen) {
		this.militaryWhen = militaryWhen;
	}

	public String getMobilePhoneNo() {
		return this.mobilePhoneNo;
	}

	public void setMobilePhoneNo(String mobilePhoneNo) {
		this.mobilePhoneNo = mobilePhoneNo;
	}

	public Character getMotorcycleFlag() {
		return this.motorcycleFlag;
	}

	public void setMotorcycleFlag(Character motorcycleFlag) {
		this.motorcycleFlag = motorcycleFlag;
	}

	public Character getNamePrefix() {
		return this.namePrefix;
	}

	public void setNamePrefix(Character namePrefix) {
		this.namePrefix = namePrefix;
	}

	public String getNationality() {
		return this.nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public String getNickName() {
		return this.nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public String getOtherSkill() {
		return this.otherSkill;
	}

	public void setOtherSkill(String otherSkill) {
		this.otherSkill = otherSkill;
	}

	public byte[] getPhoto() {
		return this.photo;
	}

	public void setPhoto(byte[] photo) {
		this.photo = photo;
	}

	public String getPlaceOfBirth() {
		return this.placeOfBirth;
	}

	public void setPlaceOfBirth(String placeOfBirth) {
		this.placeOfBirth = placeOfBirth;
	}

	public String getPosition() {
		return this.position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String getPresentAddr() {
		return this.presentAddr;
	}

	public void setPresentAddr(String presentAddr) {
		this.presentAddr = presentAddr;
	}

	public String getPresentAddress() {
		return this.presentAddress;
	}

	public void setPresentAddress(String presentAddress) {
		this.presentAddress = presentAddress;
	}

	public String getPresentCountry() {
		return this.presentCountry;
	}

	public void setPresentCountry(String presentCountry) {
		this.presentCountry = presentCountry;
	}

	public Integer getPresentDistrict() {
		return this.presentDistrict;
	}

	public void setPresentDistrict(Integer presentDistrict) {
		this.presentDistrict = presentDistrict;
	}

	public String getPresentPostalCode() {
		return this.presentPostalCode;
	}

	public void setPresentPostalCode(String presentPostalCode) {
		this.presentPostalCode = presentPostalCode;
	}

	public Integer getPresentProvince() {
		return this.presentProvince;
	}

	public void setPresentProvince(Integer presentProvince) {
		this.presentProvince = presentProvince;
	}

	public String getPresentSoi() {
		return this.presentSoi;
	}

	public void setPresentSoi(String presentSoi) {
		this.presentSoi = presentSoi;
	}

	public String getPresentStreet() {
		return this.presentStreet;
	}

	public void setPresentStreet(String presentStreet) {
		this.presentStreet = presentStreet;
	}

	public Integer getPresentSubDistrict() {
		return this.presentSubDistrict;
	}

	public void setPresentSubDistrict(Integer presentSubDistrict) {
		this.presentSubDistrict = presentSubDistrict;
	}

	public String getRace() {
		return this.race;
	}

	public void setRace(String race) {
		this.race = race;
	}

	public String getRegAddr() {
		return this.regAddr;
	}

	public void setRegAddr(String regAddr) {
		this.regAddr = regAddr;
	}

	public String getRegCountry() {
		return this.regCountry;
	}

	public void setRegCountry(String regCountry) {
		this.regCountry = regCountry;
	}

	public Integer getRegDistrict() {
		return this.regDistrict;
	}

	public void setRegDistrict(Integer regDistrict) {
		this.regDistrict = regDistrict;
	}

	public String getRegisterAddress() {
		return this.registerAddress;
	}

	public void setRegisterAddress(String registerAddress) {
		this.registerAddress = registerAddress;
	}

	public String getRegPostalCode() {
		return this.regPostalCode;
	}

	public void setRegPostalCode(String regPostalCode) {
		this.regPostalCode = regPostalCode;
	}

	public Integer getRegProvince() {
		return this.regProvince;
	}

	public void setRegProvince(Integer regProvince) {
		this.regProvince = regProvince;
	}

	public String getRegSoi() {
		return this.regSoi;
	}

	public void setRegSoi(String regSoi) {
		this.regSoi = regSoi;
	}

	public String getRegStreet() {
		return this.regStreet;
	}

	public void setRegStreet(String regStreet) {
		this.regStreet = regStreet;
	}

	public Integer getRegSubDistrict() {
		return this.regSubDistrict;
	}

	public void setRegSubDistrict(Integer regSubDistrict) {
		this.regSubDistrict = regSubDistrict;
	}

	public String getReligion() {
		return this.religion;
	}

	public void setReligion(String religion) {
		this.religion = religion;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Character getSex() {
		return this.sex;
	}

	public void setSex(Character sex) {
		this.sex = sex;
	}

	public String getTel() {
		return this.tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getTrainingSpecialCourse() {
		return this.trainingSpecialCourse;
	}

	public void setTrainingSpecialCourse(String trainingSpecialCourse) {
		this.trainingSpecialCourse = trainingSpecialCourse;
	}

	public Integer getTypingEn() {
		return this.typingEn;
	}

	public void setTypingEn(Integer typingEn) {
		this.typingEn = typingEn;
	}

	public Integer getTypingTh() {
		return this.typingTh;
	}

	public void setTypingTh(Integer typingTh) {
		this.typingTh = typingTh;
	}

	public String getUpdatedBy() {
		return this.updatedBy;
	}

	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}

	public Date getUpdatedDate() {
		return this.updatedDate;
	}

	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}

	public Integer getVersion() {
		return this.version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

	public Integer getWeight() {
		return this.weight;
	}

	public void setWeight(Integer weight) {
		this.weight = weight;
	}

	public String getAppStatusDesc() {
		return appStatusDesc;
	}

	public void setAppStatusDesc(String appStatusDesc) {
		this.appStatusDesc = appStatusDesc;
	}

}