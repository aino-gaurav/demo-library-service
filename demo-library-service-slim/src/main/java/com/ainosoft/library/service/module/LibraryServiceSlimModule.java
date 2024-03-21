package com.ainosoft.library.service.module;

import org.appops.core.annotation.SlimModule;
import org.appops.slim.base.injection.ServiceSlimModule;

import com.ainosoft.library.service.LibraryApi;
import com.ainosoft.library.service.core.LibraryService;

@SlimModule(serviceName = LibraryService.class)
public class LibraryServiceSlimModule extends ServiceSlimModule {

	@Override
	public void configureModule() {
		bindServiceApi(LibraryApi.class);
	}

}
