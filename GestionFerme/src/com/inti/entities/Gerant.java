package com.inti.entities;
import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;


@Entity

public class Gerant  implements Serializable{

	long idGerant;
	String nom;
	String prenom;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private  static  final  long serialVersionUID = 1L;
	
	@ManyToOne
	private Gerant Ferme;

	public Gerant() {
		super();
	}

	public long getIdGerant() {
		return idGerant;
	}

	public void setIdGerant(long idGerant) {
		this.idGerant = idGerant;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public Gerant getFerme() {
		return Ferme;
	}

	public void setFerme(Gerant ferme) {
		Ferme = ferme;
	}
	
	
}

