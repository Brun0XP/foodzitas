package br.edu.ifpb.foodzitas.repository;

import br.edu.ifpb.foodzitas.domain.Receita;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ReceitaRepository extends JpaRepository<Receita, Integer> {

    List<Receita> findAllByOrderByDataCriacaoDesc();

    List<Receita> findAllByNomeContainingIgnoreCaseOrderByDataCriacaoDesc(String nome);

}
