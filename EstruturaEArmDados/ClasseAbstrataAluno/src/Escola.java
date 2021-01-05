import java.util.ArrayList;
import java.util.List;

public class Escola {
    public String nome;
    public List<Aluno> listaAlunos;

    public Escola(String nome) {
        this.nome = nome;
        listaAlunos = new ArrayList<Aluno>();
    }

    public void addAluno( Aluno objAluno){
        System.out.println(String.format("-------------------------------------------------------------------- \n " +
                "Aluno(a) %s adicionado(a) com sucesso!", objAluno.getNome()));
        listaAlunos.add(objAluno);
    }

    public void exibeTodos(){
        System.out.println("-------------------------------------------------------------------- \n " +
                "Exibindo todos alunos...");
        for (Aluno a: listaAlunos){
            System.out.println(a);
        }
    }

    public void exibeAlunoGraduacao(){
        System.out.println("-------------------------------------------------------------------- \n "+
                "Exibindo todos aluno de graduação...");
        for(Aluno a : listaAlunos){
            if(a instanceof AlunoGraduacao){
                System.out.println(a);
            }
        }
    }

    public void exibeAprovados(){
        System.out.println("-------------------------------------------------------------------- \n "+
                "Exibindo alunos aprovados...");
        for(Aluno a: listaAlunos){
            if(a.calculaMedia() >= 5){
                System.out.println(a);
            }
        }
    }

    public void buscaAluno(Integer ra){
        System.out.println("-------------------------------------------------------------------- \n "+
                "Buscando aluno...");
        boolean find = false;
        for(Aluno a: listaAlunos){
            if(a.getRa().equals(ra)){
                System.out.println("Aluno encontrado:");
                System.out.println(a);
                find = true;
            }
        }
        if (!find){
            System.out.println("Aluno não encontrado, verifique o RA informado.");
        }
    }
}
