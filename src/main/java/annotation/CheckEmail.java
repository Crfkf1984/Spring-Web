package annotation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.lang.annotation.Annotation;

public class CheckEmail implements ConstraintValidator<ValidationEmail, String> {
    public String res;
    @Override
    public void initialize(ValidationEmail validationEmail) {
       res = validationEmail.value();
    }

    @Override
    public boolean isValid(String s, ConstraintValidatorContext context) {
        return s.startsWith(res);
    }
}
