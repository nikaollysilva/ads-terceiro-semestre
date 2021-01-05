package Aula01;

import java.util.ArrayList;
import java.util.List;


public class Empresa {

    private String nome;
    private List<Funcionario> listaFuncionarios;

    public Empresa(String nome) {
        this.nome = nome;
       listaFuncionarios = new ArrayList<>();
    }

    public void adicionaFunc(Funcionario f){
        listaFuncionarios.add(f);
    }

    public void exibeTodos(){
        System.out.println("____________Lista dos funcionarios____________");
        for(Funcionario f : listaFuncionarios){
        System.out.println(f);
        }
    }

    public void exibeTotalSalario(){
        System.out.println("____________Valor total pago aos funcionarios_______________");
        double total = 0.0;
        for(Funcionario f : listaFuncionarios){
          total += f.calcSalario();
        }
        System.out.println(total);
    }

    public void exibeHorista(){
        System.out.println("____________Lista de Horistas______________");
        for (Funcionario f : listaFuncionarios){
            if (f instanceof Horista){
                System.out.println(f);
            }
        }
    }
}
