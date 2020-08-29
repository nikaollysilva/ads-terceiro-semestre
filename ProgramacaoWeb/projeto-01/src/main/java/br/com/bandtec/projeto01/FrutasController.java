package br.com.bandtec.projeto01;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FrutasController {

    // Vetor (array) de 3 Frutas
    private Fruta[] frutas = {
            new Fruta("Abacate", 2.5),
            new Fruta("Pêra", 2.5),
            new Fruta("Maçã", 2.5)
    };

    @GetMapping("/frutas") // localhost:8080/frutas
    public Fruta[] listarFrutas() {
        return frutas;
    }

    // Endpoint /frutas1 que retorna somente a 2ª Fruta do vetor
    @GetMapping("/frutas1")
    public Fruta segundaFruta() {
        return frutas[1];
    }
}
