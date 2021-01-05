package generics_list_objects.practice_09.excetion;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionExercise {
    public static void main(String[] args) {
//        Atributos inicializados
        Double salaryTemp = 0.0;
        Double adjustment = 0.0;

//        Variáveis que isso para a estrutura de repetição, caso o valor inserido seja inválido.
        boolean salaryAccepted = false;
        boolean adjustmentAccepted = false;

        Scanner reader = new Scanner(System.in);

//        While que vai pegar o valor do salário. Ele só para de rodar quando o salário for um valor aceito.
        while (!salaryAccepted) {

            System.out.println("Enter a salary value: ");
            try {
//                Aqui pode ser gerado um erro, por isso está no try.
                salaryTemp = reader.nextDouble();

//                Mostrando que se o comando da linha 23 funcionou sem erro o salário foi aceito.
                salaryAccepted = true;

//                Validando se o salario é negativo, se for lanca uma exception.
                if (salaryTemp < 0) {
                    throw new Exception("Invalid salary. Enter a positive value.");
                }
            } catch (InputMismatchException exception) {
                salaryAccepted = false;
                System.out.println("Invalid character. Please enter a float value. ");
//                Esse comando faz com que ele desconsidere o valor inserido no scanner antes.
                reader.next();
            } catch (Exception e) {
                salaryAccepted = false;
//              Mostrando no console a mensagem da excecao que eu criei.
                System.out.println(e.getMessage());
            }
        }

        while (!adjustmentAccepted) {
            System.out.println("Enter a salary adjustment(%): ");
            if (reader.hasNextInt()) {
                adjustment = reader.nextDouble();
                adjustmentAccepted = true;

                if (adjustment < 0 || adjustment > 100) {
                    try {
                        throw new Exception("Invalid adjustment. Enter a salary adjustment between 0 and 100.");
                    } catch (Exception e) {
                        adjustmentAccepted = false;
                        System.out.println(e.getMessage());
                    }
                }
            } else {
                System.out.println("Invalid character. Please enter a float value. ");
                reader.next();
                continue;
            }
        }

        Double add = salaryTemp * (adjustment / 100);
        Double realSalary = salaryTemp + add;

        System.out.println("Hello, your salary has been readjusted.\n" +
                "Before: R$" + salaryTemp + "\n" +
                "Added value: R$" + add + "\n" +
                "Now: R$" + realSalary);
    }
}
