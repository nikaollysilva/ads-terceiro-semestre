package generics_list_objects.practice_08;

import generics_list_objects.exemple.ListObject;

import java.util.Scanner;

public class TestStudentList {
    public static void main(String[] args) {
        boolean end = false;
        int storeRa;
        String storeName;
        double storeScore;
        int selectedOption;

        ListObject<Student> list = new ListObject(10);
        Scanner readerNumber = new Scanner(System.in);
        Scanner readerString = new Scanner(System.in);

        System.out.println("iniciando sistema...");
        while (!end) {
            showOptions();
            selectedOption = readerNumber.nextInt();
            switch (selectedOption) {
                case 1:
                    System.out.println("Vamos cadastrar um aluno! ");
                    System.out.println("Digite o ra do aluno:");
                    storeRa = readerNumber.nextInt();
                    System.out.println("Digite o nome do aluno:");
                    storeName = readerString.next();
                    System.out.println("Digite a nota do aluno:");
                    storeScore = readerNumber.nextDouble();

                    list.addElement(new Student(storeRa, storeName, storeScore));
                    break;
                case 2:
                    list.showArray();
                    break;
                case 3:
                    System.out.println("Vamos buscar um aluno pelo indice! ");
                    System.out.println("Digite o indice do aluno:");
                    int index = readerNumber.nextInt();
                    list.getElement(index);
                    break;
                case 4:
                    list.clear();
                    break;
                case 5:
                    System.out.println("Encerrando sistema...");
                    end = true;
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        }
    }

    public static void showOptions() {
        System.out.println("Options:");
        System.out.println(
                        "1. Add Student \n" +
                        "2. Show list\n" +
                        "3. Show a student on the list\n" +
                        "4. Clean list\n" +
                        "5. End");
    }
}



