package com.eversoft.traverse.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name="users")
public class User implements Serializable{
	private static final long serialVersionUID = 1L;
		
	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column(name="first_name")
	private String firstName;
	
	@Column(name="middle_name")
	private String middleName;
	
	@Column(name="last_name")
	private String lastName;
	
	@Column(name="nationality")
	private String nationality;
	
	@Column(name="date_of_birth")
	public Date dateOfBirth;
	
	@Column(name="visaId")
	private int visaId;
	
	@Transient
	private VisaInformation visaInformation;
	
	public User() {
		
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public int getVisaId() {
		return visaId;
	}

	public void setVisaId(int visaId) {
		this.visaId = visaId;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", firstName=" + firstName + ", middleName=" + middleName + ", lastName=" + lastName
				+ ", nationality=" + nationality + ", dateOfBirth=" + dateOfBirth + ", visaId=" + visaId + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public VisaInformation getVisaInformation() {
		return visaInformation;
	}

	public void setVisaInformation(VisaInformation visaInformation) {
		this.visaInformation = visaInformation;
	}
	
	
	
	
	
	
	
}
