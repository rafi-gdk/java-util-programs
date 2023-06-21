package com.sonu.utils.designPatterns.customizedException;

/**
 * Exceptions- interrupting the flow of execution. Throwable is the super class for
 * Exception & Error Exception - it has two types Checked Exception & Unchecked
 * Exception Checked Exception- It will check at compile time eg:-IOException
 * Un-Checked Exception-It will check at Runtime eg:-NullPointerException
 * Error-System related issues like Out Of memory.We can not handle these errors
 * through the code. 1. extends the Exception 2. create String based constructor
 * & pass the message in super
 **/

public class ExceptionTest {

    public String getName() {
        return "Sonu";
    }

    /**
     * Throws is used to declare the exception if you don't want to handle the
     * exception right now. It means some where you are handling the Exception
     **/
    public String setName(String name) throws CustomizedException {
        if (name.equalsIgnoreCase("sonu")) {
            // mainly throw is used to throw a customized exception
            throw new CustomizedException("Throwing Customized Exception");
        }
        return name;
    }

    public static void main(String[] args) {

        ExceptionTest exceptionTest = new ExceptionTest();

        // try block is used to declare the code which code has the chances to throw the
        try {
            System.out.println("Try block");
            exceptionTest.setName("sonu");
        }
        // It will handle the exception which are throws in the try block
        catch (Exception e) {
            System.out.println("Catch block");
            System.out.println(e.getLocalizedMessage());
        }
        /**
         * this block will always be executed irrespective exception without catch block
         * also we can write finally block mostly we use this block to close the
         * connections or making instances as null
         **/ finally {
            System.out.println("finally block");
            exceptionTest = null;
        }
    }
}

class CustomizedException extends Exception {

    CustomizedException(String message) {
        super(message);
    }
}