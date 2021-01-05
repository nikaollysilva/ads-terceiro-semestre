package generics_list_objects.exemple;

public class app {
    public static void main(String[] args) {
        ListObject<String> list = new ListObject(5);

        list.addElement("Atemoia");
        list.addElement("Pitaya");
        list.addElement("Acerola");
        list.addElement("Umbu");
        list.addElement("Tamarindo");

        // Não deve adicionar, não curto muito
        list.addElement("Jaca");

        list.showArray();

        list.removeByIndex(3);
        list.showArray();

        list.removeElement("Tamarindo");
        list.showArray();

        list.getElement(3);

        // Não deve encontrar a pesquisa.
        list.searchElement("Tamarindo");

        // Deve encontrar o resultado da pesquisa
        list.searchElement("Pitaya");

        // Deve retornar 3 dado o tamanho da lista
        list.getArraylength();

        list.clear();
        list.showArray();
    }
}
