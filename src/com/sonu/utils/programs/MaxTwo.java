package com.sonu.utils.programs;

import java.util.Arrays;
import java.util.List;

public class MaxTwo {

    public static void main(String[] args) {

        int first = 0;
        int second = 0;

        List<Integer> input = Arrays.asList(1, 2, 9, 9, 10, 8);
        //1,2,9,10
        //10,9,8,1
        //1,2,9,10,6

        for (Integer in : input) {
            if (in > first) {
                second = first;
                first = in;
            }
            if (first > in && second < in) {
                second = in;
            }
        }
        System.out.println(second);
    }
}
