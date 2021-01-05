package Exercicio01;

import java.util.ArrayList;
import java.util.List;

public class ControleBonus {
    private List<Bonificavel> listaBonificados;

    public ControleBonus() {
       listaBonificados = new ArrayList<Bonificavel>();
    }

    public void addBonificado(Bonificavel bonificavel){
        listaBonificados.add(bonificavel);
        System.out.println("--------------------------------------------------------------------------------------------\n" +
                "Funcionario(a) adicionado(a) com sucesso à lista de bonificados!");
    }

    public void exibeBonificados(){
        System.out.println("--------------------------------------------------------------------------------------------\n" +
                "Exibindo lista de bonificados...");
        for(Bonificavel b : listaBonificados){
            System.out.println(b);
        }
    }

    public void calculaTotalBonus(){
        Double totalBonus = 0.0;
        System.out.println("--------------------------------------------------------------------------------------------\n" +
                "Exibindo total de bonus pago aos colaboradores...");
        for(Bonificavel b : listaBonificados){
            totalBonus += b.getValorBonus();
            System.out.println(String.format(" +  R$ %.2f", b.getValorBonus()));
        }

        System.out.println(String.format("Total: R$ %.2f", totalBonus));
    }
}
