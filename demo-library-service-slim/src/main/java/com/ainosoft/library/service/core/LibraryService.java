package com.ainosoft.library.service.core;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.appops.core.service.annotation.Service;

import com.google.inject.BindingAnnotation;

@Service
@Target(ElementType.TYPE)
@BindingAnnotation
@Retention(RetentionPolicy.RUNTIME)
public @interface LibraryService {

}
