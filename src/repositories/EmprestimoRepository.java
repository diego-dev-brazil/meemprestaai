package repositories;

import entities.Emprestimo;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class EmprestimoRepository {

    private List<Emprestimo> tabelaEmprestimos = new ArrayList<>();

    public Emprestimo salvar(Emprestimo emprestimo) {
        buscarPorId(emprestimo.getId()).ifPresent(e -> tabelaEmprestimos.remove(e));
        tabelaEmprestimos.add(emprestimo);
        return emprestimo;
    }

    public Optional<Emprestimo> buscarPorId(Long id) {
        return tabelaEmprestimos.stream()
                .filter(e -> e.getId().equals(id))
                .findFirst();
    }

    public List<Emprestimo> buscarTodos() {
        return new ArrayList<>(tabelaEmprestimos);
    }

    public List<Emprestimo> buscarPorUsuarioId(Long pessoaId) {
        return tabelaEmprestimos.stream()
                .filter(e -> e.getPessoa().getId().equals(pessoaId) && e.getMomentoDevolucao() == null)
                .collect(Collectors.toList());
    }

    public boolean deletarPorId(Long id) {
        return tabelaEmprestimos.removeIf(e -> e.getId().equals(id));
    }
}