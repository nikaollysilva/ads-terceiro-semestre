package br.com.bandtec.projeto03;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/cachorros")
public class CachorroController {

    private List<Cachorro> cachorros = new ArrayList<>();

    @GetMapping("/listar")
    public List<Cachorro> getCachorros(){
        return cachorros;
    }

    @GetMapping("/recuperar/{id}")
    public Cachorro getCachorro(@PathVariable int id){
        return cachorros.get(id-1);
    }

    @PostMapping("/cadastrar")
    public void cadastrarCachorro(@RequestBody Cachorro novoCachorro){
        cachorros.add(novoCachorro);
    }

    @DeleteMapping("/delete")
    public void deletarCachorro(@PathVariable int id){
        cachorros.remove(id-1);
    }

    @PutMapping("/atualizar/{id}")
    public void atualizarCachorro(@PathVariable int id, @RequestBody Cachorro cachorro){
        cachorros.set(id-1, cachorro);
    }
}
