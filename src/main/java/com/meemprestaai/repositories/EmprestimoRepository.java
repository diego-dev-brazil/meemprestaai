package com.meemprestaai.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.meemprestaai.entities.Emprestimo;

public interface EmprestimoRepository extends JpaRepository<Emprestimo, Long> {

}