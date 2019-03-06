package com.tbs005.note.designpatterns.templatemethod;
import com.tbs005.note.designpatterns.templatemethod.AbstractDisplay;

public class Test {
	

	public static void main(String[] args) {
		
		AbstractDisplay charDisplay = new CharDisplay('H');
		AbstractDisplay strDisplay =  new StringDisplay("我爱我家");
		
		charDisplay.display();
		strDisplay.display();
	}
}
