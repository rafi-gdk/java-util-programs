package com.sonu.utils.keywords;

public class StaticKeyTest {

    // Instant Variable(Global Variable) - Outside of the method & inside the  class.
    public Integer instantNumber = 1;

    // Static Variable(Class Variable) - It is used for memory management.
    // The memory will be allocated only once at class loading time.
    // We go for static variable when we have common properties & constant properties.
    // Ex: College name for students or Company name for all employees.
    public static Integer staticNumber = 1;

    // static block will execute at class loading time.
    // It is mainly used to initialize values or do some operation at class loading
    // time.
    static {
        System.out.println("static block");
    }

    // Constructor should have same name as class name
    // No return type
    // It will call when we create the instance
    public StaticKeyTest() {
        System.out.println("constructor block");

        instantNumber++; // it will not increment the value due to every time new memory will allocate.
        staticNumber++; // it will due to only once memory will be allocated.

        System.out.println("instantNumber--> " + instantNumber);
        System.out.println("staticNumber---> " + staticNumber);
    }

    // we should create object for class to call non static method.
    // we can use both static and non static variables inside method.
    public void nonStaticMethod() {
        instantNumber++;
        staticNumber++;
    }

    // Object creation is not required to call static method because it is belongs to class.
    // we can call method directly
    //Inside static method,  we can't use non-static variables, we can use only static variables inside
    // method.
    public static void staticMethod() {
        // instantNumber++;
        staticNumber++;
    }

    public static void main(String[] args) {

        StaticKeyTest staticExample1 = new StaticKeyTest();
        StaticKeyTest staticExample2 = new StaticKeyTest();
        StaticKeyTest staticExample3 = new StaticKeyTest();

        StaticKeyTest staticExample = new StaticKeyTest();
        staticExample.nonStaticMethod();// object is required to call non static method

        staticMethod();// directly we can call static method
    }

}