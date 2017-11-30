package com.csigroup.entity;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the tblPersonalSkill database table.
 * 
 */
@Embeddable
public class PersonalSkillPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="AppFormId")
	private String appFormId;

	@Column(name="SkillType")
	private String skillType;

	@Column(name="SkillCode")
	private String skillCode;

	public PersonalSkillPK() {
	}
	public String getAppFormId() {
		return this.appFormId;
	}
	public void setAppFormId(String appFormId) {
		this.appFormId = appFormId;
	}
	public String getSkillType() {
		return this.skillType;
	}
	public void setSkillType(String skillType) {
		this.skillType = skillType;
	}
	public String getSkillCode() {
		return this.skillCode;
	}
	public void setSkillCode(String skillCode) {
		this.skillCode = skillCode;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof PersonalSkillPK)) {
			return false;
		}
		PersonalSkillPK castOther = (PersonalSkillPK)other;
		return 
			this.appFormId.equals(castOther.appFormId)
			&& this.skillType.equals(castOther.skillType)
			&& this.skillCode.equals(castOther.skillCode);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.appFormId.hashCode();
		hash = hash * prime + this.skillType.hashCode();
		hash = hash * prime + this.skillCode.hashCode();
		
		return hash;
	}
}