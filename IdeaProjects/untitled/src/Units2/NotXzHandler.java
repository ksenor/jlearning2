package Units2;


import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

/**
 * Created with IntelliJ IDEA.
 * User: ks
 * Date: 4/24/13
 * Time: 4:26 PM
 * To change this template use File | Settings | File Templates.
 */
public class NotXzHandler {
    public static void handle(Object o) {
        Class objectClass = o.getClass();
        Method[] declaredClassMethods = objectClass.getDeclaredMethods();

        for (Method methodInObject : declaredClassMethods) {
            System.out.println(methodInObject.getName());
            Annotation[] annotations = methodInObject.getAnnotations();
            for (Annotation annotation : annotations) {
                System.out.println(annotation);
                if (annotation.annotationType()==NotXz.class) {
                    System.out.println("it's working");
                    NotXz notXz = (NotXz)annotation;
                    System.out.println(notXz.getChVal());
                }
            }
        }
    }
}