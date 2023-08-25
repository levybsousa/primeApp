package jedi.projeto.primeApp.model.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class Tarefa {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "tarefa_sequence")
    @SequenceGenerator(name = "tarefa_sequence", sequenceName = "tar_seq")
    private Long id;
    private String nome;
    private String diaSemana;
}
