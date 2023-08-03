package jedi.projeto.primeApp.repository;

import jedi.projeto.primeApp.model.entity.Tarefa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface TarefaRepository extends JpaRepository<Tarefa, Long> {

    Optional<Tarefa> getTarefaByNome(String nome);
}
