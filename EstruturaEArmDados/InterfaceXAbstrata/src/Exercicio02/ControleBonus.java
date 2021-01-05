package Exercicio02;

import java.util.ArrayList;
import java.util.List;

public class ControleBonus {
    private List<Professor> listaBonificados;

    public ControleBonus() {
        listaBonificados = new ArrayList<Professor>();
    }

    public void addBonificado(Professor bonificavel){
        listaBonificados.add(bonificavel);
        System.out.println("--------------------------------------------------------------------------------------------\n" +
                "Funcionario(a) adicionado(a) com sucesso à lista de bonificados!");
    }

    public void exibeBonificados(){
        System.out.println("--------------------------------------------------------------------------------------------\n" +
                "Exibindo lista de bonificados...");
        for(Professor b : listaBonificados){
            System.out.println(b);
        }
    }

    public void calculaTotalBonus(){
        Double totalBonus = 0.0;
        System.out.println("--------------------------------------------------------------------------------------------\n" +
                "Exibindo total de bonus pago aos colaboradores...");
        for(Professor b : listaBonificados){
            totalBonus += b.getValorBonus();
            System.out.println(String.format(" + R$ %.2f", b.getValorBonus()));
        }

        System.out.println(String.format("Total: R$ %.2f", totalBonus));
    }
}
