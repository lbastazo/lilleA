package com.inti.entities;
import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Eleveur  implements Serializable{

	long idEleveur;
	String nom;
	int age;
	boolean statut;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private  static  final  long serialVersionUID = 1L;
	
	@OneToMany
	private Eleveur Animal;

	public Eleveur() {
		super();
	}

	public long getIdEleveur() {
		return idEleveur;
	}

	public void setIdEleveur(long idEleveur) {
		this.idEleveur = idEleveur;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean isStatut() {
		return statut;
	}

	public void setStatut(boolean statut) {
		this.statut = statut;
	}

	public Eleveur getAnimal() {
		return Animal;
	}

	public void setAnimal(Eleveur animal) {
		Animal = animal;
	}
	
	
}
