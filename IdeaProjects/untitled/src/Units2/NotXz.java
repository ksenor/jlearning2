package Units2;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created with IntelliJ IDEA.
 * User: ks
 * Date: 4/24/13
 * Time: 4:18 PM
 * To change this template use File | Settings | File Templates.
 */

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface NotXz {
    String getChVal() default "xz";
}
