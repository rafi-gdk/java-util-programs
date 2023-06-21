package com.sonu.utils.thread;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class CallableTest {

    public static void main(String[] args) throws InterruptedException, ExecutionException {

        ExecutorService ex = Executors.newFixedThreadPool(4);

        List<Future<Customer>> futureList = new ArrayList<>();

        for (int i = 1; i < 20; i++) {
            Customer customer = new Customer(String.valueOf(i), "Sonu");
            Future<Customer> submit = ex.submit(new CustomerService(customer));
            futureList.add(submit);
        }
        ex.shutdown();

        for (Future<Customer> future : futureList) {
            Customer customerResosponse = future.get();
            System.out.println("customerResosponse-->" + customerResosponse);
        }

    }
}

class CustomerService implements Callable<Customer> {
    Customer customer;

    public CustomerService(Customer customer) {
        this.customer = customer;
    }

    @Override
    public Customer call() throws Exception {
        System.out.println("Thread Name-->" + Thread.currentThread().getName());
        return customer;
    }

}

@Data
class Customer {

    private final String customerId;
    private final String customerName;
}