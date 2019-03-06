package com.tbs005.note.designpatterns.templatemethod;

/**
 * 模板抽象类
 *
 */
public abstract class AbstractDisplay {

	public abstract void open();
	
	public abstract void print();
	
	public abstract void close();
	
	/**
	 * 模板方法
	 */
	public final void display(){
		open();
		for (int i = 0; i < 5; i++) {
			print();
		}
		print();
		close();
	}
	
}
