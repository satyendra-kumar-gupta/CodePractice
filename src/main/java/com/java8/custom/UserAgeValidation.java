package com.java8.custom;

class CustomException extends Exception{
    public CustomException(String exceptionMessage){
        super(exceptionMessage);
    }
}

public class UserAgeValidation{
    public static void main(String[] args) throws CustomException {
        int age = 10;
        try {
            validAge(age);
        } catch (CustomException customException){
            System.out.println("Catch the exception" + customException);
        }

    }

    private static void validAge(int age) throws CustomException {
        if(age <18){
            throw new CustomException("age is not valid");
        }
        else{
            System.out.println("welcome to login ");
        }
    }
}