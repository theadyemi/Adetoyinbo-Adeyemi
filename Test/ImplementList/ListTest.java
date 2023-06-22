package ImplementList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class ListTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    public void listExistTest(){
        List newList  = new List() {
            @Override
            public boolean isEmpty() {
                return false;
            }

            @Override
            public int length() {
                return 0;
            }

            @Override
            public int get(int index) {
                return 0;
            }

            @Override
            public void append(int value) {

            }

            @Override
            public void insert(int index, int value) {

            }

            @Override
            public void remove(int value) {

            }

            @Override
            public void removeAt(int index) {

            }

            @Override
            public int indexOf(int value) {
                return 0;
            }
        };
    }
}