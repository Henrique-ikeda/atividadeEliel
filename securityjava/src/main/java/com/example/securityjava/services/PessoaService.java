package com.example.securityjava.services;

import com.example.securityjava.models.PessoaModel;
import com.example.securityjava.repositories.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PessoaService {

    @Autowired
    PessoaRepository pessoaRepository;

    public List<PessoaModel> findAll(){
        return pessoaRepository.findAll();

    }

    public PessoaModel criarPessoa(PessoaModel pessoaModel){
        return pessoaRepository.save(pessoaModel);
    }
}
