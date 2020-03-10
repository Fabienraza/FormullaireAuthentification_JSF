package model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {
	
	@Id
	private String userName;
	private String password;
	
	
/*****************
 * CONSTRUCTEURS *	
 *****************/
	public User() {

	}
	
	
	public User(String userName, String password) {
		this.userName = userName;
		this.password = password;
	}

	
	
/********************
 * GETTER ET SETTER *	
 ********************/
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
/*************************************************************
 * METHODE TO STRING POUR AFFICHER LA DESCRIPTION DE L'OBJET * 	
 *************************************************************/
	
	@Override
	public String toString() {
		return "User [userName=" + userName + ", password=" + password + "]";
	}
	
	
}
