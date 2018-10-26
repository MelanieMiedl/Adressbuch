package de.hdm.adressbuch.shared.bo;

public class ListManagement extends BusinessObject {
	
	private static final long serialVersionUID = 1L;
	private int contactID;
	private int listId;
	
	
	public int getContactID() {
		return contactID;
	}
	
	public void setContactID(int contactID) {
		this.contactID = contactID;
	}

	public int getListId() {
		return listId;
	}

	public void setListId(int listId) {
		this.listId = listId;
	}
	

}
