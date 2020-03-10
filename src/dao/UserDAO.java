package dao;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import model.User;

public class UserDAO implements IUserDAO{

/**********************************************************************
 * Methode pour ajouter un nouveau utilisateur dans la base de donnée *
 **********************************************************************/
	@Override
	public int addUser(User user) {
		try {
			Session  session = ConnexionDB.getInstance().getFactory().openSession();
			session.beginTransaction();
			session.save(user);
			session.getTransaction().commit();
			return 0;
		} catch (HibernateException e) {
			e.printStackTrace();
			System.out.println("Erreur dans l'ajout d'un utilisateur");
			return 0;
		}
	}


/***************************************************************
 * Methode pour chercher un utilisateur dans la base de donnée *
 ***************************************************************/
	@Override
	public User findUser(User user) {
		try {
			Session  session = ConnexionDB.getInstance().getFactory().openSession();
			session.beginTransaction();
			Query q = session.createQuery("from User where userName = :identif AND password = :mdp");
				q.setParameter("identif", user.getUserName());
				q.setParameter("mdp", user.getPassword());
			User utilisateur = (User) q.uniqueResult();
			return utilisateur;
			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Erreur dans la recherche de l'utilisateur dans la base donnée");
			return null;
		}
	}
	
}
