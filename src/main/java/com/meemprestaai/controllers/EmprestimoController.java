package com.meemprestaai.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.meemprestaai.dtos.EmprestimoRequest;
import com.meemprestaai.entities.Emprestimo;
import com.meemprestaai.entities.Equipamento;
import com.meemprestaai.entities.Pessoa;
import com.meemprestaai.repositories.EquipamentoRepository;
import com.meemprestaai.repositories.PessoaRepository;
import com.meemprestaai.services.ServicoEmprestimo;

@RestController
@RequestMapping("/emprestimos")
public class EmprestimoController {
	
	private final ServicoEmprestimo servicoEmprestimo;
	private final PessoaRepository pessoaRepository;
    private final EquipamentoRepository equipamentoRepository;
	
	public EmprestimoController(
            ServicoEmprestimo servicoEmprestimo,
            PessoaRepository pessoaRepository,
            EquipamentoRepository equipamentoRepository) {

        this.servicoEmprestimo = servicoEmprestimo;
        this.pessoaRepository = pessoaRepository;
        this.equipamentoRepository = equipamentoRepository;
    }
	
	@GetMapping
	public List<Emprestimo> buscarTodos(){
		return servicoEmprestimo.buscarTodos();
	}
	
	@GetMapping("/{id}")
	public Emprestimo buscarPorId (@PathVariable Long id) {
		return servicoEmprestimo.buscarPorId(id);
	}
	
	@PostMapping
	public Emprestimo RealizarEmprestimo(@RequestBody EmprestimoRequest request) {
		Pessoa pessoa = pessoaRepository.findById (request.getPessoaId()).orElseThrow(() -> new RuntimeException ("NAO ACHEI"));
		Equipamento equipamento = equipamentoRepository
                .findById(request.getEquipamentoId())
                .orElseThrow(() -> new RuntimeException("Equipamento não encontrado"));
		return servicoEmprestimo.realizarEmprestimo(pessoa, equipamento);
	
	}
}
