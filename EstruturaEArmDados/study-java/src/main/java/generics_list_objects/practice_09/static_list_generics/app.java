package generics_list_objects.practice_09.static_list_generics;

public class app {
    public static void main(String[] args) {
        GenericList<Integer> list = new GenericList(5);

        list.addElement(1);
        list.addElement(12);
        list.addElement(123);
        list.addElement(1234);
        list.addElement(12345);

        // Não deve adicionar
        list.addElement(123456);

        list.showArray();

        list.removeByIndex(3);
        list.showArray();

        list.removeElement(12345);
        System.out.println("now()");
        list.showArray();

        list.getElement(3);

        // Não deve encontrar a pesquisa.
        list.searchElement(12345);

        // Deve encontrar o resultado da pesquisa
        list.searchElement(123);

        // Deve retornar 3 dado o tamanho da lista
        list.getArraylength();

        //TESTE NOVO -> Replace
//        list.replace(123, 1001);
//        list.showArray();

//        System.out.println("Testando 1001");
//        list.countOccurrences(1001);
//
//        System.out.println("Testando 123");
//        list.countOccurrences(123);

        list.addAtFirst(2001);
        System.out.println("Deve exibir 2001");
        list.showArray();


//        list.clear();
//        list.showArray();
    }
}
