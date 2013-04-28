package Units2;

/**
 * Created with IntelliJ IDEA.
 * User: ks
 * Date: 4/24/13
 * Time: 4:20 PM
 * To change this template use File | Settings | File Templates.
 */

public class Main {

    @NotXz
    public static String ok() {
        return "ok";
    }

    @XzToField(setFieldValue = "oga, it's xz")
    String a = "dsfkljdshfkl";

    public static void main(String[] args) {
        XzToFieldHandler.handle(new Main());
    }
}