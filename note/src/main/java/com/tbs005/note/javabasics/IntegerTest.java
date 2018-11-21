package com.tbs005.note.javabasics;

public class IntegerTest {
	public static void main(String[] args) {
		//java常量池 整数范围 -128，127
        Integer a = -128;
        Integer b = Integer.valueOf(-128);
        Integer c = -127;
        Integer d = Integer.valueOf(-127);
        Integer e = 128;
        Integer f = Integer.valueOf(128);
        
        System.out.println(a == b);//true
        System.out.println(c == d);//true
        System.out.println(e == f);//false
	}

}
