package com.meemprestaai.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.meemprestaai.entities.Emprestimo;
import com.meemprestaai.services.ServicoEmprestimo;

@RestController
@RequestMapping("/emprestimos")
public class EmprestimoController {
	
	private final ServicoEmprestimo servicoEmprestimo;
	
	public EmprestimoController (ServicoEmprestimo servicoEmprestimo) {
		this.servicoEmprestimo = servicoEmprestimo;
	}
	
	@GetMapping
	public List<Emprestimo> buscarTodos(){
		return servicoEmprestimo.buscarTodos();
	}
	@GetMapping("/{id}")
	public Emprestimo buscarPorId (@PathVariable Long id) {
		return servicoEmprestimo.buscarPorId(id);
	}
}
