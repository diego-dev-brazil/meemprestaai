package com.meemprestaai.entities;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Emprestimo {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long id;
	
	private LocalDateTime momentoEmprestimo;
	private LocalDateTime momentoDevolucao;
	private LocalDateTime quandoFoiDevolvido;
	
	@ManyToOne
	private Pessoa pessoa;
	
	@ManyToOne
	private Equipamento equipamento;
	
	public Emprestimo() {
		
	}
	public Emprestimo(LocalDateTime momentoEmprestimo, LocalDateTime momentoDevolucao, Pessoa pessoa,
			Equipamento equipamento) {
		this.momentoEmprestimo = momentoEmprestimo;
		this.momentoDevolucao = momentoDevolucao;
		this.pessoa = pessoa;
		this.equipamento = equipamento;
		quandoFoiDevolvido = null;
	}
	public LocalDateTime getMomentoEmprestimo() {
		return momentoEmprestimo;
	}
	public void setMomentoEmprestimo(LocalDateTime momentoEmprestimo) {
		this.momentoEmprestimo = momentoEmprestimo;
	}
	public LocalDateTime getMomentoDevolucao() {
		return momentoDevolucao;
	}
	public void setMomentoDevolucao(LocalDateTime momentoDevolucao) {
		this.momentoDevolucao = momentoDevolucao;
	}
	public Pessoa getPessoa() {
		return pessoa;
	}
	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}
	public Equipamento getEquipamento() {
		return equipamento;
	}
	public void setEquipamento(Equipamento equipamento) {
		this.equipamento = equipamento;
	}
	public LocalDateTime getQuandoFoiDevolvido() {
		return quandoFoiDevolvido;
	}
	public void setQuandoFoiDevolvido(LocalDateTime quandoFoiDevolvido) {
		this.quandoFoiDevolvido = quandoFoiDevolvido;
	}
	public Long getId() {
		return id;
	}
	
}
