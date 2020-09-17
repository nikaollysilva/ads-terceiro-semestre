import java.util.Scanner;

public class Exercicio02 {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        String[] lista = {"Nikolly", "Bruno", "Beatriz", "Carla", "Jane", "Igor", "Vitor", "João", "Matheus", "Yara"};

        System.out.println("Digite um nome:");
        String nome = leitor.next();

        Integer a = 0;
        boolean b = false;
        for (String s: lista) {
            a++;
            if(s.equals(nome)){
                b = true;
                System.out.println("Nome encontrado, no índice " + a);
            }
        }

        if(!b){
            System.out.println("Nome não encontrado");
        }
    }

}
