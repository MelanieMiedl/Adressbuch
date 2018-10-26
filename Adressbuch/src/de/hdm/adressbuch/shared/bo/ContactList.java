package de.hdm.adressbuch.shared.bo;

public class ContactList extends BusinessObject {
	
	private static final long serialVersionUID = 1L;
	private int owner;
	private String titel; 
	
	
	public int getOwner() {
		return owner;
	}
	
	public void setOwner(int owner) {
		this.owner = owner;
	}

	public String getTitel() {
		return titel;
	}

	public void setTitel(String titel) {
		this.titel = titel;
	} 
	
	
}
