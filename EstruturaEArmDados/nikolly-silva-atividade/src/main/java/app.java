import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class app {
    public static void main(String[] args) {
//        1) Criando obj baralho
        Baralho baralho = new Baralho();

//        2) Exibindo o baralho em ordem
        baralho.exibirBaralho();

//        3) Embaralhando pela primeira vez
        baralho.embaralhar();

//        4) Exibindo o baralho embaralhado
        baralho.exibirBaralho();

//        5) Embaralhando pela segunda vez
//        baralho.embaralhar();

        Scanner leitor = new Scanner(System.in);

//        6) Solicitando quantidade de cartas
        System.out.println("Quantas cartas deseja virar?");

        Integer quantidadesCartas = leitor.nextInt();

//        8)
        while (quantidadesCartas < 5 || quantidadesCartas > 8 ){
            System.out.println("Valor inválido! :(  (Insira um valor entre 1 e 5)");
            System.out.println("Quantas cartas deseja virar?");
            quantidadesCartas = leitor.nextInt();
        }

//        7)
        Integer contaOuros = 0;
        Integer contaCopas = 0;

        for (Integer i = 1; quantidadesCartas >= i; i++){
            Carta carta = baralho.virarCarta();
            System.out.println(i +"ª Carta: " + carta);

            if(carta.getNaipe().equals("Copas")){
                contaCopas++;
            }else if(carta.getNaipe().equals("Ouros")){
                contaOuros++;
            }
        }

        System.out.println();

        if (contaCopas.equals(quantidadesCartas)){
            System.out.println("Parabéns, você venceu! Todas suas cartas são de Copas! :)");
        }else if(contaOuros.equals(quantidadesCartas)){
            System.out.println("Parabéns, você venceu! Todas suas cartas são de Ouros! :)");
        }else{
            System.out.println("Não foi dessa vez, tente novamente! :)");
        }

        System.out.println("Ouros: " + contaOuros);
        System.out.println("Copas: " + contaCopas);

        System.out.println("Quantidade de cartas viradas: " + quantidadesCartas);


    }
}
