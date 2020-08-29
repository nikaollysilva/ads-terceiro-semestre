package br.com.bandtec.projeto01;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/*
@RestController -> é uma Anotação (Annotation).
Anotações são uma forma de METAPROGRAMAÇÃO
No caso, essa anotação libera para a que
a classe tenha ENDPOINTS para a API.

É essa anotação que transforma a clase numa REST Controller.
O nome da classe NÃO PRECISA terminar em "Controller".
Isso é apenas uma convenção.
 */
@RestController
public class PrimeiroController {

    /*
    @GetMapping -> Outra Anotação (ou Annotation)
    Essa configura um ENDPOINT da API para o método onde ela está
    A URI para chegar nela é "/frase1"
     */
    @GetMapping("/frase1") // localhost:8080/frase1
    public String frase() {
        return "Minha primeira API! Owwww! @@";
    }

    /*
    A URI para chegar nela é "/frase2"
     */
    @GetMapping("/frasefrase22") // localhost:8080/frase2
    public String frase2() {
        return "É nóis no Spring Boot";
    }

    // ENDPOINT "/idade" que retorna um Integer (uma idade qualquer)
    @GetMapping("/idade")
    public Integer idadeLokaTantoFazONomeDoMetodo() {
        return 39;
    }

    @GetMapping("/verdade")
    public Boolean ehVerdade() {
        return true;
    }
}
