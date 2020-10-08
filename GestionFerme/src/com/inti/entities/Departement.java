package com.inti.entities;
import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Departement  implements Serializable{

	long idDepartement;
	String nom;
	String region;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private  static  final  long serialVersionUID = 1L;
	
	@OneToMany
	private Departement Ferme;

	public Departement() {
		super();
	}

	public long getIdDepartement() {
		return idDepartement;
	}

	public void setIdDepartement(long idDepartement) {
		this.idDepartement = idDepartement;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public Departement getFerme() {
		return Ferme;
	}

	public void setFerme(Departement ferme) {
		Ferme = ferme;
	}
	
	
}
