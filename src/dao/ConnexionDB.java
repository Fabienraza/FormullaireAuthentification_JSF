/***************************************************************
 * CLASSE CONTENANT LES METHODES DE CONNEXION A LA BASE DONNEE *
 * Classe utilisant design pattern singleton pour se connecter *
 *  à la base de donnée                                        *
 ***************************************************************/

package dao;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ConnexionDB {	
	
	
	private static SessionFactory factory = null;
	private static ConnexionDB instance = null;
	

/************************************************************
 * Constructeur par défaut pour créer un object ConnexionDB *
 * Mis en private afin d'eviter la creation d'une autre     *
 * connexion                                                *
 ************************************************************/
	
	private ConnexionDB() {

	}


/********************************************************************************
 * Creation d'une nouvelle configuration de la connexion avec la base de donnée *
 ********************************************************************************/

	public static SessionFactory getFactory() {
		if(factory == null) {
			factory = new Configuration().configure("/ressources/hibernate.cfg.xml").buildSessionFactory();
		}
		return factory;
	}
	
	
	
/********************************************************************
 * Creation d'une nouvelle instance de connexion à la bas de donnée *	
 ********************************************************************/
	
	public static ConnexionDB getInstance() {
		if (instance == null) {
			instance = new ConnexionDB();
		}
		return instance;
	}
	
	
}
