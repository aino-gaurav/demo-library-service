package com.ainosoft.library.service.impl;

import com.ainosoft.library.service.LibraryApi;
import com.ainosoft.library.service.slim.Book;
import com.ainosoft.library.service.util.BookList;

public class LibraryApiImpl implements LibraryApi {

	@Override
	public String getLibraryName() throws Exception {
		return "Some Library Name";
	}

	@Override
	public BookList getBookList() throws Exception {
		BookList bookList = new BookList();
		
		Book book1 = new Book();
		book1.setBookName("Book 1");
		book1.setAuthorName("Author 1");
		book1.setPages(100);
		
		Book book2 = new Book();
		book2.setBookName("Book 2");
		book2.setAuthorName("Author 2");
		book2.setPages(100);

		bookList.add(book1);
		bookList.add(book2);
		
 		return bookList;
	}

}
