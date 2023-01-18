package br.edu.ifpb.foodzitas.controller;

import br.edu.ifpb.foodzitas.domain.Receita;
import br.edu.ifpb.foodzitas.repository.ReceitaRepository;
import jakarta.websocket.server.PathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/receitas")
public class ReceitaController {

    @Autowired
    private ReceitaRepository receitaRepository;

    @GetMapping()
    public Receita buscarReceitas(@RequestParam String nome) {
        return receitaRepository.findByNomeContaining(nome);
    }
}
