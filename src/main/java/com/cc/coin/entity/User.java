package com.cc.coin.entity;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user")
public class User {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;	
	@Column
	private String password;
	@Column
	private String SSID;
	@Column(unique=true, nullable=false) 
	private String email;
	@Column
	private String name;
	@Column
	private String surname;
	@Column
	private String telephone;
	@Column
	private String adres;
	@Column
	private Date birthdate;

	
	public User(int id, String password, String sSID, String email, String name, String surname, String telephone,
			String adres, Date birthdate) {
		super();
		this.id = id;
		this.password = password;
		SSID = sSID;
		this.email = email;
		this.name = name;
		this.surname = surname;
		this.telephone = telephone;
		this.adres = adres;
		this.birthdate = birthdate;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getSSID() {
		return SSID;
	}
	public void setSSID(String sSID) {
		SSID = sSID;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public String getAdres() {
		return adres;
	}
	public void setAdres(String adres) {
		this.adres = adres;
	}
	public Date getBirthdate() {
		return birthdate;
	}
	public void setBirthdate(Date birthdate) {
		this.birthdate = birthdate;
	}

	
}
