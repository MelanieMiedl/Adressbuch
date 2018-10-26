package de.hdm.adressbuch.shared.bo;

public class Property extends BusinessObject {
	
	private static final long serialVersionUID = 1L;
	private String name; 
	private String value;
	private int owner; 
//	private int contact;
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getValue() {
		return value;
	}
	
	public void setValue(String value) {
		this.value = value;
	}
	
	public int getOwner() {
		return owner;
	}
	
	public void setOwner(int owner) {
		this.owner = owner;
	}
	
//	public int getContact() {
//		return contact;
//	}
//	
//	public void setContact(int contact) {
//		this.contact = contact;
//	}	
	

}
