package com.family.budget.spring.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Temporal;

import javax.persistence.TemporalType;

import org.hibernate.annotations.CreationTimestamp;


@Entity(name = "user_table")
public class user {
	
	@Id
	 @GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "id_Sequence")
	 @SequenceGenerator(name = "id_Sequence", sequenceName = "ID_SEQ")
	private int login_id;
	
	@Column(nullable=false,unique = true)
	private String login_user_name;
	
	@Column(nullable=false)
	private String password_ID;
	
	@Column(nullable=false)
	private String email_Id;
	
	@Column(nullable=false)
	private String first_name;
	
	@Column(nullable=false)
	private String last_name;
	
	
	 @CreationTimestamp
	private Date created_date;
	
	 @CreationTimestamp
	private Date upadated_date;

	public int getLogin_id() {
		return login_id;
	}

	public void setLogin_id(int login_id) {
		this.login_id = login_id;
	}

	public String getLogin_user_name() {
		return login_user_name;
	}

	public void setLogin_user_name(String login_user_name) {
		this.login_user_name = login_user_name;
	}

	public String getPassword_ID() {
		return password_ID;
	}

	public void setPassword_ID(String password_ID) {
		this.password_ID = password_ID;
	}

	public String getEmail_Id() {
		return email_Id;
	}

	public void setEmail_Id(String email_Id) {
		this.email_Id = email_Id;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public Date getCreated_date() {
		return created_date;
	}

	public void setCreated_date(Date created_date) {
		this.created_date = created_date;
	}

	public Date getUpadated_date() {
		return upadated_date;
	}

	public void setUpadated_date(Date upadated_date) {
		this.upadated_date = upadated_date;
	}

	@Override
	public String toString() {
		return "user [login_id=" + login_id + ", login_user_name=" + login_user_name + ", password_ID=" + password_ID
				+ ", email_Id=" + email_Id + ", first_name=" + first_name + ", last_name=" + last_name
				+ ", created_date=" + created_date + ", upadated_date=" + upadated_date + "]";
	}
	 
	 

	/*public int getLogin_id() {
		return login_id;
	}

	public void setLogin_id(int login_id) {
		this.login_id = login_id;
	}

	public String getLogin_user_name() {
		return login_user_name;
	}

	public void setLogin_user_name(String login_user_name) {
		this.login_user_name = login_user_name;
	}

	public String getPassword_ID() {
		return password_ID;
	}

	public void setPassword_ID(String password_ID) {
		this.password_ID = password_ID;
	}

	public String getEmail_Id() {
		return email_Id;
	}

	public void setEmail_Id(String email_Id) {
		this.email_Id = email_Id;
	}

	public Date getCreated_date() {
		return created_date;
	}

	public void setCreated_date(Date created_date) {
		this.created_date = created_date;
	}

	public Date getUpadated_date() {
		return upadated_date;
	}

	public void setUpadated_date(Date upadated_date) {
		this.upadated_date = upadated_date;
	}

	@Override
	public String toString() {
		return "user [login_id=" + login_id + ", login_user_name=" + login_user_name + ", password_ID=" + password_ID
				+ ", email_Id=" + email_Id + ", created_date=" + created_date + ", upadated_date=" + upadated_date
				+ "]";
	}*/
	
	

}
