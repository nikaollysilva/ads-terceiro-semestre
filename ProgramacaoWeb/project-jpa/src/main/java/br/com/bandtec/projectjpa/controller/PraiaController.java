package br.com.bandtec.projectjpa.controller;

import br.com.bandtec.projectjpa.domain.Praia;
import br.com.bandtec.projectjpa.repositories.PraiaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/praias")
public class PraiaController {

    @Autowired
    private PraiaRepository repository;

    @GetMapping
    public ResponseEntity getPraias(){
        return repository.count() > 0
            ? ResponseEntity.ok(repository.findAll())
            : ResponseEntity.noContent().build();

    }

    @PostMapping
    public ResponseEntity criar(@RequestBody Praia novaPraia){
        repository.save(novaPraia);
        return ResponseEntity.created(null).build();
    }

    @GetMapping("/{id}")
    public ResponseEntity getPraia(@PathVariable int id){
        return repository.existsById(id)
        ? ResponseEntity.ok(repository.findById(id).get())
        : ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity deletePraia(@PathVariable int id){
        repository.deleteById(id);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/dados-gerais")
    public ResponseEntity dadosGerais(){
        return  ResponseEntity.ok("Praias com menos de 9000: " +
                repository.findByTamanhoLessThan(9000.0) +
                "\n Praias contendo 'amor': "+
                repository.findByNomeContains("amor")+
                "\n Quantas praias maiores que 200? "+
                repository.countByTamanhoGreaterThan(200.0)+
                "\n Existe praia com 0 de tamanho? "+
                repository.existsByTamanho(0.0)+
                "\n Existe 'praia da bandtec'? "+
                repository.existsByNome("praia da bandtec"));
    }
}
