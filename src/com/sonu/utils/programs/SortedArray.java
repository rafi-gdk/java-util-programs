package com.sonu.utils.programs;

import com.sonu.utils.beans.Customer;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class SortedArray {

    //SortedStringArray
    public static String[] sortedStringArray(String[] input) {
        for (int i = 0; i < input.length; i++) {
            for (int j = i + 1; j < input.length; j++) {
                if (input[i].compareTo(input[j]) > 0) {
                    String temp = input[i];
                    input[i] = input[j];
                    input[j] = temp;
                }
            }
        }
        for (String s : input) System.out.println(s + " ");
        return input;
    }

    //SortedCharArray
    public static char[] sortedCharArray(char[] input) {
        for (int i = 0; i < input.length; i++) {
            for (int j = i + 1; j < input.length; j++) {
                if (input[i] > input[j]) {
                    char temp = input[i];
                    input[i] = input[j];
                    input[j] = temp;
                }
            }
        }
        for (char c : input) System.out.println(c + " ");
        return input;
    }


    //SortedIntArray
    public static int[] sortedIntArray(int[] input) {
        for (int i = 0; i < input.length; i++) {
            for (int j = i + 1; j < input.length; j++) {
                if (input[i] > input[j]) {
                    int temp = input[i];
                    input[i] = input[j];
                    input[j] = temp;
                }
            }
        }
        for (int i : input) System.out.println(i + " ");
        return input;
    }

    public static void main(String[] args) {

        sortedStringArray(new String[]{"rafi", "chotu", "sonu", "motu"});
        sortedCharArray(new char[]{'F', 'a', 's', 'g', 'i', 'B', 'A', '3', '1'});
        sortedIntArray(new int[]{2, 8, 4, 9, 7, 6, 8, 10});

        //sorting using Java 8 feature
        Stream.of("rafi", "chotu", "sonu", "motu").sorted().forEach(System.out::println);

        //sorting using Java 8 feature
        List<Customer> customers = Arrays.asList(
                new Customer(10, "ROZY", LocalDate.now(), "99587458", "ss@gmail.com", "123456"),
                new Customer(5, "RAFI", LocalDate.now(), "96587459", "as@gmail.com", "85799"),
                new Customer(3, "SONU", LocalDate.now(), "92587459", "pss@gmail.com", "99964"),
                new Customer(7, "MOTU", LocalDate.now(), "87945646", "oks@gmail.com", "56478"),
                new Customer(7, "CHOTU", LocalDate.now(), "87945647", "oks@gmail.com", "58478"));

        customers.stream().sorted(Comparator.comparing(Customer::getCustomerId).thenComparing(Customer::getCustomerName))
                .forEach(System.out::println);
    }
}