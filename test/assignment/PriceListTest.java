package assignment;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PriceListTest {

    private PriceList pricePerCopy;
    @BeforeEach
    public void price () {
        pricePerCopy = new PriceList();
    }
    @Test
    public void countForTwoK (){

        //assert
        assertEquals(8000, pricePerCopy.pricePerCopy(4));
    }

    @Test
    public void countForNine (){
        assertEquals(16200, pricePerCopy.pricePerCopy(9));
    }

    @Test
    public void countForTensToTwenties(){
        assertEquals(27200, pricePerCopy.pricePerCopy(17));
    }

    @Test
    public void countForThirtiesToForties(){
        assertEquals(58_500, pricePerCopy.pricePerCopy(39));
    }

    @Test
    public void countForFiftiesToNineties(){
        assertEquals(93_600, pricePerCopy.pricePerCopy(72));
    }

    @Test
    public void countForOneHundreds(){
        assertEquals(180000, pricePerCopy.pricePerCopy(150));
    }

    @Test
    public void countForTwohundredsToFourHundreds(){
        assertEquals(379500, pricePerCopy.pricePerCopy(345));
    }

    @Test
    public void countForFiveHundredsAndAbove(){
        assertEquals(500000, pricePerCopy.pricePerCopy(500));
    }

}
