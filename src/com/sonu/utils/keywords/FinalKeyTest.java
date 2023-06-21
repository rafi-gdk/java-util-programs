package com.sonu.utils.keywords;

//No one can inherit this class
final class FinalKeyTest {

    // Can not change the variable
    public final int number = 10;

    // No one can override this method
    public final void method() {
        // we get the error if you try to change the value
        // number=20;
    }

    public static void main(String[] args) {

    }
}