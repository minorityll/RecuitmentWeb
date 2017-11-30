package com.csigroup.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the tblCareerHistory database table.
 * 
 */
@Entity
@Table(name="tblCareerHistory")
@NamedQuery(name="CareerHistory.findAll", query="SELECT c FROM CareerHistory c")
public class CareerHistory implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)  
	@Column(name="CareerId")
	private int careerId;

	@Column(name="AppFormId")
	private String appFormId;

	@Column(name="CompanyName")
	private String companyName;

	@Column(name="CreatedBy")
	private String createdBy;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="CreatedDate")
	private Date createdDate;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="DateFrom")
	private Date dateFrom;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="DateTo")
	private Date dateTo;

	@Column(name="Position")
	private String position;

	@Column(name="ReasonOfLeaving")
	private String reasonOfLeaving;

	@Column(name="Salary")
	private int salary;

	@Column(name="UpdatedBy")
	private String updatedBy;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="UpdatedDate")
	private Date updatedDate;

	@Transient
	private int version;

	@Transient
	private String dateFromStr;
	@Transient
	private String dateToStr;
	
	public CareerHistory() {
	}

	public int getCareerId() {
		return this.careerId;
	}

	public void setCareerId(int careerId) {
		this.careerId = careerId;
	}

	public String getAppFormId() {
		return this.appFormId;
	}

	public void setAppFormId(String appFormId) {
		this.appFormId = appFormId;
	}

	public String getCompanyName() {
		return this.companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
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

	public Date getDateFrom() {
		return this.dateFrom;
	}

	public void setDateFrom(Date dateFrom) {
		this.dateFrom = dateFrom;
	}

	public Date getDateTo() {
		return this.dateTo;
	}

	public void setDateTo(Date dateTo) {
		this.dateTo = dateTo;
	}

	public String getPosition() {
		return this.position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String getReasonOfLeaving() {
		return this.reasonOfLeaving;
	}

	public void setReasonOfLeaving(String reasonOfLeaving) {
		this.reasonOfLeaving = reasonOfLeaving;
	}

	public int getSalary() {
		return this.salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
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

	public int getVersion() {
		return this.version;
	}

	public void setVersion(int version) {
		this.version = version;
	}
	
	public String getDateFromStr() {
		return dateFromStr;
	}

	public void setDateFromStr(String dateFromStr) {
		this.dateFromStr = dateFromStr;
	}

	public String getDateToStr() {
		return dateToStr;
	}

	public void setDateToStr(String dateToStr) {
		this.dateToStr = dateToStr;
	}

}