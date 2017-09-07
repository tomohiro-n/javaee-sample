package tomohiron

import com.google.inject.Guice
import mu.KotlinLogging
import org.glassfish.hk2.api.ServiceLocator
import org.glassfish.jersey.server.ResourceConfig
import org.jvnet.hk2.guice.bridge.api.GuiceBridge
import org.jvnet.hk2.guice.bridge.api.GuiceIntoHK2Bridge
import javax.ws.rs.core.Context

class MyConfig : ResourceConfig {

    private val logger = KotlinLogging.logger {}

    constructor(@Context serviceLocator : ServiceLocator) {
        logger.warn { "server is being configured..." }
        GuiceBridge.getGuiceBridge().initializeGuiceBridge(serviceLocator)
        val guiceBridge = serviceLocator.getService(GuiceIntoHK2Bridge::class.java)
        guiceBridge.bridgeGuiceInjector(Guice.createInjector())
    }
}