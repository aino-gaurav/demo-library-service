package org.appops.library.service.impl;

import java.util.ArrayList;

import org.appops.library.service.LibraryApi;
import org.appops.library.service.slim.Book;

public class LibraryApiImpl implements LibraryApi {

	@Override
	public ArrayList<Book> getBookList() throws Exception {
		ArrayList<Book> bookList = new ArrayList<Book>();
		
		Book book1 = new Book();
		book1.setBookName("Book1");
		book1.setAuthorName("Author1");
		book1.setPages(100);
		
		Book book2 = new Book();
		book2.setBookName("Book2");
		book2.setAuthorName("Author2");
		book2.setPages(200);

		bookList.add(book1);
		bookList.add(book2);
		
 		return bookList;
	}
}
