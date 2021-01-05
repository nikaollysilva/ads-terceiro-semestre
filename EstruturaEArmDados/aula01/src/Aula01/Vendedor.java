package Aula01;

public class Vendedor extends Funcionario{
    private double vendas;
    private double taxa;

    public Vendedor(String cpf, String nome, double vendas, double taxa) {
        super(cpf, nome);
        this.vendas = vendas;
        this.taxa = taxa;
    }

    @Override
    public double calcSalario() {
        return vendas * taxa;
    }

    @Override
    public String toString() {
        return "Vendedor{" +
                "vendas=" + vendas +
                ", taxa=" + taxa +
                ",salario="+ calcSalario()+
                "} " + super.toString();
    }
}
