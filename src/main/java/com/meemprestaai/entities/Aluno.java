package com.meemprestaai.entities;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;

@Entity
public class Aluno extends Pessoa{
	@ManyToOne
	private Turma turma;
	
	public Aluno() {
		super();
	}
	public Aluno(String nome, Turma turma) {
		super(nome);
		this.turma = turma;
	}

	public Turma getTurma() {
		return turma;
	}

	public void setTurma(Turma turma) {
		this.turma = turma;
	}

}
