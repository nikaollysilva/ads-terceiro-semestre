import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int[] lista = new int[10];

        Integer contador = 0;

        System.out.println("Quando aparecer 'Agora' digite um numero:");

        do {
            System.out.println(" Agora: ");
            lista[contador++] = leitor.nextInt();
        } while (contador < 10);

        System.out.println("Digite um numero para busca:");
        Integer numero = leitor.nextInt();

        System.out.println("Numero: " + numero);

        Integer contador2 = 0;
        for (Integer i : lista) {
            if (numero == i){
                System.out.println(i);
                contador2++;
            }
        }

        System.out.println(String.format("O numero %d aparece %d vezes.", numero, contador2));
    }
}
