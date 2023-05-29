package ImplementList;

import java.util.ArrayList;

interface List {
    boolean isEmpty();
    int length();
    int get(int index);
    void append(int value);
    void insert(int index, int value);
    void remove(int value);
    void removeAt(int index);
    int indexOf(int value);
}

class ArrayListImplementation implements List {
    private ArrayList<Integer> arrayList;

    public ArrayListImplementation() {
        arrayList = new ArrayList<>();
    }

    @Override
    public boolean isEmpty() {
        return arrayList.isEmpty();
    }

    @Override
    public int length() {
        return arrayList.size();
    }

    @Override
    public int get(int index) {
        if (index < 0 || index >= arrayList.size()) {
            throw new IndexOutOfBoundsException("Index out of range");
        }
        return arrayList.get(index);
    }

    @Override
    public void append(int value) {
        arrayList.add(value);
    }

    @Override
    public void insert(int index, int value) {
        if (index < 0 || index > arrayList.size()) {
            throw new IndexOutOfBoundsException("Index out of range");
        }
        arrayList.add(index, value);
    }

    @Override
    public void remove(int value) {
        int index = indexOf(value);
        if (index == -1) {
            throw new IllegalArgumentException("Value not found");
        }
        removeAt(index);
    }

    @Override
    public void removeAt(int index) {
        if (index < 0 || index >= arrayList.size()) {
            throw new IndexOutOfBoundsException("Index out of range");
        }
        arrayList.remove(index);
    }

    @Override
    public int indexOf(int value) {
        return arrayList.indexOf(value);
    }

    public static void main(String[] args) {
        List list = new ArrayListImplementation();

        list.append(5);
        list.append(10);
        list.append(15);

        list.insert(1, 7);

        list.remove(10);

        for (int i = 0; i < list.length(); i++) {
            System.out.println(list.get(i));
        }
    }
}