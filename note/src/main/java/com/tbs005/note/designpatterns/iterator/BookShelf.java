package com.tbs005.note.designpatterns.iterator;

/**
 * 集合实现类
 * 书架，书本集合
 *
 */
public class BookShelf implements Aggregate {
	
	private Book[] books;
	private int last = 0;
	
	public BookShelf(int maxsize) {
		super();
		this.books = new Book[maxsize];
	}

	public Book getBookAt(int index){
		return books[index];
	}
	
	public void appendBook(Book book){
		this.books[last] = book;
		last++;
	}
	public int getLength(){
		return last;
	}
	
	@Override
	public Iterator iterator() {
		return new BookShelfIterator(this);
	}

}
