package com.example.securityjava.repositories;

import com.example.securityjava.models.PessoaModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PessoaRepository extends JpaRepository<PessoaModel,Long> {
}
