package com.sonu.utils.programs;

import com.sonu.utils.beans.Customer;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Count {

    public static void countToMap_7(List<Customer> customers) {
        Map<Integer, Integer> map = new TreeMap<>();
        for (Customer customer : customers) {
            Integer customerId = map.get(customer.getCustomerId());
            if (customerId == null) {
                map.put(customer.getCustomerId(), 1);
            } else {
                map.put(customer.getCustomerId(), customerId + 1);
            }
        }
        System.out.println("countToMap_7--> " + map);
    }

    public static void countToMap_8(List<Customer> customers) {
        Map<Integer, Integer> map = new TreeMap<>();
        for (Customer customer : customers) {
            map.merge(customer.getCustomerId(), 1, Integer::sum);
        }
        System.out.println("countToMap_8--> " + map);
    }

    public static void main(String[] args) {

        List<Customer> customers = Arrays.asList(
                new Customer(10, "ROZY", LocalDate.now(), "99587458", "ss@gmail.com", "123456"),
                new Customer(10, "RAFI", LocalDate.now(), "96587459", "as@gmail.com", "85799"),
                new Customer(3, "SONU", LocalDate.now(), "92587459", "pss@gmail.com", "99964"),
                new Customer(7, "SONU", LocalDate.now(), "87945646", "oks@gmail.com", "56478"),
                new Customer(7, "CHOTU", LocalDate.now(), "87945647", "oks@gmail.com", "58478"));

        //sorting using Java 7 feature
        countToMap_7(customers);

        //sorting using Java 8 feature
        countToMap_8(customers);

        //sorting using Java 8 feature
        Map<Integer, Long> map = customers.stream().collect(Collectors.groupingBy(Customer::getCustomerId, Collectors.counting()));
        System.out.println("countToMap_group-->" + map);

        //sorting using Java 8 feature
        Map<Integer, Long> collect = Stream.of(10, 10, 3, 7, 7).collect(Collectors.groupingBy((i -> i), Collectors.counting()));
        System.out.println("countToMap_group-->" + collect);
    }
}
