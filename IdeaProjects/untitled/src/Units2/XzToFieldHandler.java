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
    public static void handle(Object o) throws NoSuchFieldException, IllegalAccessException {
        Class objectClass = o.getClass();
        Field[] objectClassDeclaredFields = objectClass.getDeclaredFields();

        for (Field fieldInObject : objectClassDeclaredFields) {
            Annotation[] annotations = fieldInObject.getAnnotations();
            for (Annotation annotation : annotations) {
                if (annotation.annotationType()==XzToField.class) {
                    XzToField xzToField = (XzToField)annotation;
                    String val = xzToField.setFieldValue();
                    try {
                        fieldInObject.setAccessible(true);
                        fieldInObject.set(o, val);
                    } catch (IllegalAccessException e) {
                        System.out.println("nea");
                    }
                }
            }
        }
    }
}
