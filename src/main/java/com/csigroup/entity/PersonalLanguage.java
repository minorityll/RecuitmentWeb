package com.csigroup.entity;

import java.io.Serializable;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.Date;

@Entity
@Table(name="tblPersonalLanguage")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class PersonalLanguage implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 9214959390537361409L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)  
	@Column(name="PersonalLanguageId")
	private int personalLanguageId;

	@Column(name="AppFormId")
	private String appFormId;

	@Column(name="Language")
	private String language;
	
	@Column(name="Speaking")
	private Character speaking;
	
	@Column(name="Writing")
	private Character writing;
	
	@Column(name="Reading")
	private Character reading;

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
	 * @return the personalLanguageId
	 */
	public int getPersonalLanguageId() {
		return personalLanguageId;
	}

	/**
	 * @param personalLanguageId the personalLanguageId to set
	 */
	public void setPersonalLanguageId(int personalLanguageId) {
		this.personalLanguageId = personalLanguageId;
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
	 * @return the language
	 */
	public String getLanguage() {
		return language;
	}

	/**
	 * @param language the language to set
	 */
	public void setLanguage(String language) {
		this.language = language;
	}

	/**
	 * @return the speaking
	 */
	public Character getSpeaking() {
		return speaking;
	}

	/**
	 * @param speaking the speaking to set
	 */
	public void setSpeaking(Character speaking) {
		this.speaking = speaking;
	}

	/**
	 * @return the writing
	 */
	public Character getWriting() {
		return writing;
	}

	/**
	 * @param writing the writing to set
	 */
	public void setWriting(Character writing) {
		this.writing = writing;
	}

	/**
	 * @return the reading
	 */
	public Character getReading() {
		return reading;
	}

	/**
	 * @param reading the reading to set
	 */
	public void setReading(Character reading) {
		this.reading = reading;
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