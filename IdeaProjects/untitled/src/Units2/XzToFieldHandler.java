package Units2;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

/**
 * Created with IntelliJ IDEA.
 * User: ks
 * Date: 4/28/13
 * Time: 11:47 PM
 * To change this template use File | Settings | File Templates.
 */
public class XzToFieldHandler {
    public static void handle(Object o) {
        Class objectClass = o.getClass();
        Field[] objectClassDeclaredFields = objectClass.getDeclaredFields();

        for (Field fieldInObject : objectClassDeclaredFields) {
            System.out.println(fieldInObject.getName());
            Annotation[] annotations = fieldInObject.getAnnotations();
            for (Annotation annotation : annotations) {
                System.out.println(annotation);
                if (annotation.annotationType()==XzToField.class) {
                    System.out.println("it's working");
                    XzToField xzToField = (XzToField)annotation;
                    o = xzToField.setFieldValue();
                    System.out.println(o);
                }
            }
        }
    }
}
