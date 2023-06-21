package com.sonu.utils.streams.collectors;


import com.sonu.utils.beans.Customer;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class CollectorsTest {

    /**
     * Collecting to list we can do reducing operations as well by using collectors
     * -> Reducing and summarizing streams elements a single value
     * -> Grouping elements
     * -> Partitioning elements
     **/
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 4, 7, 9, 0);

        Long count = numbers.stream().filter(i -> i % 2 == 0).collect(Collectors.counting());
        System.out.println("count-->" + count);

        long sum = numbers.stream().collect(Collectors.summingInt(n -> n));
        System.out.println("sum-->" + sum);

        double avg = numbers.stream().collect(Collectors.averagingInt(n -> n));
        System.out.println("avg-->" + avg);

        Comparator<Integer> numbercomp = Comparator.comparingInt(n -> n);

        Optional<Integer> maxOptional = numbers.stream().collect(Collectors.maxBy(numbercomp));
        System.out.println("max::" + maxOptional.orElse(0));

        Optional<Integer> minOptional = numbers.stream().collect(Collectors.maxBy(numbercomp));
        System.out.println("min::" + minOptional.orElse(0));

        List<Customer> customers = Arrays.asList(
                new Customer(10, "ROZY", LocalDate.now(), "99587458", "ss@gmail.com", "123456"),
                new Customer(10, "RAFI", LocalDate.now(), "96587459", "as@gmail.com", "85799"),
                new Customer(3, "SONU", LocalDate.now(), "92587459", "pss@gmail.com", "99964"),
                new Customer(7, "SONU", LocalDate.now(), "87945646", "oks@gmail.com", "56478"),
                new Customer(7, "CHOTU", LocalDate.now(), "87945647", "oks@gmail.com", "58478"));


        //it returns customerId,count of customers
        TreeMap<Integer, Long> countByCustomer = customers.stream().collect(Collectors.groupingBy(Customer::getCustomerId, TreeMap::new, Collectors.counting()));
        System.out.println(countByCustomer);

        Map<Integer, Long> countByCustomer1 = customers.stream().collect(Collectors.groupingBy(Customer::getCustomerId, Collectors.counting()));
        System.out.println(countByCustomer1);

        Map<Integer, List<Customer>> collect = customers.stream().collect(Collectors.groupingBy(Customer::getCustomerId));
        System.out.println(collect);

        TreeMap<Integer, List<Integer>> collect1 = customers.stream()
                .collect(Collectors.groupingBy(
                        Customer::getCustomerId,
                        TreeMap::new,
                        Collectors.mapping(Customer::getCustomerId, Collectors.toList())));
        System.out.println(collect1);

    }
}
