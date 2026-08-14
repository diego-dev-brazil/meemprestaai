package repositories;

import entities.Equipamento;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class EquipamentoRepository {
    // A lista simula a tabela do banco de dados na memória do PC
    private List<Equipamento> tabelaEquipamentos = new ArrayList<>();

    public Equipamento salvar(Equipamento equipamento) {
        tabelaEquipamentos.add(equipamento);
        return equipamento;
    }

    public List<Equipamento> buscarTodos() {
        return tabelaEquipamentos;
    }

    public Optional<Equipamento> buscarPorId(String nserie) {
        return tabelaEquipamentos.stream()
                .filter(e -> e.getNumeroSerie().equals(nserie))
                .findFirst();
    }
}