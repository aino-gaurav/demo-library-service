package com.ainosoft.library.service;

import org.appops.core.service.RequestMethod;
import org.appops.core.service.annotation.ServiceOp;

import com.ainosoft.library.service.core.LibraryService;
import com.ainosoft.library.service.util.BookList;

@LibraryService
public interface LibraryApi {
	
	@ServiceOp(method = RequestMethod.GET, path = "libraryName")
	public String getLibraryName() throws Exception;
	
	@ServiceOp(method = RequestMethod.GET, path = "bookList")
	public BookList getBookList() throws Exception;
}
