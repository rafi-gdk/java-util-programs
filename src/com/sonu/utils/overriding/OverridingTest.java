package com.sonu.utils.overriding;

/**
 * In different classes having same method name & return type & same arguments.
 * Arguments should be in same order
 * Arguments should be in same type
 * Return type should be same
 * Access modifiers can be different but can not be decrease the scope of Parent class
 * Parent class method should always have super class Exception in throws
 **/
class Parent {

    static {
        System.out.println("Parent Static...");
    }

    {
        System.out.println("Parent Initializer...");
    }

    Parent() {
        System.out.println("Parent Constructor...");
    }

    protected void method_1() {
        System.out.println("Parent Method Protected...");
    }

    public static void method_2() {
        System.out.println("Parent Method Static...");
    }
}

class Child extends Parent {

    static {
        System.out.println("Child Static...");
    }

    {
        System.out.println("Child Initializer...");
    }

    Child() {
        System.out.println("Child Constructor...");
    }

    protected void method_1() {
        System.out.println("Child Method Protected...");
    }

    public static void method_2() {
        System.out.println("Child Method Static...");
    }
}

public class OverridingTest {
    public static void main(String[] args) {
        /**
         * Parent Static...Parent Initializer...Parent Constructor...Parent Method
         * Protected...Parent Method Static...
         **/
        /**
         Parent p = new Parent();
         p.method_1(); // Parent
         p.method_2(); // Parent
         **/

        /**
         * Parent Static...Child Static...Parent Initializer...Parent Constructor...
         * Child Initializer...Child Constructor...Child Method Protected...Child Method
         * Static...
         **/
        /**
         Child c = new Child();
         c.method_1(); // Child
         c.method_2();// Child
         **/

        /**
         * Parent Static...Child Static...Parent Initializer...Parent Constructor...
         * Child Initializer...Child Constructor...Child Method Protected...Parent
         * Method Static...
         * Method hiding because static method will load at class loading time
         * so it can't be possible for overriding
         **/
        Parent p1 = new Child();
        p1.method_1(); // Child
        p1.method_2(); // Parent
    }
}
