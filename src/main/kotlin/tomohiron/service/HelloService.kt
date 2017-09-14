package tomohiron.service

import mu.KotlinLogging
import javax.inject.Singleton

@Singleton
class HelloService {

    private val logger = KotlinLogging.logger {}

    var text : String = "aaa"

    fun sayHello() {
        logger.warn { "hello from the service " + text }
    }
}