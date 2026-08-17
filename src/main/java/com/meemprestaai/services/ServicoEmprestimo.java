package com.meemprestaai.services;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.stereotype.Service;

import com.meemprestaai.entities.Emprestimo;
import com.meemprestaai.entities.Equipamento;
import com.meemprestaai.entities.Pessoa;
import com.meemprestaai.enum_entities.Status;
import com.meemprestaai.repositories.EmprestimoRepository;

@Service
public class ServicoEmprestimo {
	
	private final EmprestimoRepository emprestimoRepository;
	
	public ServicoEmprestimo(EmprestimoRepository emprestimoRepository) {
		this.emprestimoRepository = emprestimoRepository;
	}
	public Emprestimo realizarEmprestimo (Pessoa pessoa, Equipamento equipamento) {
		LocalDateTime momento = LocalDateTime.now();
		Emprestimo emprestimo = new Emprestimo (momento, momento.plusWeeks(1),pessoa,equipamento);
		equipamento.setStatus(Status.EMPRESTADO);
		return emprestimoRepository.save(emprestimo);
	}
	public Emprestimo realizarDevolucao (Emprestimo emprestimo ) {
	    if (emprestimo.getQuandoFoiDevolvido() != null) {
	        throw new RuntimeException("Empréstimo já encerrado.");
	    }

	    emprestimo.getEquipamento().setStatus(Status.DISPONIVEL);
	    emprestimo.setQuandoFoiDevolvido(LocalDateTime.now());
	    return emprestimoRepository.save(emprestimo);
	}
	
	public Emprestimo buscarPorId (Long id) {
		return emprestimoRepository.findById(id).orElse(null);
	}
	public List<Emprestimo> buscarTodos () {
		return emprestimoRepository.findAll();
	}
	public void deletar (Long id) {
		emprestimoRepository.deleteById(id);
	}
}
