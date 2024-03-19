package com.gauravdalvi.library.service.core;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import org.appops.core.annotation.Config;

@Config
@LibraryService
@Retention(RetentionPolicy.RUNTIME)
public @interface LibraryServiceConfig {

}
