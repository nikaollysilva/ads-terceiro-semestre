import java.util.Random;

public class Baralho {
    private PilhaObj<Carta> baralho;

    public Baralho() {
        String[] faces = {"Ás", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
        String[] naipes = {"Copas", "Paus", "Ouros", "Espadas"};
        this.baralho = new PilhaObj<Carta>(52);

        int cont = 0;
        while (!this.baralho.isFull()){
        baralho.push(new Carta(faces[cont%13], cont%13 + 1, naipes[cont/13]));
        cont++;
        }
    }

    public Carta removeCarta(Integer indice){
        PilhaObj<Carta> pilhaAuxiliar = new PilhaObj<Carta>(52);

        for (int i = 0; i < indice; i++) {
            pilhaAuxiliar.push(baralho.pop());
        }

        Carta cartaRemovida = baralho.pop();

        // empilha novamente todas as ind cartas no baralho
        while(!pilhaAuxiliar.isEmpty()) {
            baralho.push(pilhaAuxiliar.pop());
        }
        return cartaRemovida; // retorna a carta alvo que foi removida
    }

    public void embaralhar(){
        Random sorteado = new Random();

        System.out.println("-------------- Embaralhando cartas --------------");
        for (Integer i = 0; i < 52; i++){
            int indice = sorteado.nextInt(52);

            if(indice != 0){
                baralho.push(removeCarta(indice));
            }
        }
    }

    public Carta virarCarta(){
        return baralho.pop();
    }

    public void exibirBaralho(){
        System.out.println("-------------- Exibindo cartas --------------");
            baralho.exibe();
    }

    public PilhaObj<Carta> getBaralho() {
        return baralho;
    }

    public void setBaralho(PilhaObj<Carta> baralho) {
        this.baralho = baralho;
    }
}
