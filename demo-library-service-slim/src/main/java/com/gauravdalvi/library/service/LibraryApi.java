package com.gauravdalvi.library.service;

import org.appops.core.service.RequestMethod;
import org.appops.core.service.annotation.ServiceOp;

import com.gauravdalvi.library.service.core.LibraryService;

@LibraryService
public interface LibraryApi {
	
	@ServiceOp(method = RequestMethod.GET, path = "libraryName")
	public String getLibraryName() throws Exception;
}
