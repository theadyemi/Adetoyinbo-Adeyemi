package Account;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;




class MultiplyWithoutMathorJavaMethodsTest {
    MultiplyWithoutMathorJavaMethods myWork = new MultiplyWithoutMathorJavaMethods();
    @Test
    public void testMultiply(){

        myWork.multiplyWithout(0,5);
        assertEquals(0, myWork.getMultiplyWithout());
    }



}