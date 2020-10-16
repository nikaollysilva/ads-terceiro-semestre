package br.com.bandtec.projetojpa4.controller;

import br.com.bandtec.projetojpa4.repositories.CarroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/carros")
public class CarroController {

    @Autowired
    private CarroRepository repository;

    @GetMapping
    public ResponseEntity getCarros(){
        return ResponseEntity.ok(repository.findAll());
    }


    @GetMapping("/simples")
    public ResponseEntity getCarrosSimples(){
        return ResponseEntity.ok(repository.findAllSimples());
    }
}
