package Units;

import org.junit.Test;

import Units.Unit1.*;


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
    public void testIsMama() throws IllegalArgumentException {
        Unit1.isMama(-1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIsPapa() throws IllegalArgumentException {
        // статический импорт
        Unit1.isPapa(-2147483648);
        Unit1.isPapa(2147483647);
        Unit1.isPapa(-1);
        Unit1.isPapa(50);
        Unit1.isPapa(0); // перегнать в ЦЫКЛЕ
    }
}
