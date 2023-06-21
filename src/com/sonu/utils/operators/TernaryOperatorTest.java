package com.sonu.utils.operators;

public class TernaryOperatorTest {

    public static char getRank(Integer number) {
        return number < 35 ? 'F'
                : number >= 35 && number < 50 ? 'E'
                : number >= 50 && number < 80 ? 'D'
                : number >= 80 && number < 90 ? 'C' : number >= 90 && number < 100 ? 'B' : 'A';

    }

    public static void main(String[] args) {

        System.out.println(getRank(89));
    }

}
