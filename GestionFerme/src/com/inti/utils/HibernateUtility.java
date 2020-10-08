package com.inti.utils;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtility {
	private static SessionFactory sf;
	/**
	 * Constructeur red�fini comme �tant priv� pour interdire son appel et forcer
	 * � passer par la m�thode getSessionFactory
	 */
	private HibernateUtility() {
		
	}
	// synchronized = pas de 2 ex�cution simultann�e du code de la m�thode
	public static synchronized SessionFactory getSessionFactory() {
		if(sf == null) {
			sf = new Configuration().configure().buildSessionFactory();
		}
		return sf;
	}
}
