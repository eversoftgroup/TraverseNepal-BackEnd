package com.eversoft.traverse.model;

import java.util.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="visa_information")
public class VisaInformation {
	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column(name="document_type")
	private String documentType;
	
	@Column(name="document_number")
	private String documentNumber;
	
	@Column(name="expiry_date")
	private String expiryDate;
	
	@Column(name="visa_type")
	private String visaType;
	
	@Column(name="visa_period")
	private int visaPeriod;
	
	public VisaInformation() {
		
	}

	public String getDocumentType() {
		return documentType;
	}

	public void setDocumentType(String documentType) {
		this.documentType = documentType;
	}

	public String getDocumentNumber() {
		return documentNumber;
	}

	public void setDocumentNumber(String documentNumber) {
		this.documentNumber = documentNumber;
	}

	public String getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(String expiryDate) {
		this.expiryDate = expiryDate;
	}

	public String getVisaType() {
		return visaType;
	}

	public void setVisaType(String visaType) {
		this.visaType = visaType;
	}

	public int getVisaPeriod() {
		return visaPeriod;
	}

	public void setVisaPeriod(int visaPeriod) {
		this.visaPeriod = visaPeriod;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	
	
}
