package com.sonu.utils.string;

public class StringTest {

    public static void main(String[] args) {

        String s = "Hello";
        String s1 = "Hello";
        String s2 = new String("Hello");

        System.out.println(s == s1);
        System.out.println(s == s2);

        String s3 = s2.intern();
        System.out.println(s == s3);

        String s4 = s1.intern();
        System.out.println(s == s4);

        System.out.println(s.compareTo(s2));

        String st = null;
        System.out.println("Hello".equals(st));
        //System.out.println(st.equals("Hello"));
    }
}
