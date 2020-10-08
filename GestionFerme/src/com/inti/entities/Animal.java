package com.inti.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;


@Entity
public class Animal  implements Serializable{


	long idAnimal;
	boolean etat;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private  static  final  long serialVersionUID = 1L;
	
	
	@ManyToOne
	private  Animal Ferme;


	public Animal() {
		super();
	}


	public long getIdAnimal() {
		return idAnimal;
	}


	public void setIdAnimal(long idAnimal) {
		this.idAnimal = idAnimal;
	}


	public boolean isEtat() {
		return etat;
	}


	public void setEtat(boolean etat) {
		this.etat = etat;
	}


	public Animal getFerme() {
		return Ferme;
	}


	public void setFerme(Animal ferme) {
		Ferme = ferme;
	}
	
	
}
