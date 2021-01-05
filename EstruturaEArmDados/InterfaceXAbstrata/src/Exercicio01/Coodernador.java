package Exercicio01;

public class Coodernador implements Bonificavel{
    private String nome;
    private Integer quantHorasCoord;
    private Double valorHoraCoord;

    public Coodernador(String nome, Integer quantHorasCoord, Double valorHoraCoord) {
        this.nome = nome;
        this.quantHorasCoord = quantHorasCoord;
        this.valorHoraCoord = valorHoraCoord;
    }

    @Override
    public Double getValorBonus() {
        return ((quantHorasCoord * valorHoraCoord) * 4.5) * 0.2;
    }

    @Override
    public String toString() {
        return String.format("_______________________________________\n" +
                "Cargo: Coordenador e Professor,  Nome: %s \n" +
                "Horas trabalhadas como Coordernador: %d   Valor p/ hora: R$ %.2f \n"+
                "Total de bônus recebido: R$ %.2f",nome, getQuantHorasCoord(), getValorHoraCoord(), getValorBonus());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getQuantHorasCoord() {
        return quantHorasCoord;
    }

    public void setQuantHorasCoord(Integer quantHorasCoord) {
        this.quantHorasCoord = quantHorasCoord;
    }

    public Double getValorHoraCoord() {
        return valorHoraCoord;
    }

    public void setValorHoraCoord(Double valorHoraCoord) {
        this.valorHoraCoord = valorHoraCoord;
    }
}
