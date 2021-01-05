package Exercicio02;

/*
01. Qual seria a melhor forma Classe Abstrata ou Inteface?
Resposta: Interface, pois a classe Coordenador tem todas as caracteristicas que a Professor, entao acredito que fazer
a classe Coordenador herdar as caracteristicas da Professor seria uma boa maneira de reutilizar codigo, já que o
Coordenador é um Prefessor.

02.É neccesario ter dois ou apenas um List?
Resposta: Apenas um, pois é possivel usar a classe Professor que será o "molde" para as demais como parametro da lista.
Assim a lista abrage tanto coordenador como professor, pode o coodernador é um professor.

03. O polimorfismo esta presente nessa classe?
Resposta: Sim, está presente no for ehanced na classe ControleBonus e na implementacao do metodo getValorBonus().
 */

public class app {
    public static void main(String[] args) {
        ControleBonus controleBonus = new ControleBonus();
        Professor professor = new Professor("Jairo", 1, 100.0);//67,50
        Coodernador coodernador = new Coodernador("Luis", 1, 100.0, 1, 100.0); //157,50

        controleBonus.addBonificado(professor);
        controleBonus.addBonificado(coodernador);

        controleBonus.calculaTotalBonus();//225
        controleBonus.exibeBonificados();
    }
}
