package Account.arrayExercises;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class ReturnsDoubleTest {
    ReturnsDouble testForReturnDouble = new ReturnsDouble();

    //when
    @Test
    public void arrayTest(){
        int [] array = {1, 2, 4, 4, 5, 6};
        int [] expected = {1, 2, 4, 4, 5, 6, 0, 0, 0, 0, 0, 0};
        ReturnsDouble.arrayMethod(array);
        assertEquals(Arrays.toString(expected), Arrays.toString(ReturnsDouble.arrayMethod(array)));

    }


}