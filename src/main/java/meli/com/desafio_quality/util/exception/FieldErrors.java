package meli.com.desafio_quality.util.exception;

import meli.com.desafio_quality.dto.exception.GenericExceptionFieldDTO;
import org.springframework.validation.FieldError;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FieldErrors {
    public static GenericExceptionFieldDTO processFieldErrors(List<FieldError> fieldErrors) {
        Map<String, String> exceptions = new HashMap<>();
        for (FieldError fieldError: fieldErrors) {
            exceptions.put(fieldError.getField(), fieldError.getDefaultMessage());
        }
        return new GenericExceptionFieldDTO(exceptions);
    }
}
