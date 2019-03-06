package com.tbs005.note.designpatterns.singleton.example2;

public class Test {
public static void main(String[] args) {
	System.out.println("start.");
	Singleton2 instance1 = Singleton2.getInstance();
	Singleton2 instance2 = Singleton2.getInstance();
	
	if (instance1 == instance2){
		System.out.println("instance1 与 instance2 是相同实例。");
	}else{
		System.out.println("instance1 与 instance2 是不同实例。");
	}
	System.out.println("end.");
}
}
