package exercise_array.array_matriz;

import java.util.Scanner;

public class ExemploMatriz {

    public static void exibeMatriz(int[][] m ){

        for (int linha = 0; linha < m.length; linha++) {
            for (int coluna = 0; coluna < m[linha].length; coluna++) {
                System.out.print(m[linha][coluna] + "\t");
            }
            System.out.println();
        }
    }

    public static void exibeMatrizTransposta(int[][] m ){
        for (int coluna = 0; coluna < m[0].length; coluna++) {
            for (int linha = 0; linha < m.length; linha++) {
                System.out.print(m[linha][coluna] + "\t");
            }
            System.out.println();
            }
        }


    public static void main(String[] args) {

        int[] vetor = new int[10];

        int[][] matriz = new int[3][4];

        int[][] matriz2 = {{1, 2}, {3,4}, {5,6}, {7,8}};

        int[][] matriz3 = new int[3][];
        matriz3[0] = new int[5];
        matriz3[1] = new int[2];

        int[][] matrizLoka = {{1}, {2,3,4,5}, {6,7}, {8,9,10}};

        Scanner reader = new Scanner(System.in);

        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[linha].length; coluna++) {
                System.out.println("Digite o valor de matriz[" + linha +
                        "][" + coluna + "]");
                matriz[linha][coluna] = reader.nextInt();
            }
        }

        // Exibir a matriz em formato de matriz
        System.out.println();
        exibeMatriz(matriz);

        System.out.println();
        exibeMatriz(matriz2);

//        System.out.println();
//        exibeMatriz(matriz3);

        System.out.println();
        exibeMatrizTransposta(matriz);

        System.out.println();
        exibeMatrizTransposta(matriz2);

    }
}
