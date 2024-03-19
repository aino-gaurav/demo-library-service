package com.gauravdalvi.library.service.module;

import org.appops.core.annotation.SlimModule;
import org.appops.slim.base.injection.ServiceSlimModule;

import com.gauravdalvi.library.service.LibraryApi;
import com.gauravdalvi.library.service.core.LibraryService;

@SlimModule(serviceName = LibraryService.class)
public class LibraryServiceSlimModule extends ServiceSlimModule {

	@Override
	public void configureModule() {
		bindServiceApi(LibraryApi.class);
	}

}
