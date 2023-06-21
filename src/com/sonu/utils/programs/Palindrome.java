package com.sonu.utils.programs;

public class Palindrome {

    static boolean reverse(String input) {
        String reverse = "";
        for (String s : input.split("")) {
            reverse = s + reverse;
        }
        return reverse.equals(input);
        //return new StringBuilder(input).reverse().toString().equals(input);
    }

    public static void main(String[] args) {
        String numbers1 = "232321232";
        String[] numbers = numbers1.split("");
        String add = "";
        String smallest = "";
        String largest = "";
        for (int i = 0; i < numbers.length; i++) {
            add = numbers[i];
            for (int j = i + 1; j < numbers.length; j++) {
                add = add.concat(numbers[j]);
                boolean palind = reverse(add);
                if (palind && (smallest.isEmpty() || add.length() < smallest.length())) {
                    smallest = add;
                }
                if (palind && add.length() > largest.length()) {
                    largest = add;
                }
            }

        }
        System.out.println("smallest:" + smallest);
        System.out.println("largest:" + largest);
    }
}
