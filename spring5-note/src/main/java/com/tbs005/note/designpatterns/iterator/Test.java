package com.tbs005.note.designpatterns.iterator;

/**
 * 迭代器测试
 *
 */
public class Test {

	public static void main(String[] args) {
		
		BookShelf bookShelf = new BookShelf(5);
		
		bookShelf.appendBook( new Book("11111111111"));
		bookShelf.appendBook( new Book("22222222222"));
		bookShelf.appendBook( new Book("33333333333"));
		bookShelf.appendBook( new Book("44444444444"));
		bookShelf.appendBook( new Book("55555555555"));
		
		Iterator it = bookShelf.iterator();
		
		while (it.hasNext()) {
			Book book = (Book) it.next();
			System.out.println(book.getName());
		}
	}
}
