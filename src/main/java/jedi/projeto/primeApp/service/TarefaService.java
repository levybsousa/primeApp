package jedi.projeto.primeApp.service;

import jedi.projeto.primeApp.enumeration.DiaSemanaEnum;
import jedi.projeto.primeApp.exception.RecursoNaoEncontradoException;
import jedi.projeto.primeApp.model.entity.Tarefa;
import jedi.projeto.primeApp.repository.TarefaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class TarefaService {

    private final TarefaRepository tarefaRepository;

    public List<Tarefa> getAll() {
        List<Tarefa> result = tarefaRepository.findAll();
        return result;
    }

    public Tarefa getById(Long id) {
        Optional<Tarefa> result = tarefaRepository.findById(id);
        if (result.isPresent()) {
            return result.get();
        } else {
            throw new RecursoNaoEncontradoException("Tarefa não encontrada");
        }
    }

    public Tarefa save(Tarefa tarefa) {
        Optional<Tarefa> tarefaFromDataBase = tarefaRepository.getTarefaByNome(tarefa.getNome());

        DiaSemanaEnum diaSemana = DiaSemanaEnum.getByNome(tarefa.getDiaSemana());
        if (diaSemana == null) {
            throw new RecursoNaoEncontradoException("Dia não encotrado");
        }

        if (tarefaFromDataBase.isPresent()) {
            throw new RecursoNaoEncontradoException();
        } else {
            Tarefa result = tarefaRepository.save(tarefa);
            return result;
        }
    }

    public Tarefa update(Long id, Tarefa tarefa) {
        getById(id);

        Optional<Tarefa> tarefaFromDataBase = tarefaRepository.getTarefaByNome(tarefa.getNome());

        if (tarefaFromDataBase.isPresent() && tarefaFromDataBase.get().getId() != tarefa.getId()) {
            throw new RecursoNaoEncontradoException();
        }
        Tarefa result = tarefaRepository.save(tarefa);
        return result;
    }

    public void delete(Long id) {
        getById(id);
        tarefaRepository.deleteById(id);

    }
}
