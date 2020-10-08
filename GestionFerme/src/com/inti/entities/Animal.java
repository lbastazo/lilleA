package com.inti.entities;

import java.io.Serializable;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

import javax.persistence.OneToOne;


@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="role",discriminatorType=DiscriminatorType.STRING)
public class Animal  implements Serializable{

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private  static  final  long serialVersionUID = 1L;
	
	long idAnimal;
	boolean etat;
	
	@OneToOne
	private Ferme ferme;

	@OneToOne
	private Eleveur eleveur;
	
	
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


	public Ferme getFerme() {
		return ferme;
	}


	public void setFerme(Ferme ferme) {
		this.ferme = ferme;
	}


	public Eleveur getEleveur() {
		return eleveur;
	}


	public void setEleveur(Eleveur eleveur) {
		this.eleveur = eleveur;
	}
	
}
