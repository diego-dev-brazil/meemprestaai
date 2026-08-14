package services;

import java.time.LocalDateTime;

import entities.Emprestimo;
import entities.Equipamento;
import entities.Pessoa;

public class ServicoEmprestimo {
	public void realizarEmprestimo (Pessoa pessoa, Equipamento equipamento) {
		LocalDateTime momento = LocalDateTime.now();
		Emprestimo emprestimo = new Emprestimo (momento, momento.plusWeeks(1),pessoa,equipamento);
		System.out.println("\nEmprestimo bem sucedido!");
	}
}
