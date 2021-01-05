public class AlunoFundamental extends Aluno{
    public double nota1;
    public double nota2;
    public double nota3;
    public double nota4;

    public AlunoFundamental(Integer ra, String nome, double nota1, double nota2, double nota3, double nota4) {
        super(ra, nome);
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
        this.nota4 = nota4;
    }

    @Override
    public double calculaMedia() {
        return (nota1+ nota2+ nota3+ nota4)/4;
    }

    @Override
    public String toString() {
        return "AlunoFundamental{" +
                "nota1=" + nota1 +
                ", nota2=" + nota2 +
                ", nota3=" + nota3 +
                ", nota4=" + nota4 +
                "} " + super.toString();
    }
}
