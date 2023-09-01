package jedi.projeto.primeApp.exception;

import jedi.projeto.primeApp.model.entity.Tarefa;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
public class TratamentoGlobalException {
    @ExceptionHandler(value
            = {IllegalArgumentException.class, IllegalStateException.class})
    private ResponseEntity<Object> handleRecursoNaoEncontradoException(RuntimeException ex, WebRequest request) {
        return ResponseEntity.ok().build();
    }
}
