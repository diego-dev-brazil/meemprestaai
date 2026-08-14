package repositories;

import entities.Emprestimo;
import enum_entities.Status;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class EmprestimoRepository {

    // Lista simulando a tabela de Empréstimos no banco de dados
    private List<Emprestimo> tabelaEmprestimos = new ArrayList<>();

    // 1. Salvar ou atualizar um empréstimo
    public Emprestimo salvar(Emprestimo emprestimo) {
        // Se o empréstimo já existe, remove a versão antiga e atualiza
        buscarPorId(emprestimo.getId()).ifPresent(e -> tabelaEmprestimos.remove(e));
        tabelaEmprestimos.add(emprestimo);
        return emprestimo;
    }

    // 2. Buscar empréstimo por ID
    public Optional<Emprestimo> buscarPorId(Long id) {
        return tabelaEmprestimos.stream()
                .filter(e -> e.getId().equals(id))
                .findFirst();
    }

    // 3. Listar todos os empréstimos
    public List<Emprestimo> buscarTodos() {
        return new ArrayList<>(tabelaEmprestimos);
    }

    // 4. Buscar empréstimos ativos de um determinado usuário (pelo documento/CPF ou ID)
    public List<Emprestimo> buscarPorUsuarioId(Long pessoaId) {
        return tabelaEmprestimos.stream()
                .filter(e -> e.getPessoa().getId().equals(pessoaId) && e.getMomentoDevolucao() == null)
                .collect(Collectors.toList());
    }

    // 5. Deletar um registro de empréstimo (se necessário)
    public boolean deletarPorId(Long id) {
        return tabelaEmprestimos.removeIf(e -> e.getId().equals(id));
    }
}