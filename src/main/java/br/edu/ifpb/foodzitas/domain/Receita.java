package br.edu.ifpb.foodzitas.domain;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;
import java.util.Set;

@Entity
@Data
public class Receita {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String nome;

    private String imagem;

    @CreationTimestamp
    private LocalDateTime dataCriacao;

    @ManyToMany()
    @JoinTable(
            name = "receita_ingrediente",
            joinColumns = @JoinColumn(name = "id_receita"),
            inverseJoinColumns = @JoinColumn(name = "id_ingrediente"))
    private Set<Ingrediente> ingredientes;

}
