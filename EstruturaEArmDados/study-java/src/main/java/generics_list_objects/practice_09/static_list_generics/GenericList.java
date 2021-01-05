package generics_list_objects.practice_09.static_list_generics;

public class GenericList<T> {
    private T[] array;
    private int realSizeArray;

    //    CONSTRUCTOR
    public GenericList(int sizeMaxList) {
        this.array = (T[]) new Object[sizeMaxList];
        this.realSizeArray = 0;
    }

    //    METHODS
    public boolean addElement(T value){
        if(realSizeArray >= array.length){
            System.out.println("Sorry, not possible add the element "+ value +". List is full :(");
            return false;
        }else{
            array[realSizeArray++] = value;
            return true;
        }
    }

    public void showArray(){
        System.out.println("-----------------------------------------------------------------------------------------");
        if(realSizeArray > 0){
            System.out.println("-- Show array elements: --");
            for(int i=0; i<realSizeArray; i++){
                System.out.println(array[i] + "\t");
            }
        }else {
            System.out.println("-- The array is empty. Add elements :) --");
        }
        System.out.println("-----------------------------------------------------------------------------------------");
    }

    public int searchElement(T value){
        for (int i=0; i < realSizeArray; i++) {
            if (array[i].equals(value)) {
                System.out.println(value + " found.");
                return i;
            }
        }
        System.out.println("No results for " + value + ".");
        return -1;
    }

    public boolean removeByIndex(int index) {
        if (index < 0 || index >= realSizeArray) {
            return false;
        } else {
            for (int i=index; i < realSizeArray-1; i++) {
                array[i] = array[i+1];
            }
            realSizeArray--;
            return true;
        }
    }

    public boolean removeElement(T value) {
        return removeByIndex(searchElement(value));
    }

    public int getArraylength() {
        System.out.println("-----------------------------------------------------------------------------------------");
        System.out.println("Array size: " + realSizeArray);
        System.out.println("-----------------------------------------------------------------------------------------");
        return realSizeArray;
    }

    public T getElement(int index){
        if(index < 0 || index >= realSizeArray){
            System.out.println("invalid index. try another value.");
            return null;
        }else{
            System.out.println("The String selected is" + array[index]);
            return array[index];
        }
    }

    public void clear(){
        realSizeArray = 0;
    }

//    NEW METHODS
    public boolean replace( T oldValue, T  newValue){
        if(searchElement(oldValue) != -1){
            array[searchElement(oldValue)] = newValue;
            System.out.println("The element " + oldValue + " was replaced by " + newValue);
            return true;
        }else{
            System.out.println("Element "+ oldValue +" not found.");
            return false;
        }
    }

    public int countOccurrences(T searchValue){
        int found = 0;
        for (int i=0; i < realSizeArray; i++) {
            if (array[i].equals(searchValue)) {
                System.out.println(searchValue + " found.");
                found++;
            }
        }
        System.out.println("The number " + searchValue + " was found " + found + " times");
        return found;
    }

    public boolean addAtFirst(T value){
        if(realSizeArray >= array.length){
            System.out.println("Sorry, not possible add the element "+ value +". List is full :(");
            return false;
        }else{

//            Arrastando os valores para uma casa anterior
            for (int i = realSizeArray; i > 0; i--){
                array[i] = array[i-1];
            }
            
//            Adicionando um elemento ao tamanho real da lista
            realSizeArray++;

//            Adicionando o elemento no inicio do vetor
            array[0] = value;
            System.out.println("The element was add at first of list");
            return true;
        }
    }

}
