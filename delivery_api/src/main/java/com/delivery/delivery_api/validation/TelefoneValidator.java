package com.delivery.delivery_api.validation;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import java.util.regex.Pattern;

public  class TelefoneValidator implements ConstraintValidator<ValidTelefone, String> {

    @Override
    public void initialize(ValidTelefone constraintAnnotation) {
        // No initialization needed for this validator
    }

    @Override
    public boolean isValid(String telefone, ConstraintValidatorContext context) {
        if (telefone == null || telefone.trim().isEmpty()) {
            return false; // Consider null as valid, use @NotNull for null checks
        }
        String cleanedTelefone = telefone.replaceAll("[^\\d]", ""); // Remove non-digit characters
        
        return cleanedTelefone.length() >= 10 && cleanedTelefone.length() <= 15; // Matches phone numbers with 10 to 15 digits, optional leading +
    }
    
}
