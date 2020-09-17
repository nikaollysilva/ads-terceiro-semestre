import java.util.Scanner;

public class Exercicio01 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int[] lista = new int[7];

        Integer contador = 0;

        System.out.println("Quando aparecer 'Agora' digite um numero:");

        do {
            System.out.println(" Agora: ");
            lista[contador++] = leitor.nextInt();
        } while (contador < 7);

        listar(lista);
        System.out.println("---------------------");
        listarAoContrario(lista);

    }

    public static void listar(int[] lista) {

        for (Integer i : lista) {
            System.out.println(i);
        }

    }

    public static void listarAoContrario(int[] lista) {

        Integer contador = lista.length;

        for (int i = 0; i < lista.length; i++) {
            System.out.println(contador--);
        }

    }
}