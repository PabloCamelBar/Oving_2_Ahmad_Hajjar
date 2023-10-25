import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class testing {


    boolean isNotDevidableBy100(int year){

        return year % 100 != 0;

    }

    boolean isDevidableBy4(int year){

        return year % 4 == 0;

    }

    boolean isDevidableBy400(int year){

        return year % 400 == 0;

    }
    boolean isLeapYear(int year){

        return (isDevidableBy4(year) && isNotDevidableBy100(year)) || isDevidableBy400(year);
    }

//use this variable to test the year in the funksjons;
    public int testYear = 2344;


    @Test
    public void testIfLeapYear(){
        assertTrue(isLeapYear(testYear), "Since this is false, it means that this is not a leap year");
    }

    @Test
    public void testIfNotDevidableBy100(){
        assertTrue(isNotDevidableBy100(testYear));
    }

   @Test
    public void testIfDevidableBy4(){
        assertTrue(isDevidableBy4(testYear));
    }

    @Test
    public void testIfDevidableBy400(){
        assertTrue(isDevidableBy400(testYear));
    }

    @Test
    public void testIfDevidableBy4AndNot100(){
        assertTrue((isDevidableBy4(testYear) && isNotDevidableBy100(testYear)));
    }

    @Test
    public void testIfNotDividableBy4(){
        assertFalse(isDevidableBy4(testYear));
    }

    @Test
    public void testIfDevidableBy100AndNot400(){
        assertFalse(isNotDevidableBy100(testYear) && !isDevidableBy400(testYear));
    }


}
