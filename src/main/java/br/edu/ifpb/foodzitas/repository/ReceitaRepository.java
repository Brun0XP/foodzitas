package br.edu.ifpb.foodzitas.repository;

import br.edu.ifpb.foodzitas.domain.Receita;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReceitaRepository extends JpaRepository<Receita, Integer> {

    Receita findByNomeContaining(String nome);
}
