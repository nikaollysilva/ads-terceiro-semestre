package Aula01;

public class Engenheiro extends Funcionario {

    private double salario;

    public Engenheiro(String cpf, String nome, double salario) {
        super(cpf, nome);
        this.salario = salario;
    }

    @Override
    public double calcSalario() {
        return salario;
    }

    @Override
    public String toString() {
        return "Engenheiro{" +
                "salario=" + salario +
                '}' + super.toString();
    }
}
