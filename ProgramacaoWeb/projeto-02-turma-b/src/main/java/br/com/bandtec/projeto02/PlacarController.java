package br.com.bandtec.projeto02;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/placar")
public class PlacarController {
    private Integer golsTime1 = 0;
    private Integer golsTime2 = 0;

    @GetMapping("/gol/{time}")
    public void registrarGol(@PathVariable int time){
        if(time==1){
            golsTime1++;
        }else if(time==2){
            golsTime2++;
        }
    }

    @GetMapping
    public String placarAtual(){
        return String.format("Time 1: %d X Time 2: %d", golsTime1, golsTime2);
    }

}
