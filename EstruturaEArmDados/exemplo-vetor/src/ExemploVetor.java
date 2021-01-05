import java.util.Scanner;

public class ExemploVetor {

    public static void exibeVetor(int[] v ){

        System.out.println("Elementos do vetor:");
        for(int i =0; i < v.length; i++){
            System.out.print("v[" + i +"]" + v[i] + "\t");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int[] vetor = new int[5];
//
//        int[] vet2 = {100, 200, 300, 400, 500, 600, 700 };
//
//        String[] vet3 = new String[4];

        String[] vet4 = {"Domingo", "Segunda-feira", "Terça-feira", "Quarta-feira", "Quinta-feira", "Sexta-feira", "Sabado"};

//        for(int i = 0; i < vetor.length; i++){
//            vetor[i] = i * 10;
//        }

        for(int i = 0; i < vetor.length; i++){
            System.out.println("Digite o valor de vetor["+i+"]");
            vetor[i]= leitor.nextInt();
        }

//        for(int i = 0; i < vet3.length; i++){
//            System.out.println("Digite o valor de vet3["+i+"]");
//            vet3[i]= leitor.next();
//        }


        Integer diaEscolhido;
        boolean a = false;

        do {
            System.out.println("Digite o valor de entre 1 e 7");
            diaEscolhido = leitor.nextInt();

            if (diaEscolhido >= 1 && diaEscolhido <= 7) a = true;

        }while (a == false);

        System.out.println(vet4[diaEscolhido-1]);


        // Exibir a soma dos elementos do vetor
        int total = 0;
        for(int i: vetor){
            total += vetor[i];
        }
        System.out.println("Total dos elementos:" + total);


        // Exibir a quantidade de elementos pares do vetor
        int pares = 0;
        for(int i: vetor){
            if((vetor[i] % 2) == 0){
                System.out.println("numero par encontrando"+ vetor[i]);
                pares++;
            }
        }
        System.out.println("Números pares: " + pares);

//        for(String s : vet3){
//            System.out.println(s + "\t");
//        }
//        System.out.println();
//
//        exibeVetor(vetor);
//
//        exibeVetor(vet2);
    }
}
