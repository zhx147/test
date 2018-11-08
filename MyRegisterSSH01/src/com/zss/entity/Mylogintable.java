package com.zss.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Mylogintable entity. @author MyEclipse Persistence Tools
 */

@Entity
@Table(name = "mylogintable", catalog = "school")
public class Mylogintable implements java.io.Serializable {

	// Fields

	private String myusername;
	private String mypassword;

	// Constructors

	/** default constructor */
	public Mylogintable() {
	}

	/** full constructor */
	public Mylogintable(String myusername, String mypassword) {
		this.myusername = myusername;
		this.mypassword = mypassword;
	}

	
	@Id
	@Column(name = "myusername", unique = true, nullable = false)
	public String getMyusername() {
		return this.myusername;
	}

	public void setMyusername(String myusername) {
		this.myusername = myusername;
	}

	@Column(name = "mypassword", nullable = false)
	public String getMypassword() {
		return this.mypassword;
	}

	public void setMypassword(String mypassword) {
		this.mypassword = mypassword;
	}

}