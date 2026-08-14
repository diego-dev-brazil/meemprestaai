package entities;

import java.time.LocalDateTime;

public class Emprestimo {
	private LocalDateTime momentoEmprestimo;
	private LocalDateTime momentoDevolucao;
	private LocalDateTime quandoFoiDevolvido;
	private Pessoa pessoa;
	private Equipamento equipamento;
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
	
}
