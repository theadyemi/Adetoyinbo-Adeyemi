package ImplementList;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ListArrayTest {

    @Test
    public void listExistTest(){
        ListArray myList = new ListArray();
        assertNotNull(myList);
    }
    @Test
    public void testThatArrayCanTakeList(){
        ListArray myList = new ListArray();
        int [] array = myList.getArray();
        assertArrayEquals(array, myList.getArray());
    }

    @Test
    public void populateArrayTest(){
        ListArray myList = new ListArray(7);
        myList.populateArray(6, new Collection());




    }

    @Test
    public void addArrayAtIndex(){
        int [] array = {1, 2, 3, 4, 5, 6, 7};
        int [] expectedArray = {1, 2, 3, 4, 5, 10, 7};
        ListArray myList = new ListArray();
        assertArrayEquals(expectedArray, myList.addArray(5,10));

    }

    public void testThatListIsNotEmpty(){

    }

//    @Test
//    public void addElement(){
//        int [] myArray = {};
//        ListArray array = new ListArray();
//        int [] expectedArray = {0, 0, 0, 0, };
//        expectedArray.addArray(5);
//        assertEquals(myArray, myArray.getAddArray());
//    }

}