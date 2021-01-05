package Aula01;

public class app {
    public static void main(String[] args) {
        Empresa bt = new Empresa("Bandtec");

        Engenheiro e = new Engenheiro("112233445", "Juliana", 15000);
        Vendedor v = new Vendedor("123456789", "Arnold", 20000, 0.10);
        Horista h = new Horista("987654321", "Julio", 40, 100);

        bt.adicionaFunc(e);
        bt.adicionaFunc(v);
        bt.adicionaFunc(h);

        bt.exibeTodos();

        bt.exibeTotalSalario();

        bt.exibeHorista();

    }
}
