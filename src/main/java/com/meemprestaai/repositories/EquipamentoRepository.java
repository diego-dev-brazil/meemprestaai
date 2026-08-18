package com.meemprestaai.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.meemprestaai.entities.Equipamento;

public interface EquipamentoRepository extends JpaRepository<Equipamento, String> {

}