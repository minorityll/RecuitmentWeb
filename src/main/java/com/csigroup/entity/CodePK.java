package com.csigroup.entity;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the tblCode database table.
 * 
 */
@Embeddable
public class CodePK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="Code")
	private String code;

	@Column(name="CodeId")
	private String codeId;

	public CodePK() {
	}
	public String getCode() {
		return this.code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getCodeId() {
		return this.codeId;
	}
	public void setCodeId(String codeId) {
		this.codeId = codeId;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof CodePK)) {
			return false;
		}
		CodePK castOther = (CodePK)other;
		return 
			this.code.equals(castOther.code)
			&& this.codeId.equals(castOther.codeId);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.code.hashCode();
		hash = hash * prime + this.codeId.hashCode();
		
		return hash;
	}
}