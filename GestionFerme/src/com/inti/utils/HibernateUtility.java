package com.inti.utils;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtility {
	private static SessionFactory sf;
	/**
	 * Constructeur redéfini comme étant privé pour interdire son appel et forcer
	 * à passer par la méthode getSessionFactory
	 */
	private HibernateUtility() {
		
	}
	// synchronized = pas de 2 exécution simultannée du code de la méthode
	public static synchronized SessionFactory getSessionFactory() {
		if(sf == null) {
			sf = new Configuration().configure().buildSessionFactory();
		}
		return sf;
	}
}
