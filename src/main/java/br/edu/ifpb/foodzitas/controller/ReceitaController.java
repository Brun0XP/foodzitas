package br.edu.ifpb.foodzitas.controller;

import br.edu.ifpb.foodzitas.domain.Receita;
import br.edu.ifpb.foodzitas.exception.ReceitaNaoEncontradaException;
import br.edu.ifpb.foodzitas.repository.ReceitaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/receitas")
public class ReceitaController {

    @Autowired
    private ReceitaRepository receitaRepository;

    @GetMapping
    public List<Receita> buscarReceitas(@RequestParam(required = false) String nome) {
        if (nome != null && !nome.isBlank()) {
            return receitaRepository.findAllByNomeContainingIgnoreCaseOrderByDataCriacaoDesc(nome);
        }
        return receitaRepository.findAllByOrderByDataCriacaoDesc();
    }

    @GetMapping("/{id}")
    public Receita buscarReceitaPorId(@PathVariable Integer id) throws ReceitaNaoEncontradaException {
        return receitaRepository.findById(id).orElseThrow(ReceitaNaoEncontradaException::new);
    }

    @PostMapping
    public Receita criarReceita(@RequestBody Receita request) {
        return receitaRepository.save(request);
    }

    @PutMapping
    public Receita alterarReceita(@RequestBody Receita request) {
        return receitaRepository.save(request);
    }

    @DeleteMapping("{id}")
    public void deletarReceita(@PathVariable Integer id) {
        receitaRepository.deleteById(id);
    }
}
