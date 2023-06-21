package com.sonu.utils.thread;


import lombok.Data;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class RunnableTest {

    public static void main(String[] args) throws InterruptedException, ExecutionException {

        ExecutorService ex = Executors.newFixedThreadPool(4);

        for (int i = 1; i < 20; i++) {
            Customer1 customer = new Customer1(String.valueOf(i), "Sonu");
            ex.execute(new CustomerService1(customer));
            ex.execute(() -> {
                CustomerService1.customMethod(customer);
            });
        }
        ex.shutdown();
        ex.awaitTermination(Long.MAX_VALUE, TimeUnit.NANOSECONDS);
    }
}

class CustomerService1 implements Runnable {
    Customer1 customer;

    public CustomerService1(Customer1 customer) {
        this.customer = customer;
    }

    @Override
    public void run() {
        System.out.println("Thread Name run-->" + Thread.currentThread().getName() + "  " + customer);
    }

    public static void customMethod(Customer1 customer) {
        System.out.println("Thread Name customMethod-->" + Thread.currentThread().getName() + "  " + customer);
    }

}


@Data
class Customer1 {

    private final String customerId;
    private final String customerName;
}
