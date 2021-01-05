package generics_list_objects.practice_08;

public class Student {
    private int ra;
    private String name;
    private double score;

    public Student(int ra, String nome, double nota) {
        this.ra = ra;
        this.name = nome;
        this.score = nota;
    }

    @Override
    public String toString() {
        return "Student{" +
                "ra=" + ra +
                ", nome='" + name + '\'' +
                ", nota=" + score +
                '}';
    }

    public int getRa() {
        return ra;
    }

    public void setRa(int ra) {
        this.ra = ra;
    }

    public String getName() {
        return name;
    }

    public void setName(String nome) {
        this.name = nome;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }
}
