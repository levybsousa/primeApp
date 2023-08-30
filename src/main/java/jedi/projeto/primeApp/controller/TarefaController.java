package jedi.projeto.primeApp.controller;

import jedi.projeto.primeApp.model.entity.Tarefa;
import jedi.projeto.primeApp.service.TarefaService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/tarefas")
@RestController
@RequiredArgsConstructor
public class TarefaController {

    private final TarefaService tarefaService;

    @GetMapping
    public ResponseEntity<List<Tarefa>> getAll() {
        List<Tarefa> tarefaResponse = tarefaService.getAll();
        return ResponseEntity.ok(tarefaResponse);

    }

    @GetMapping("/{id}")
    public ResponseEntity<Tarefa> getById(@PathVariable Long id) {

        Tarefa tarefaResponse = tarefaService.getById(id);
        return ResponseEntity.ok(tarefaResponse);
    }

    @PostMapping
    public ResponseEntity<Tarefa> save(@RequestBody Tarefa tarefa) {

        Tarefa tarefaResponse = tarefaService.save(tarefa);
        return ResponseEntity.ok(tarefaResponse);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Tarefa> update(@PathVariable Long id, @RequestBody Tarefa tarefa) {
        Tarefa tarefaResponse = tarefaService.update(id, tarefa);
        return ResponseEntity.ok(tarefaResponse);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        tarefaService.delete(id);
        return ResponseEntity.ok().build();

    }

}
