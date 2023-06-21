package com.sonu.utils.designPatterns.immutable;

import lombok.ToString;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ImmutableClassTest {

    public static void main(String[] args) {

        List<Integer> phoneNumbersList = new ArrayList<>();
        phoneNumbersList.add(12345);
        phoneNumbersList.add(87944);
        Customer customer = new Customer("101", "sonu", LocalDate.now(), "ss.1@gmail.com", "password", phoneNumbersList);

        System.out.println("ImmutableMainExample.main-->" + customer);
        customer.getPhoneNumbers().add(4578);
        System.out.println("ImmutableMainExample.main-->" + customer);
    }
}

@ToString
final class Customer {

    private final String customerId;
    private final String customerName;
    private final LocalDate customerDOB;
    private final String email;
    private final String password;
    private final List<Integer> phoneNumbers;


    public Customer(String customerId, String customerName, LocalDate customerDOB, String email, String password, List<Integer> phoneNumbers) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.customerDOB = customerDOB;
        this.email = email;
        this.password = password;
        this.phoneNumbers = phoneNumbers;
    }

    public String getCustomerId() {
        return customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public LocalDate getCustomerDOB() {
        return customerDOB;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public List<Integer> getPhoneNumbers() {
        return new ArrayList<>(phoneNumbers);
    }

}