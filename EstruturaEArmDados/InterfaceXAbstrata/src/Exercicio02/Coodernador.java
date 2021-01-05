package Exercicio02;

public class Coodernador extends Professor {
    private Integer quantHorasCoord;
    private Double valorHoraCoord;

    public Coodernador(String nome, Integer quantHorasAula, Double valorHoraAula, Integer quantHorasCoord, Double valorHoraCoord) {
        super(nome, quantHorasAula, valorHoraAula);
        this.quantHorasCoord = quantHorasCoord;
        this.valorHoraCoord = valorHoraCoord;
    }

    @Override
    public Double getValorBonus() {
        return super.getValorBonus() + ((quantHorasCoord * valorHoraCoord) * 4.5) * 0.2;
    }

    @Override
    public String toString() {

        return String.format("_______________________________________\n" +
                "Cargo: Coordenador e Professor,  Nome: %s \n" +
                "Horas trabalhadas como Coordernador: %d   Valor p/ hora: R$ %.2f \n"+
                "Horas trabalhadas como Professor: %d   valor p/ horas: R$ %.2f \n" +
                "Total de bônus recebido: R$ %.2f", super.getNome(), getQuantHorasCoord(), getValorHoraCoord(), getQuantHorasAula(), getValorHoraAula(), getValorBonus());
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
