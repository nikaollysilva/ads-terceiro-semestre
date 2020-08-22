package br.com.bandtec.projeto02;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/compras")
public class ComprasController {

    private List<Compra> compras = new ArrayList<Compra>();

    @GetMapping("comprar/{item}/{valor}/{quantidade}")
    public void depositar(@PathVariable String item, @PathVariable Double valor, @PathVariable Integer quantidade){
        Compra compra = new Compra(item, valor, quantidade);
        compras.add(compra);
    }

    @GetMapping("/lista")
    public List verLista(){
        return compras;
    }
}
