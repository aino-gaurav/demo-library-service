package com.ainosoft.library.service.app;

import java.lang.annotation.Annotation;

import org.appops.core.deployment.ServiceConfiguration;
import org.appops.entitystore.core.Schema;
import org.appops.entitystore.hibernate.SchemaDefinitionGenerator;
import org.appops.entitystore.hibernate.SessionFactoryStore;
import org.appops.entitystore.hibernate.configuration.SessionFactoryGenerator;
import org.appops.service.ServiceInitializer;
import org.appops.service.generator.ServiceMetaGenerator;
import org.appops.slim.base.api.ServiceMetaManager;
import org.hibernate.SessionFactory;

import com.ainosoft.library.service.core.LibraryService;
import com.google.inject.Inject;
import com.google.inject.Provider;

@LibraryService
public class LibraryServiceInitializer extends ServiceInitializer {
	
	@Inject
	public LibraryServiceInitializer(Provider<ServiceMetaGenerator> serviceMetaGenerator,
			Provider<ServiceMetaManager> serviceMetaManager) {
		super(serviceMetaGenerator, serviceMetaManager);
	}

	@Override
	public String initialize(String serviceName, ServiceConfiguration config,
			Class<? extends Annotation> serviceAnnotation) {
		addServiceMeta(serviceName, config, serviceAnnotation);
		return serviceName;
	}
}
