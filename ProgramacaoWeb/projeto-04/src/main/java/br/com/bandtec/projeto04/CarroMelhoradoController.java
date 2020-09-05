package br.com.bandtec.projeto04;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/carros")
public class CarroMelhoradoController {

    private List<Carro> carros = new ArrayList<>();

    @GetMapping
    public ResponseEntity getCarros() {
        if (carros.isEmpty()) {
            return ResponseEntity.status(204).build();
        }else{
            return ResponseEntity.status(200).body(carros);
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity recuperarCarro(@PathVariable int id) {
        if (carros.size() >= id) {
            return ResponseEntity.status(200).body(carros.get(id - 1));
        } else {
            return ResponseEntity.status(404).build();
        }
    }

    @PostMapping
    public ResponseEntity criarCarro(@RequestBody Carro novoCarro) {
        carros.add(novoCarro);
        return ResponseEntity.status(201).build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity excluirCarro(@PathVariable int id) {
        if(carros.size() >= id){
            carros.remove(id-1);
            return ResponseEntity.status(201).build();
        }else{
            return ResponseEntity.status(204).build();
        }
    }

    @GetMapping("/populares")
    public ResponseEntity carrosPopulares() {

        List<Carro> carrosPopulares = carros.stream()
                .filter(carro -> carro.getPreco() < 10000)
                .collect(Collectors.toList());

        if(carrosPopulares.isEmpty()){
            return ResponseEntity.status(204).build();
        }else{
            return ResponseEntity.status(200).body(carrosPopulares);
        }

    }

}
