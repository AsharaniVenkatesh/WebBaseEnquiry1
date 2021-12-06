package com.sangamone.web.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="loginadmin")
public class Login {
	
	@Id
	@GeneratedValue( strategy= GenerationType.IDENTITY)
	private int lid;
	
	@Column(name="lusername")
	private String lusername;
	
	@Column(name="lpassword")
	private String lpassword;
	
	@Column(name="cname")
	private String cname;
	
	@Column(name="id")
	private int id;


	public Login(int lid, String lusername, String lpassword, String cname, int id) {
		super();
		this.lid = lid;
		this.lusername = lusername;
		this.lpassword = lpassword;
		this.cname = cname;
		this.id = id;
	}
	public Login() {

	}

	
	@Override
	public String toString() {
		return "Login [lid=" + lid + ", lusername=" + lusername + ", lpassword=" + lpassword + ", cname=" + cname
				+ ", id=" + id + "]";
	}
	public int getLid() {
		return lid;
	}
	public void setLid(int lid) {
		this.lid = lid;
	}
	public String getLusername() {
		return lusername;
	}
	public void setLusername(String lusername) {
		this.lusername = lusername;
	}
	public String getLpassword() {
		return lpassword;
	}
	public void setLpassword(String lpassword) {
		this.lpassword = lpassword;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

}
