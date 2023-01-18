package br.edu.ifpb.foodzitas.domain;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Set;

@Entity
@Data
public class Receita {

    @Id
    private Integer id;

    private String nome;

    @ManyToMany()
    @JoinTable(
            name = "receita_ingrediente",
            joinColumns = @JoinColumn(name = "id_receita"),
            inverseJoinColumns = @JoinColumn(name = "id_ingrediente"))
    private Set<Ingrediente> ingredientes;

}
