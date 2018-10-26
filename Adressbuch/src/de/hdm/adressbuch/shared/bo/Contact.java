package de.hdm.adressbuch.shared.bo;

import java.sql.Timestamp;

public class Contact extends BusinessObject {
	
	private static final long serialVersionUID = 1L;
	
	/**
	 * Instanzenvariablen der Klasse Contact
	 */
	private String surname;
	private String lastname;
	private Timestamp creationDate;
	private Timestamp modDate;
	private int owner; 
	
	
	public String getSurname() {
		return surname;
	}
	
	public void setSurname(String surname) {
		this.surname = surname;
	}
	
	public String getLastname() {
		return lastname;
	}
	
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	
	public Timestamp getCreationDate() {
		return creationDate;
	}
	
	public void setCreationDate(Timestamp creationDate) {
		this.creationDate = creationDate;
	}

	public Timestamp getModDate() {
		return modDate;
	}
	
	public void setModDate(Timestamp modDate) {
		this.modDate = modDate;
	}

	public int getOwner() {
		return owner;
	}

	public void setOwner(int owner) {
		this.owner = owner;
	} 

}
