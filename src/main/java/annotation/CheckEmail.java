package annotation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;


public class CheckEmail implements ConstraintValidator<ValidationEmail, String> {
    public String EmailCheck;

    @Override
    public void initialize(ValidationEmail validationEmail) {
        EmailCheck = validationEmail.value();
    }

    @Override
    public boolean isValid(String s, ConstraintValidatorContext context) {
        return s.startsWith(EmailCheck);
    }
}
