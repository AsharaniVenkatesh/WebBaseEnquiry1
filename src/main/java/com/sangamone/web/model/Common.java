package com.sangamone.web.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="enquiry")
public class Common {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private int eid;
	private String ecompany;
	private String ename;
	private String email;
	private String econtactno;
	private String egrade;
	private String emessage;
	public Common(int eid, String ecompany, String ename, String email, String econtactno, String egrade,
			String emessage) {
		super();
		this.eid = eid;
		this.ecompany = ecompany;
		this.ename = ename;
		this.email = email;
		this.econtactno = econtactno;
		this.egrade = egrade;
		this.emessage = emessage;
	}
	public Common() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Common [eid=" + eid + ", ecompany=" + ecompany + ", eusername=" + ename + ", email=" + email
				+ ", econtactno=" + econtactno + ", egrade=" + egrade + ", emessage=" + emessage + "]";
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEcompany() {
		return ecompany;
	}
	public void setEcompany(String ecompany) {
		this.ecompany = ecompany;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getEcontactno() {
		return econtactno;
	}
	public void setEcontactno(String econtactno) {
		this.econtactno = econtactno;
	}
	public String getEgrade() {
		return egrade;
	}
	public void setEgrade(String egrade) {
		this.egrade = egrade;
	}
	public String getEmessage() {
		return emessage;
	}
	public void setEmessage(String emessage) {
		this.emessage = emessage;
	}

}
