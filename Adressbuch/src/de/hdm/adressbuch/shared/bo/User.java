package de.hdm.adressbuch.shared.bo;

import de.hdm.adressbuch.shared.bo.BusinessObject;
//import java.io.Serializable;
import com.google.gwt.user.client.rpc.IsSerializable;


public class User extends BusinessObject implements IsSerializable {

	private static final long serialVersionUID = 1L;
	private String mail = "";


	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

}
