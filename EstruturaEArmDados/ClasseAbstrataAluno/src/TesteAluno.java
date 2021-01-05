
/*
Respostas:
A. Sim, polimorfismo acontece quando um metodo com o mesmo nome é sobre escrito.
B. Facilitou a implementação do metodo calcSalario(), assim não precisamos escrever sempre o metodo calSalario(), alem
disso ao usar a heranca, evitamos escrever os atributos contidos na classe Aluno que queremos ter nas demais.
C. A classe Aluno é abstrata e nos abriga a implementar o método calcSalario() e o construtor sempre. Assim as classe
seguem um molde, que poderá ser usado em classes futuras, sem alterar o codigo anterior.
*/

public class TesteAluno {
    public static void main(String[] args) {
        AlunoFundamental alunoFundamental = new AlunoFundamental(1012, "Mariazinha", 2.0, 5.0,
                5.0,5.0);
        AlunoGraduacao alunoGraduacao = new AlunoGraduacao(82012, "Vitor Fonseca", 9.0, 9.0);
        AlunoPos alunoPos = new AlunoPos(9872, "Anna Luiza", 8.0, 8.0, 8.0);

        Escola escola = new Escola("Juntos - Estude conosco do pré ao Doutorado");

//        System.out.println(alunoFundamental);
//        System.out.println(alunoGraduacao);
//        System.out.println(alunoPos);

        escola.addAluno(alunoFundamental);
        escola.addAluno(alunoGraduacao);
        escola.addAluno(alunoPos);

        escola.exibeTodos();

//        Deve encotrar aluno
        escola.buscaAluno(82012);

//        Deve exibir aluno nao encontrado
        escola.buscaAluno(82013);

//        Deve exibir o aluno de Graduacao
        escola.exibeAlunoGraduacao();

//        Deve exibir aprovados com media maior ou igual à 5
        escola.exibeAprovados();
    }
}
