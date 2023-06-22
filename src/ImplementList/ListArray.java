package ImplementList;

public class ListArray {
    private int[] array;
    private int[] elements;
    private int element;
    private int index;
    private int size = 0;

    public ListArray(int element) {
    }

    public ListArray() {
    }

    public int[] getArray() {
        int [] array = new int [10];
        
        return array;
    }

    public int[] addArray(int index, int element) {
//        int [] array = {1, 2, 3, 4, 5, 6, 7};
        this.index = index;
        this.element = element;
        array[index] = element;
        for(int num: array){

        }


        return array;
    }

    public void addArray(int element) {
        if (size == array.length) {
            increaseCapacity();
        }
        array[size] = element;
        size++;
    }




    private void increaseCapacity() {
        int newCapacity = array.length * 2;
        int[] newArray = new int[newCapacity];
        System.arraycopy(array, 0, newArray, 0, size);
        array = newArray;
    }

    public int[] getAddArray() {
        return array;
    }

    public void populateArray(int index, Collection collection) {


    }
}
