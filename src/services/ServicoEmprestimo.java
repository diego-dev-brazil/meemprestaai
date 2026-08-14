package services;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import entities.Emprestimo;
import entities.Equipamento;
import entities.Pessoa;
import enum_entities.Status;

public class ServicoEmprestimo {
	private List<Emprestimo> emprestimos = new ArrayList<>();
	public void realizarEmprestimo (Pessoa pessoa, Equipamento equipamento) {
		LocalDateTime momento = LocalDateTime.now();
		Emprestimo emprestimo = new Emprestimo (momento, momento.plusWeeks(1),pessoa,equipamento);
		emprestimo.getEquipamento().setStatus(Status.EMPRESTADO);
		emprestimos.add(emprestimo);
		System.out.println("\nEmprestimo bem sucedido!");
	}
	public void realizarDevolucao (Emprestimo emprestimo ) {
		if (!emprestimos.contains(emprestimo)) {
	        System.out.println("Empréstimo não encontrado.");
	        return;
	    }

	    if (emprestimo.getQuandoFoiDevolvido() != null) {
	        System.out.println("Empréstimo já encerrado.");
	        return;
	    }

	    emprestimo.getEquipamento().setStatus(Status.DISPONIVEL);
	    emprestimo.setQuandoFoiDevolvido(LocalDateTime.now());
	}
}
