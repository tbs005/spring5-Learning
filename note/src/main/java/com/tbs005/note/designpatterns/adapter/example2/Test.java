package com.tbs005.note.designpatterns.adapter.example2;

public class Test {
	public static void main(String[] args) {
		Print print = new PrintBanner("Hello~!");
		print.printWeek();
		print.printStrong();
	}
}
