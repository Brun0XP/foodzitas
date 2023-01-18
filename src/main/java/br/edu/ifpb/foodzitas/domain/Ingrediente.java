package br.edu.ifpb.foodzitas.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Ingrediente {

    @Id
    private Integer id;

    private String nome;
}
