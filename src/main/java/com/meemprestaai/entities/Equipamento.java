package com.meemprestaai.entities;

import com.meemprestaai.enum_entities.Categoria;
import com.meemprestaai.enum_entities.Status;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;

@Entity
public class Equipamento {
	private  String modelo;
	
	@Id
	private String numeroSerie;
	
	@Enumerated(EnumType.STRING)
	private Status status;
	
	@Enumerated(EnumType.STRING)
	private Categoria categoria;
	
	public Equipamento() {
		
	}

	public Equipamento(String modelo, String numeroSerie, Status status, Categoria categoria) {
		this.modelo = modelo;
		this.numeroSerie = numeroSerie;
		this.status = status;
		this.categoria = categoria;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getNumeroSerie() {
		return numeroSerie;
	}

	public void setNumeroSerie(String numeroSerie) {
		this.numeroSerie = numeroSerie;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

}
