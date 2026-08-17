package com.meemprestaai.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Turma {
	@Id
	private String codigo;
	private String sala;
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getSala() {
		return sala;
	}
	public void setSala(String sala) {
		this.sala = sala;
	}
}
