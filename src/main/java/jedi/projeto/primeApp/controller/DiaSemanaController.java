package jedi.projeto.primeApp.controller;

import jedi.projeto.primeApp.service.DiaSemanaService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/dias")
@RestController
@RequiredArgsConstructor
public class DiaSemanaController {
    private DiaSemanaService diaSemanaService;
}
