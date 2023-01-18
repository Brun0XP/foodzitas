package br.edu.ifpb.foodzitas.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND, reason = "Receita não existe!")
public class ReceitaNaoEncontradaException extends Exception{
}
