package entities;

import enum_entities.Categoria;
import enum_entities.Status;

public class Equipamento {
	private  String modelo;
	private String numeroSerie;
	private Status status;
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
