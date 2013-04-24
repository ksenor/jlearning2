package Units;

/**
 * Created with IntelliJ IDEA.
 * User: ks
 * Date: 3/31/13
 * Time: 12:06 PM
 * To change this template use File | Settings | File Templates.
 */

//StringBuilder StringBuffer

public class Unit1 {

    /**
     * здесь проверяется не выходим ли мы в передаваемых
     * значениях, за те, что описаны в требованиях
     * @param i
     */
    public static void inReqScope(int i) {
        if (i < 0) {
            throw new IllegalArgumentException(String.format("Аргумент %d не может быть меньше нуля!", i));
        }
        if (i > 100) {
            throw new IllegalArgumentException(String.format("Аргумент %d не может быть больше ста!", i));
        }
    }


    public static boolean isMama(int i) {
        inReqScope(i);

        return (i%3==0);
    }

    public static boolean isPapa(int i) {
        inReqScope(i);

        return (i%5==0);
    }


    public static void main(String[] args) {
        int i;
        for (i=0; i<=100; i++) {
            if (isPapa(i)&&isMama(i)) {
                System.out.println(i + ": PapaMama");
                continue;
            }
            if(isMama(i)) {
                System.out.println(i + ": Mama");
            }
            if (isPapa(i)) {
                System.out.println(i + ": Papa");
            }
        }
    }
}