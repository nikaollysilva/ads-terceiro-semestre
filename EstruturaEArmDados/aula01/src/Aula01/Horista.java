package Aula01;

public class Horista extends Funcionario{

    private int horas;
    private double valorHora;

    public Horista(String cpf, String nome, int horas, double valorHora) {
        super(cpf, nome);
        this.horas = horas;
        this.valorHora = valorHora;
    }

    @Override
    public double calcSalario() {
        return horas * valorHora;
    }

    @Override
    public String toString() {
        return "Horista{" +
                "horas=" + horas +
                ", valorHora=" + valorHora +
                ",salario="+ calcSalario()+
                "} " + super.toString();
    }
}
