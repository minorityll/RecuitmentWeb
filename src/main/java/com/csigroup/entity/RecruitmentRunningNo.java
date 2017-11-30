package com.csigroup.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;


/**
 * The persistent class for the tblRecruitmentRunningNo database table.
 * 
 */
@Entity
@Table(name="tblRecruitmentRunningNo")
@NamedQuery(name="RecruitmentRunningNo.findAll", query="SELECT t FROM RecruitmentRunningNo t")
public class RecruitmentRunningNo implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="Id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	@Column(name="Month")
	private int month;
	@Column(name="Running")
	private int running;
	@Column(name="UpdateBy")
	private String updateBy;
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="UpdateDate")
	private Date updateDate;
	@Transient
	private int version;
	@Column(name="Year")
	private int year;

	public RecruitmentRunningNo() {
	}


	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getMonth() {
		return this.month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getRunning() {
		return this.running;
	}

	public void setRunning(int running) {
		this.running = running;
	}

	public int getVersion() {
		return this.version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

	public int getYear() {
		return this.year;
	}

	public void setYear(int year) {
		this.year = year;
	}


	public String getUpdateBy() {
		return updateBy;
	}


	public void setUpdateBy(String updateBy) {
		this.updateBy = updateBy;
	}


	public Date getUpdateDate() {
		return updateDate;
	}


	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

}