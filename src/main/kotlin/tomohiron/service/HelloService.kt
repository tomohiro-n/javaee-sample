package tomohiron.service

import mu.KotlinLogging
import java.util.concurrent.ScheduledFuture
import java.util.concurrent.TimeUnit
import javax.annotation.PostConstruct
import javax.annotation.Resource
import javax.enterprise.concurrent.ManagedScheduledExecutorService
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class HelloService {

    private val logger = KotlinLogging.logger {}

    var text : String = "aaa"

    @Resource(lookup= "concurrent/scheduledExecutor1")
    private lateinit var helloTextUpdateExecutor : ManagedScheduledExecutorService

    private lateinit var task : ScheduledFuture<*>

    init {
        logger.warn { "post-costruct config" }
        task = helloTextUpdateExecutor.scheduleAtFixedRate({
            logger.warn { "updated text!" }
            this.text = "bbb"
        }, 15, 15, TimeUnit.SECONDS)
    }

    fun sayHello() {
        logger.warn { "hello from the service " + text }
    }
}