public class teste {
    public static void main(String[] args) {

//        Integer[] lista = {0,0,1,0,1};
        Integer[] lista = {0,0,1,1};

        boolean ganhou = true;

        for(Integer i=0; i < lista.length-1; i++){
            if (lista[i].equals(lista[i+1])){
                ganhou = false;
            }
        }

        System.out.println(ganhou);
    }
}
