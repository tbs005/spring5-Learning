package com.tbs005.note.designpatterns.singleton.example1;

public class Singleton1 {

	private static Singleton1 singleton = new Singleton1();
	
	private Singleton1(){
		System.out.println("生成饿汉式单例模式实例。");
	}
	
	public static Singleton1 getInstance(){
		return singleton;
	}
}
