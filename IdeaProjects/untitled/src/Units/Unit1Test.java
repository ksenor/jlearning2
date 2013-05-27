package Units;

import org.junit.Test;

import static Units.Unit1.*;
import static org.junit.Assert.assertEquals;


/**
 * Created with IntelliJ IDEA.
 * User: ks
 * Date: 4/8/13
 * Time: 12:02 AM
 * To change this template use File | Settings | File Templates.
 */

class UnexpectedResultsException extends Exception {
    UnexpectedResultsException() {
        System.out.println("Мы получили неожиданные значения на тестовой выборке -" +
                " метод работает неверно.");
    }
}

public class Unit1Test {

    // мучаем маму и папу

    @Test(expected = IllegalArgumentException.class)
    public void testIsPapaNotInRangeValueMax() throws IllegalArgumentException {
        isPapa(Integer.MAX_VALUE);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIsPapaNotInRangeValueMin() throws IllegalArgumentException {
        isPapa(Integer.MIN_VALUE);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIsPapaNotInRangeValueLowBorder() throws IllegalArgumentException {
        isMama(-1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIsPapaNotInRangeValueHighBorder() throws IllegalArgumentException {
        isMama(101);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIsMamaNotInRangeValueMin() throws IllegalArgumentException {
        isMama(Integer.MIN_VALUE);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIsMamaNotInRangeValueMax() throws IllegalArgumentException {
        isMama(Integer.MAX_VALUE);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIsMamaNotInRangeValueLowBorder() throws IllegalArgumentException {
        isMama(-1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIsMamaNotInRangeValueHighBorder() throws IllegalArgumentException {
        isMama(101);
    }

    // Мучаем маму

    @Test
    public void testIsMamaInRangeValue1() {
        assertEquals(isMama(0), true);
    }

    @Test
    public void testIsMamaInRangeValue2() {
        assertEquals(isMama(1), false);
    }

    @Test
    public void testIsMamaInRangeValue3() {
        assertEquals(isMama(50), false);
    }

    @Test
    public void testIsMamaInRangeValue4() {
        assertEquals(isMama(99), true);
    }

    @Test
    public void testIsMamaInRangeValue5() {
        assertEquals(isMama(100), false);
    }

    // Мучаем папу

    @Test
    public void testIsPapaInRangeValue1() {
        assertEquals(isPapa(0), true);
    }

    @Test
    public void testIsPapaInRangeValue2() {
        assertEquals(isPapa(1), false);
    }

    @Test
    public void testIsPapaInRangeValue3() {
        assertEquals(isPapa(50), true);
    }

    @Test
    public void testIsPapaInRangeValue4() {
        assertEquals(isPapa(99), false);
    }

    @Test
    public void testIsPapaInRangeValue5() {
        assertEquals(isPapa(100), true);
    }

}
