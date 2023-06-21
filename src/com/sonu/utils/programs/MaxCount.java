package com.sonu.utils.programs;

public class MaxCount {
    public static void main(String[] args) {

        String string = "Welcome to Singapoore";
        char[] c = string.toCharArray();
        int count = 0;
        int max = 0;
        char cc = 0;
        for (int i = 0; i < c.length; i++) {
            for (int j = i + 1; j < c.length; j++) {
                if (c[i] - c[j] == 0) {
                    count = count + 1;
                }
                if (count > max) {
                    max = count;
                    cc = c[i];
                }
            }
            count = 0;
        }
        System.out.println(cc);
    }
}
