package com.tbs005.note.javabasics;

public class StringTest {
    public static void main(String[] args){
    		//Java字符串常量池
            String a = "aaaabbbbb";
            String b = "aaaa" + "bbbbb";
            String c = new String("aaaabbbbb");

            System.out.println(a == b);//true
            System.out.println(a == c);//false

        }
}
