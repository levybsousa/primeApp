package jedi.projeto.primeApp.repository;

import jedi.projeto.primeApp.model.entity.DiaSemana;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface DiaSemanaRepository extends JpaRepository<DiaSemana , Long> {

    Optional<DiaSemana> getDiaSemanaByNome(String nome);
}
