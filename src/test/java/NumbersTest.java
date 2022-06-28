import org.junit.jupiter.api.Assertions;

import static org.junit.Assert.*;

public class NumbersTest {

    @org.junit.Test
    public void sum() {
        //given
        Numbers numbers = new Numbers();
        //when
        int actual = numbers.sum(5);
        int expected = 15;
        //then
        assertEquals(expected, actual);
    }

    @org.junit.Test
    public void sumNotNull() {
        //given
        Numbers numbers = new Numbers();
        //when
        int actual = numbers.sum(5);
        //then
        Assertions.assertNotNull(actual);

    }
    @org.junit.Test
    public void testFromDouble() {
        //given
        double source = 3.1415;
        //when
        String expected="3.1415";
        String actual = Numbers.fromDouble(source);
        //then
        assertEquals(expected, actual);
    }
}