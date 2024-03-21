package org.appops.library.service.module;

import org.appops.core.annotation.SlimModule;
import org.appops.library.service.LibraryApi;
import org.appops.library.service.core.LibraryService;
import org.appops.slim.base.injection.ServiceSlimModule;

@SlimModule(serviceName = LibraryService.class)
public class LibraryServiceSlimModule extends ServiceSlimModule {

	@Override
	public void configureModule() {
		bindServiceApi(LibraryApi.class);
	}

}
