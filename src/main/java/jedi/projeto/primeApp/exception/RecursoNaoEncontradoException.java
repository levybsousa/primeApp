package jedi.projeto.primeApp.exception;

public class RecursoNaoEncontradoException extends RuntimeException {

    public RecursoNaoEncontradoException() {
        super("Recurso não encontrado");
    }
}
