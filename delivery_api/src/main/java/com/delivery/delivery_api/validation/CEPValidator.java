package com.delivery.delivery_api.validation;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import java.util.regex.Pattern;

public class CEPValidator implements ConstraintValidator<ValidCEP, String> {

    private static final Pattern CEP_PATTERN = 
    Pattern.compile("^([0-9]{5}-[0-9]{3}|[0-9]{8})$"); // Matches "12345-678" or "12345678"

    @Override
    public void initialize (ValidCEP constraintAnnotation) {
        // No initialization needed for this validator
    }

    @Override
    public boolean isValid(String cep, ConstraintValidatorContext context) {
        if (cep == null || cep.trim().isEmpty()) {
            return false; // Consider null as valid, use @NotNull for null checks
        }
        String cleanedCep = cep.trim().replaceAll("\s", ""); // Remove whitespace
        return CEP_PATTERN.matcher(cleanedCep).matches();
    }
    
}
