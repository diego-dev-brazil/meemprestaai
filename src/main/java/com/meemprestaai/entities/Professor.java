package com.meemprestaai.entities;

import jakarta.persistence.Entity;

@Entity
public class Professor extends Pessoa{
	private String materia;

	public Professor() {
		super();
	}
	public Professor(String nome, String materia) {
		super(nome);
		this.materia = materia;
	}

	public String getMateria() {
		return materia;
	}

	public void setMateria(String materia) {
		this.materia = materia;
	}
}
