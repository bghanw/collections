package arraylist;

import arraylist.interfaces.IIntList;

public class IntArrayList implements IIntList {

    private static final int DEFAULT_ARRAY_SIZE = 10;
    private int[] numbers = new int[DEFAULT_ARRAY_SIZE];
    private int size = 0;






    private void grow() {
        int[] newNumbers = new int[numbers.length + numbers.length / 2];
        for (int i = 0; i < numbers.length; i++) {
            newNumbers[i] = numbers[i];
        }
        numbers = newNumbers;
    }

    public int get(int index){
        return numbers[index];
    }

    @Override
    public void add(int number) {
        if (size == numbers.length){

            grow();
        }

        numbers[size] = number;
        size++;

    }

    public int size(){
        return size;
    }

    public boolean contains (int number){
        for (int i = 0; i < numbers.length; i++) {
            if (number == numbers[i]){
                return true;
            }
        }
        return false;
    }



}
