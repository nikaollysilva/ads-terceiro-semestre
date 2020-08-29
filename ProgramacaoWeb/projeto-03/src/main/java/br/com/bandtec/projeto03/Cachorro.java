package br.com.bandtec.projeto03;

public class Cachorro {
    private String raca;
    private Double precoMedio;

    public Cachorro(String raca, Double precoMedio) {
        this.raca = raca;
        this.precoMedio = precoMedio;
    }

    public String getRaca() {
        return raca;
    }

    public Double getProcoMedio() {
        return precoMedio;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public void setPrecoMedio(Double precoMedio) {
        this.precoMedio = precoMedio;
    }

    @Override
    public String toString() {
        return "Cachorro{" +
                "raca='" + raca + '\'' +
                ", precoMedio=" + precoMedio +
                '}';
    }
}
