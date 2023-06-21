package com.sonu.utils.designPatterns.singleton;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class SingletonTest {

    public static void main(String[] args) throws InvocationTargetException, InstantiationException, IllegalAccessException, IOException, ClassNotFoundException, CloneNotSupportedException {

        Customer instance = Customer.getInstance();
        System.out.println("TestDesignPatterns.main.instance-->" + instance.hashCode());

        // Clone Example
        //Customer clone = (Customer) instance.clone();
        //System.out.println("TestDesignPatterns.main.clone-->" + clone.hashCode());



         // Reflection Example
         Constructor[] constructors = Customer.class.getDeclaredConstructors();
         for (Constructor constructor : constructors) {
         constructor.setAccessible(true);
         Customer reflection = (Customer) constructor.newInstance();
         System.out.println("TestDesignPatterns.main.reflection-->" + reflection.hashCode());
         }


        ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(new File("SingletonExample.ser")));
        outputStream.writeObject(instance);
        outputStream.close();

        ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(new File("SingletonExample.ser")));
        Customer serialization = (Customer) inputStream.readObject();
        System.out.println("TestDesignPatterns.main.serialization-->" + serialization.hashCode());

    }
}

class Customer implements Cloneable, Serializable {

    private static Customer customer;

    public static Customer getInstance() {
        if (customer == null) {
            synchronized (Customer.class) {
                if (customer == null) {
                    customer = new Customer();
                }
            }
        }
        return customer;
    }

    private Customer() {
        if (customer != null) {
            throw new RuntimeException("Instance can not be created by Reflection...");
        }
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        //return getInstance();
        throw new CloneNotSupportedException("Clone Not Support for Singleton Class");
    }

    protected Object readResolve() {
        //return getInstance();
        throw new RuntimeException("Deserialization not Support for Singleton CLass");
    }

}