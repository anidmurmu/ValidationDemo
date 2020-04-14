package com.example.validationdemo.Validator.validations;

 
public interface Validation {

    String getErrorMessage();

    boolean isValid(String text);

}