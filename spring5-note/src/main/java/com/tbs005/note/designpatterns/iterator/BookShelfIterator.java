package com.tbs005.note.designpatterns.iterator;

/**
 * 迭代器实现类
 * 书本集合迭代器
 *
 */
public class BookShelfIterator implements Iterator {
	
	private BookShelf bookShelf;
	private int index;
	
	public BookShelfIterator(BookShelf bookShelf) {
		this.bookShelf = bookShelf;
		this.index = 0;
	}

	@Override
	public boolean hasNext() {
		if(index<bookShelf.getLength()){
			return true;
		}else{
			return false;
		}
		
	}

	@Override
	public Object next() {
		Book bookAt = bookShelf.getBookAt(index);
		index++;
		return bookAt;
	}

}
