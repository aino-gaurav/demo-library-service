package org.appops.library.service.app;

import org.appops.core.ServiceException;
import org.appops.service.entrypoint.ServiceEntryPoint;

public class LibraryServiceEntryPoint extends ServiceEntryPoint {

	public static void main(String[] args) throws ServiceException {
		new LibraryServiceEntryPoint().startService(args);
	}
	
}
