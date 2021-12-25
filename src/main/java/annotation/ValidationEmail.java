package annotation;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = CheckEmail.class)
public @interface ValidationEmail {

    String value() default ".com";

   String message() default "email must on .com";

   public Class<?>[] groups() default {};
   public Class<? extends Payload> [] payload() default {};

}
