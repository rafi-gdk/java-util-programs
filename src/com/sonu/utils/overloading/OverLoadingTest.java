package com.sonu.utils.overloading;

//Within a class having same method name & different arguments.
//Arguments should be in different order
//Arguments should be in different type
//return type can be different--One method has the return type int overload can be have Integer or other
//access modifiers can be different
public class OverLoadingTest {

    public int add(int a, int b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public void method(Object obj) {
        System.out.println("Object Method");
    }

    public void method(String string) {
        System.out.println("String Method");
    }

    public void method(Integer integer) {
        System.out.println("Integer Method");
    }

    public void method(int intValue) {
        System.out.println("int Method");
    }

    public static void main(String[] args) {

        OverLoadingTest instance = new OverLoadingTest();

        instance.add(5, 10);// both value will be added return the value-15

        instance.add(5, 10, 15);// these 3 values will be added return the value-30

        // Object argument method will call, if Object argument method not found then it
        // will throw the error
        instance.method(new Object());

        // String argument method will call
        // If String argument method not found then it will look for Object argument
        // method
        // If Object argument method not found then it will throw the error
        instance.method("String");

        // Integer argument method will call
        // If Integer argument method not found then it will look for Object argument
        // method
        // If Object argument method not found then it will look for int argument method
        // If int argument method not found then it will throw the error
        Integer integer = 10;
        instance.method(integer);

        // int argument method will call
        // If int argument method not found then it will look for Integer argument
        // method
        // If Integer argument method not found then it will look for Object argument
        // method
        // If Object argument method not found then it will throw the error
        int intValue = 10;
        instance.method(intValue);

    }

}