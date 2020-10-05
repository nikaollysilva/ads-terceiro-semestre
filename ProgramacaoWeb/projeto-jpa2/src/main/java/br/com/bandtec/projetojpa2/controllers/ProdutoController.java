package br.com.bandtec.projetojpa2.controllers;

import br.com.bandtec.projetojpa2.domain.Produto;
import br.com.bandtec.projetojpa2.repositories.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {

    @Autowired
    private ProdutoRepository repository;

    @PostMapping
    public ResponseEntity criar(@RequestBody Produto novoProduto){
        repository.save(novoProduto);
        return ResponseEntity.created(null).build();
    }

    @GetMapping
    public ResponseEntity pesquisar(
            @RequestParam(required = false) String nome,
            @RequestParam(required = false) String unidade,
            @RequestParam(required = false) Double preco
    ){
        Produto produtoPesquisa = new Produto(nome, unidade, preco);
        List<Produto> produtos = repository.findAll(Example.of(produtoPesquisa));

        if (produtos.isEmpty()){
            return ResponseEntity.noContent().build();
        }else{
            return ResponseEntity.ok(produtos);
        }

    }

    @GetMapping("/caros")
    public ResponseEntity listarCaros(){
        return ResponseEntity.ok(repository.pesquisarPorPrecoMaiorQue(6.0));
    }
}
