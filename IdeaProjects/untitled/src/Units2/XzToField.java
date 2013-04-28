package Units2;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created with IntelliJ IDEA.
 * User: ks
 * Date: 4/28/13
 * Time: 11:43 PM
 * To change this template use File | Settings | File Templates.
 */

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface XzToField {
    String setFieldValue() default "Xz";
}
