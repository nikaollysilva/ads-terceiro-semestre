package Exercicio02;

public class Professor {
    private String nome;
    private Integer quantHorasAula;
    private Double valorHoraAula;

    public Professor(String nome, Integer quantHorasAula, Double valorHoraAula) {
        this.nome = nome;
        this.quantHorasAula = quantHorasAula;
        this.valorHoraAula = valorHoraAula;
    }

    public Double getValorBonus(){
        return ((quantHorasAula * valorHoraAula) * 4.5) * 0.15;
    }

    @Override
    public String toString() {
        return String.format("-------------------------------------\n" +
                "Cargo: Professor, Nome: %s, \n"+
                "Quantidade de Horas trabalhadas: %d     Valor p/ hora: R$ %.2f\n" +
                "Total de bonus recebido: R$ %.2f", nome, quantHorasAula, valorHoraAula, getValorBonus());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getQuantHorasAula() {
        return quantHorasAula;
    }

    public void setQuantHorasAula(Integer quantHorasAula) {
        this.quantHorasAula = quantHorasAula;
    }

    public Double getValorHoraAula() {
        return valorHoraAula;
    }

    public void setValorHoraAula(Double valorHoraAula) {
        this.valorHoraAula = valorHoraAula;
    }
}
