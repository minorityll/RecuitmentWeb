package com.csigroup.entity;

import java.io.Serializable;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.Date;

@Entity
@Table(name="tblEducationBackground")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class EducationBackground implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 9214959390537361409L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)  
	@Column(name="EduBackgroundId")
	private int eduBackgroundId;

	@Column(name="AppFormId")
	private String appFormId;

	@Column(name="Degree")
	private String degree;
	
	@Column(name="Major")
	private String major;
	
	@Column(name="EducationalInstitution")
	private String educationalInstitution;
	
	@Column(name="DateFrom")
	private String dateFrom;

	@Column(name="DateTo")
	private String dateTo;

	@Column(name="CreatedBy")
	private String createdBy;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="CreatedDate")
	private Date createdDate;

	@Column(name="UpdatedBy")
	private String updatedBy;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="UpdatedDate")
	private Date updatedDate;

	@Transient
	private Integer recordState;
	
	/**
	 * @return the eduBackgroundId
	 */
	public int getEduBackgroundId() {
		return eduBackgroundId;
	}

	/**
	 * @param eduBackgroundId the eduBackgroundId to set
	 */
	public void setEduBackgroundId(int eduBackgroundId) {
		this.eduBackgroundId = eduBackgroundId;
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
	 * @return the degree
	 */
	public String getDegree() {
		return degree;
	}

	/**
	 * @param degree the degree to set
	 */
	public void setDegree(String degree) {
		this.degree = degree;
	}

	/**
	 * @return the major
	 */
	public String getMajor() {
		return major;
	}

	/**
	 * @param major the major to set
	 */
	public void setMajor(String major) {
		this.major = major;
	}

	/**
	 * @return the educationalInstitution
	 */
	public String getEducationalInstitution() {
		return educationalInstitution;
	}

	/**
	 * @param educationalInstitution the educationalInstitution to set
	 */
	public void setEducationalInstitution(String educationalInstitution) {
		this.educationalInstitution = educationalInstitution;
	}

	/**
	 * @return the dateFrom
	 */
	public String getDateFrom() {
		return dateFrom;
	}

	/**
	 * @param dateFrom the dateFrom to set
	 */
	public void setDateFrom(String dateFrom) {
		this.dateFrom = dateFrom;
	}

	/**
	 * @return the dateTo
	 */
	public String getDateTo() {
		return dateTo;
	}

	/**
	 * @param dateTo the dateTo to set
	 */
	public void setDateTo(String dateTo) {
		this.dateTo = dateTo;
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
	 * @return the recordState
	 */
	public Integer getRecordState() {
		return recordState;
	}

	/**
	 * @param recordState the recordState to set
	 */
	public void setRecordState(Integer recordState) {
		this.recordState = recordState;
	}

}