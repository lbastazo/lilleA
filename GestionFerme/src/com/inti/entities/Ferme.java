package com.inti.entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Ferme  implements Serializable{

	long idFerme;
	String nom;
	Date dateAchat;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private  static  final  long serialVersionUID = 1L;
	
	@OneToMany
	private Animal animal;
	@OneToOne
	private Gerant gerant;
	@OneToOne
	private Departement departement;
	
	public Ferme() {
		super();
	}

	public long getIdFerme() {
		return idFerme;
	}

	public void setIdFerme(long idFerme) {
		this.idFerme = idFerme;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Date getDateAchat() {
		return dateAchat;
	}

	public void setDateAchat(Date dateAchat) {
		this.dateAchat = dateAchat;
	}

	public Animal getAnimal() {
		return animal;
	}

	public void setAnimal(Animal animal) {
		this.animal = animal;
	}

	public Gerant getGerant() {
		return gerant;
	}

	public void setGerant(Gerant gerant) {
		this.gerant = gerant;
	}

	public Departement getDepartement() {
		return departement;
	}

	public void setDepartement(Departement departement) {
		this.departement = departement;
	}


}
