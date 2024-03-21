package com.ainosoft.library.service.injection;

import org.appops.core.annotation.ImplModule;
import org.appops.entitystore.hibernate.SessionFactoryProvider;
import org.appops.service.injection.ServiceModule;
import org.hibernate.Session;

import com.ainosoft.library.service.LibraryApi;
import com.ainosoft.library.service.core.LibraryService;
import com.ainosoft.library.service.impl.LibraryApiImpl;
import com.google.inject.Inject;
import com.google.inject.Provides;

@ImplModule(serviceName = LibraryService.class)
public class LibraryServiceModule extends ServiceModule {

	@Override
	public void configureModule() {
		bind(LibraryApi.class).to(LibraryApiImpl.class);
	}

}
