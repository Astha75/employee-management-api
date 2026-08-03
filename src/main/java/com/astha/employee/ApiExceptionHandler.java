package com.astha.employee;
import org.springframework.http.*; import org.springframework.web.bind.annotation.*; import java.util.Map;
@RestControllerAdvice public class ApiExceptionHandler { @ExceptionHandler(ResourceNotFoundException.class) ResponseEntity<Map<String,String>> missing(ResourceNotFoundException ex){return ResponseEntity.status(HttpStatus.NOT_FOUND).body(Map.of("error",ex.getMessage()));} }
