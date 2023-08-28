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
    public List<Tarefa> getAll() {
        return tarefaService.getAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Tarefa> getById(@PathVariable Long id) {

        Tarefa tarefaController = tarefaService.getById(id);
        return ResponseEntity.ok(tarefaController);
    }

    @PostMapping
    public ResponseEntity<Tarefa> save(@RequestBody Tarefa tarefa) {

        Tarefa tarefaController = tarefaService.save(tarefa);
        return ResponseEntity.ok(tarefaController);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Tarefa> update(@PathVariable Long id, @RequestBody Tarefa tarefa) {
        Tarefa tarefaController = tarefaService.update(id, tarefa);
        return ResponseEntity.ok(tarefaController);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        tarefaService.delete(id);
    }

}
