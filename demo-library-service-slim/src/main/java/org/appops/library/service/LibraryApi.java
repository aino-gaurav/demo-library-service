package org.appops.library.service;

import java.util.ArrayList;

import org.appops.core.service.RequestMethod;
import org.appops.core.service.annotation.ServiceOp;
import org.appops.library.service.core.LibraryService;
import org.appops.library.service.slim.Book;

@LibraryService
public interface LibraryApi {
	
	@ServiceOp(method = RequestMethod.GET, path = "libraryName")
	public String getLibraryName() throws Exception;
	
	@ServiceOp(method = RequestMethod.GET, path = "bookList")
	public ArrayList<Book> getBookList() throws Exception;
	
	@ServiceOp(method = RequestMethod.GET, path = "bestseller")
	public Book getBestSeller() throws Exception;
}
