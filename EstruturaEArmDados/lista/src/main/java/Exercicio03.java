import java.util.Scanner;

public class Exercicio03 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int[] lista = new int[10];

        Integer contador = 0;

        System.out.println("Quando aparecer 'Agora' digite um numero:");

        do {
            System.out.println(" Agora: ");
            lista[contador++] = leitor.nextInt();
        } while (contador < 10);


        Integer soma = 0;
        for (Integer i: lista) {
            soma += i;
        }

        Integer media = soma / lista.length;
        System.out.println("A média é " + media);

        System.out.println("Exibindo acima da media:");
        for (Integer i: lista){
            if(i > media){
                System.out.println(i);
            }
        }
    }
}
