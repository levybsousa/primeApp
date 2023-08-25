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

        Tarefa tarefa = tarefaService.getById(id);
        return ResponseEntity.ok(tarefa);
    }

    @PostMapping
    public Tarefa save(@RequestBody Tarefa tarefa) {
        return tarefaService.save(tarefa);
    }

    @PutMapping("/{id}")
    public Tarefa update(@PathVariable Long id, @RequestBody Tarefa tarefa) {
        return tarefaService.update(id, tarefa);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        tarefaService.delete(id);
    }

}
