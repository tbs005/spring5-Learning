package com.tbs005.note.designpatterns.factorymethod;

import com.tbs005.note.designpatterns.factorymethod.framework.Factory;
import com.tbs005.note.designpatterns.factorymethod.framework.Product;
import com.tbs005.note.designpatterns.factorymethod.idcard.IDCardFactory;

public class Test {
	public static void main(String[] args) {
		Factory factory = new IDCardFactory();
		Product card1 = factory.create("小红");
		Product card2 = factory.create("小明");
		Product card3 = factory.create("小刚");
		card1.use();
		card2.use();
		card3.use();
	}
}
