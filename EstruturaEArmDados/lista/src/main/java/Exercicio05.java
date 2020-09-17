import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String[] lista = new String[5];
        int[] listaGaso = new int[5];

        Integer contador = 0;

        System.out.println("Quando aparecer 'Agora' digite um modelo de carro:");

        do {
            System.out.println(" Agora: ");
            lista[contador++] = leitor.next();
        } while (contador < 5);

        Integer contador1 = 0;

        System.out.println("Quando aparecer 'Agora' digite digite na ordem o consumo de cada carro:");

        do {
            System.out.println(" Agora: ");
            listaGaso[contador1++] = leitor.nextInt();
        } while (contador1 < 5);

        Integer menor = 999999;
        Integer contador2 = 0;
        Integer indice = 0;
        for (Integer i: listaGaso) {
            if(menor > i){
                indice = contador2;
                menor = i;
            }
            contador2++;
        }

        System.out.println("O modelo mais economico é o " + lista[indice]);

    }
}
