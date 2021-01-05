public class AlunoPos extends Aluno{
    public double nota1;
    public double nota2;
    public double notaMonografia;

    public AlunoPos(Integer ra, String nome, double nota1, double nota2, double notaMonografia) {
        super(ra, nome);
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.notaMonografia = notaMonografia;
    }

    @Override
    public double calculaMedia() {
        return (nota1+nota2+notaMonografia)/3;
    }

    @Override
    public String toString() {
        return "AlunoPos{" +
                "nota1=" + nota1 +
                ", nota2=" + nota2 +
                ", notaMonografia=" + notaMonografia +
                "} " + super.toString();
    }
}
