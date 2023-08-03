package jedi.projeto.primeApp.service;

import jedi.projeto.primeApp.model.entity.Tarefa;
import jedi.projeto.primeApp.repository.TarefaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TarefaService {
    
    private final TarefaRepository tarefaRepository;

    public List<Tarefa> getAll() {
        return null;
    }

    public Tarefa getById(Long id) {
        return null;
    }

    public Tarefa save(Tarefa tarefa) {
        return null;
    }

    public Tarefa update(Long id, Tarefa tarefa) {
        return null;
    }

    public void delete(Long id) {

    }
}
