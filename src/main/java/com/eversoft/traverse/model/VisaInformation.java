package com.eversoft.traverse.model;

import java.util.*;

public class VisaInformation {
	private String documentType;
	private String documentNumber;
	private Date expiryDate;
	private String visaType;
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

	public Date getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(Date expiryDate) {
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
	
	
}
