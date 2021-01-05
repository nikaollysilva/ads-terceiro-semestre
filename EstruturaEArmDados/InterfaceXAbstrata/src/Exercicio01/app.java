package Exercicio01;

/*
01. Qual seria a melhor forma Classe Abstrata ou Inteface?
Resposta:

02.É neccesario ter dois ou apenas um List?
Resposta: Apenas um, pois é possivel usar classe que será o "molde" para as demais como parametro da lista.
Sendo ela interface ou classe abstrata.

03. O polimorfismo esta presente nessa classe?
Resposta: Sim, está presente no for ehanced na classe ControleBonus e na implementacao do metodo getValorBonus().
 */

public class app {
    public static void main(String[] args) {
        ControleBonus controleBonus = new ControleBonus();

        Professor professor = new Professor("André",1, 100.0);
        Coodernador coordenador = new Coodernador("Luis", 1, 100.0);

        controleBonus.addBonificado(professor);
        controleBonus.addBonificado(coordenador);

        controleBonus.calculaTotalBonus();
        controleBonus.exibeBonificados();
    }
}
