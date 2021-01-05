public class AlunoGraduacao extends Aluno{
    public double nota1;
    public double nota2;

    public AlunoGraduacao(Integer ra, String nome, double nota1, double nota2) {
        super(ra, nome);
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    @Override
    public double calculaMedia() {
        return (nota1 * 0.4) + (nota2 * 0.6);
    }

    @Override
    public String toString() {
        return "AlunoGraduacao{" +
                "nota1=" + nota1 +
                ", nota2=" + nota2 +
                "} " + super.toString();
    }
}
