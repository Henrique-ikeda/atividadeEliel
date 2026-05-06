package com.example.securityjava.models;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "TBL_PESSOAS")
@Data
public class PessoaModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nome;
}
