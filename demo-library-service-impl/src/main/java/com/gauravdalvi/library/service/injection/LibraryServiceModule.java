package com.gauravdalvi.library.service.injection;

import org.appops.core.annotation.ImplModule;
import org.appops.entitystore.hibernate.SessionFactoryProvider;
import org.appops.service.injection.ServiceModule;
import org.hibernate.Session;

import com.gauravdalvi.library.service.LibraryApi;
import com.gauravdalvi.library.service.core.LibraryService;
import com.gauravdalvi.library.service.impl.LibraryApiImpl;
import com.google.inject.Inject;
import com.google.inject.Provides;

@ImplModule(serviceName = LibraryService.class)
public class LibraryServiceModule extends ServiceModule {

	@Override
	public void configureModule() {
		bind(LibraryApi.class).to(LibraryApiImpl.class);
	}

	/*
	 * @Inject
	 * 
	 * @Provides
	 * 
	 * @LibraryService public Session provideSession(SessionFactoryProvider
	 * sessionFactoryProvider) { return
	 * sessionFactoryProvider.getSessionFactory(LibraryService.class.getSimpleName()
	 * ).openSession(); }
	 */
}
