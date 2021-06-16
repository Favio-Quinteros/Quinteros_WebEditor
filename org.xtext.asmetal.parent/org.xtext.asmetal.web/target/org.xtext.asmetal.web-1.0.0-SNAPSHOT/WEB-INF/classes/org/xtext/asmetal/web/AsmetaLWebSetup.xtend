/*
 * generated by Xtext 2.26.0-SNAPSHOT
 */
package org.xtext.asmetal.web

import com.google.inject.Guice
import com.google.inject.Injector
import org.eclipse.xtext.util.Modules2
import org.xtext.asmetal.AsmetaLRuntimeModule
import org.xtext.asmetal.AsmetaLStandaloneSetup
import org.xtext.asmetal.ide.AsmetaLIdeModule

/**
 * Initialization support for running Xtext languages in web applications.
 */
class AsmetaLWebSetup extends AsmetaLStandaloneSetup {
	
	override Injector createInjector() {
		return Guice.createInjector(Modules2.mixin(new AsmetaLRuntimeModule, new AsmetaLIdeModule, new AsmetaLWebModule))
	}
	
}