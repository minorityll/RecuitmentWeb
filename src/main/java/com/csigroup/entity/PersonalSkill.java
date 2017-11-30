package com.csigroup.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the tblPersonalSkill database table.
 * 
 */
@Entity
@Table(name="tblPersonalSkill")
@NamedQuery(name="PersonalSkill.findAll", query="SELECT p FROM PersonalSkill p")
public class PersonalSkill implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private PersonalSkillPK id;

	@Column(name="CreatedBy")
	private String createdBy;

	@Column(name="CreatedDate")
	private Timestamp createdDate;

	@Column(name="UpdatedBy")
	private String updatedBy;

	@Column(name="UpdatedDate")
	private Timestamp updatedDate;

	@Transient
	private int version;

	public PersonalSkill() {
	}

	public PersonalSkillPK getId() {
		return this.id;
	}

	public void setId(PersonalSkillPK id) {
		this.id = id;
	}

	public String getCreatedBy() {
		return this.createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public Timestamp getCreatedDate() {
		return this.createdDate;
	}

	public void setCreatedDate(Timestamp createdDate) {
		this.createdDate = createdDate;
	}

	public String getUpdatedBy() {
		return this.updatedBy;
	}

	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}

	public Timestamp getUpdatedDate() {
		return this.updatedDate;
	}

	public void setUpdatedDate(Timestamp updatedDate) {
		this.updatedDate = updatedDate;
	}

	public int getVersion() {
		return this.version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

}