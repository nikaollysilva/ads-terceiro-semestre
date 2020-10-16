package br.com.bandtec.projetojpa4.controller;


import br.com.bandtec.projetojpa4.repositories.FabricanteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/fabricantes")
public class FabricanteController {
    @Autowired
    private FabricanteRepository repository;

    @GetMapping
    public ResponseEntity getFabricantesSimples(){
        return ResponseEntity.ok(repository.findAllSimples());
    }
}
