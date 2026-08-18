package com.meemprestaai.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.meemprestaai.entities.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Long> {

}