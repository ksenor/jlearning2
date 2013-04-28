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

//public class Unit1Test {
//
//
//    @Test(expected = IllegalArgumentException.class)
//    public void testIsPapa(int i) throws IllegalArgumentException {
//        // статический импорт
//        Unit1.isPapa(i);
//    }
//
//    @Test
//    public void testIsMamaAllValues() throws IllegalArgumentException {
//        int[] values = new int[5];
//        values[0] = -2147483648;
//        values[1] = 2147483647;
//        values[2] = -1;
//        values[3] = 50;
//        values[4] = 0;
//
//        @Test(expected = IllegalArgumentException.class)
//        public void testIsMama(int i) {
//            Unit1.isMama(i);
//        }
//
//        for(i = 0; i < values.length; i++) {
//            testIsPapa(i);
//        }
//    }
//
//    @Test
//    public void testIsPapaAllValues() {
//        int[] values = new int[5];
//        values[0] = -2147483648;
//        values[1] = 2147483647;
//        values[2] = -1;
//        values[3] = 50;
//        values[4] = 0;
//        for(int i=0; i < values.length; i++) {
//            testIsPapa(i);
//        }
//    }
//}
