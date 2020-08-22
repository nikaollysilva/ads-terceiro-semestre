package br.com.bandtec.projeto02;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ContaCorrenteController {

    private Double saldo = 0.0;
    private Integer saques = 0;
    private Integer depositos = 0;

    @GetMapping("/conta/saldo") //localhost:<porta>/conta/saldo
    public Double getSaldo() {
        return saldo;
    }

    @GetMapping("/conta/depositar10") //localhost:<porta>/conta/depositar10
    public void depositarSempre10() {
        saldo += 10.0;
        depositos++;
    }

    // Endpoint "/conta/???" que saque sempre 5,00 do saldo
    @GetMapping("/conta/sacar5")
    public void sacar5TodaVez() {
        saldo -= 5.0;
        saques++;
    }

    // Endpoint "/conta/???" que retorne uma frase com as quantidades das operações
    // de saques e depósitos
    // ex: "Você fez X saques e Y depósitos"
    @GetMapping("/conta/historico")
    public String historico() {
        return String.format("Você fez %d saques e %d depósitos", saques, depositos);
    }

    @GetMapping("/conta/depositar/{valorDeposito}")
    public void depositar(@PathVariable Double valorDeposito){
        if(valorDeposito > 0){
            saldo += valorDeposito;
        }
    }

    @GetMapping("/conta/sacar/{valorSaque}")
    public void sacar(@PathVariable Double valorSaque){
        if(valorSaque > 0){
            saldo -= valorSaque;
        }
    }

}
