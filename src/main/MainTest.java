package main;

import dao.IUserDAO;
import dao.UserDAO;
import model.User;

public class MainTest {

	public static void main(String[] args) {
		IUserDAO dao = new UserDAO();
		User utilisateur = new User("Admin", "123456");
//		
//		dao.addUser(utilisateur);
		
		System.out.println(dao.findUser(utilisateur));
		
		
	}

}
