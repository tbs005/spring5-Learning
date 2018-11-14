package com.tbs005.note.javabasics;

public class StringTest {
    public static void main(String[] args){
//        Java常量池和对象
            String a = "aaaabbbbb";
            String b = "aaaa" + "bbbbb";
            String c = new String("aaaabbbbb");
            Integer d = -128;
            Integer e = Integer.valueOf(-128);
            Integer f = 128;
            Integer g = Integer.valueOf(128);
            System.out.println(a == b);//true
            System.out.println(a == c);//false
            System.out.println(d == e);//true
            System.out.println(f == g);//false
        }
}
