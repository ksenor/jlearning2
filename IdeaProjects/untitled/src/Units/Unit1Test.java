package Units;

import org.junit.Test;

import static Units.Unit1.*;


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

    @Test(expected = IllegalArgumentException.class)
    public void testIsPapaNotInRangeValueMax() throws IllegalArgumentException {
        Unit1.isPapa(Integer.MAX_VALUE);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIsPapaNotInRangeValueMin() throws IllegalArgumentException {
        Unit1.isPapa(Integer.MIN_VALUE);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIsMamaNotInRangeValueMax() throws IllegalArgumentException {
        isMama(Integer.MAX_VALUE);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIsMamaNotInRangeValueMin() throws IllegalArgumentException {
        isMama(Integer.MIN_VALUE);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIsMamaNotInRangeValueLowBorder() throws IllegalArgumentException {
        isMama(-1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIsMamaNotInRangeValueHighBorder() throws IllegalArgumentException {
        isMama(101);
    }

    @Test
    public void testIsMamaInRangeValue1() {
        isMama(0);
    }

    @Test
    public void testIsMamaInRangeValue2() {
        isMama(1);
    }

    @Test
    public void testIsMamaInRangeValue3() {
        isMama(50);
    }

    @Test
    public void testIsMamaInRangeValue4() {
        isMama(99);
    }

    @Test
    public void testIsMamaInRangeValue5() {
        isMama(100);
    }

    @Test
    public void testIsMamaInRangeValue6() {
        isMama(0);
    }

}
