package jedi.projeto.primeApp.model.entity;

import jakarta.persistence.*;
import jedi.projeto.primeApp.enumeration.TarefaEnum;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class DiaSemana {
    private TarefaEnum tarefaEnum;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "diaSemana_sequence")
    @SequenceGenerator(name = "diaSemana_sequence", sequenceName = "dia_seq")
    private Long id;
    private String nome;
}
