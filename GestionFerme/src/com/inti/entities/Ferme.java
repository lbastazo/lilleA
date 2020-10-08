package com.inti.entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Ferme  implements Serializable{

	long idFerme;
	String nom;
	Date dateAchat;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private  static  final  long serialVersionUID = 1L;
	
	@OneToMany
	private Ferme Animal;

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

	public Ferme getAnimal() {
		return Animal;
	}

	public void setAnimal(Ferme animal) {
		Animal = animal;
	}

	
}
