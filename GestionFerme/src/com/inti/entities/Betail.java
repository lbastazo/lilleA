package com.inti.entities;
import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Betail extends Animal implements Serializable{

	String techElevage;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private  static  final  long serialVersionUID = 1L;

	public Betail() {
		super();
	}

	public String getTechElevage() {
		return techElevage;
	}

	public void setTechElevage(String techElevage) {
		this.techElevage = techElevage;
	}
	
	
}
