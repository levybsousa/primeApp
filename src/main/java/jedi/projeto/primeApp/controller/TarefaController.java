package jedi.projeto.primeApp.controller;

import jedi.projeto.primeApp.model.entity.Tarefa;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/tarefas")
@RestController
@RequiredArgsConstructor
public class TarefaController {

    @GetMapping
    public List<Tarefa> getAll(){
        return null;
    }

    @GetMapping("/{id}")
    public Tarefa getById(@PathVariable Long id){
        return null;
    }
    @PostMapping
    public Tarefa save(@RequestBody Tarefa tarefa ){
        return null;
    }
    @PutMapping("/{id}")
    public Tarefa update(@PathVariable Long id , @RequestBody Tarefa tarefa){
        return null;
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){

    }

}
