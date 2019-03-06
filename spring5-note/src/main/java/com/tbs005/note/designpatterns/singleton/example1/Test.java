package com.tbs005.note.designpatterns.singleton.example1;

public class Test {
public static void main(String[] args) {
	System.out.println("start.");
	Singleton1 instance1 = Singleton1.getInstance();
	Singleton1 instance2 = Singleton1.getInstance();
	
	if (instance1 == instance2){
		System.out.println("instance1 与 instance2 是相同实例。");
	}else{
		System.out.println("instance1 与 instance2 是不同实例。");
	}
	System.out.println("end.");
}
}
