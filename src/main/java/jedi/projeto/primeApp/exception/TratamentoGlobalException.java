package jedi.projeto.primeApp.exception;

import jedi.projeto.primeApp.model.entity.Tarefa;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
public class TratamentoGlobalException {

    @ExceptionHandler(value = {RecursoNaoEncontradoException.class})
    private ResponseEntity<ExceptionDto> handleRecursoNaoEncontradoException(RecursoNaoEncontradoException exception  , WebRequest request) {
        ExceptionDto responseDto = new ExceptionDto();
        responseDto.setMensagem(exception.getMessage());
        responseDto.setStatusCode(404L);
            return ResponseEntity.ok(responseDto);
    }
}
