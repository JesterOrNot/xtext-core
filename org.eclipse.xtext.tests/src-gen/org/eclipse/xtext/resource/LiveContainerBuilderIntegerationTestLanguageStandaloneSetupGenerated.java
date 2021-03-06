/*
 * generated by Xtext
 */
package org.eclipse.xtext.resource;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.ISetup;
import org.eclipse.xtext.common.TerminalsStandaloneSetup;
import org.eclipse.xtext.resource.liveContainerBuilderIntegerationTestLanguage.LiveContainerBuilderIntegerationTestLanguagePackage;

@SuppressWarnings("all")
public class LiveContainerBuilderIntegerationTestLanguageStandaloneSetupGenerated implements ISetup {

	@Override
	public Injector createInjectorAndDoEMFRegistration() {
		TerminalsStandaloneSetup.doSetup();

		Injector injector = createInjector();
		register(injector);
		return injector;
	}
	
	public Injector createInjector() {
		return Guice.createInjector(new LiveContainerBuilderIntegerationTestLanguageRuntimeModule());
	}
	
	public void register(Injector injector) {
		IResourceFactory resourceFactory = injector.getInstance(IResourceFactory.class);
		IResourceServiceProvider serviceProvider = injector.getInstance(IResourceServiceProvider.class);
		
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("livecontainerbuilderintegerationtestlanguage", resourceFactory);
		IResourceServiceProvider.Registry.INSTANCE.getExtensionToFactoryMap().put("livecontainerbuilderintegerationtestlanguage", serviceProvider);
		if (!EPackage.Registry.INSTANCE.containsKey("http://www.xtext.org/LiveContainerBuilderIntegerationTestLanguage.xtext")) {
			EPackage.Registry.INSTANCE.put("http://www.xtext.org/LiveContainerBuilderIntegerationTestLanguage.xtext", LiveContainerBuilderIntegerationTestLanguagePackage.eINSTANCE);
		}
	}
}
