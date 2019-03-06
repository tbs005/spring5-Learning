package com.tbs005.note.designpatterns.singleton.example2;

public class Singleton2 {

	private static Singleton2 singleton = null;
	
	private Singleton2(){
		System.out.println("生成懒汉式单例模式实例。");
	}
	
	public static Singleton2 getInstance(){
		if(singleton == null){
			singleton = new Singleton2();
		}
		return singleton;
	}
}
