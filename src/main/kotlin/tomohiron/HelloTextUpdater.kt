package tomohiron

import mu.KotlinLogging
import tomohiron.service.HelloService
import java.util.concurrent.ScheduledFuture
import java.util.concurrent.TimeUnit
import javax.annotation.PostConstruct
import javax.annotation.PreDestroy
import javax.annotation.Resource
import javax.ejb.Singleton
import javax.ejb.Startup
import javax.enterprise.concurrent.ManagedScheduledExecutorService
import javax.inject.Inject


@Singleton
@Startup
class HelloTextUpdater {

    private val logger = KotlinLogging.logger {}

//    @Resource
//    private lateinit var helloTextUpdateExecutor : ManagedScheduledExecutorService
//
//    private lateinit var task : ScheduledFuture<*>
//
//    @Inject
//    lateinit var helloService : HelloService

    @PostConstruct
    fun startUp() {
        logger.warn { "post-costruct config" }
//        task = helloTextUpdateExecutor.scheduleAtFixedRate({
//            logger.warn { "updated text!" }
//            helloService.text = "bbb"
//        }, 15, 15, TimeUnit.SECONDS)
    }

//    /** 終了時の処理。スケジュールタスクを終了させる。  */
//    @PreDestroy
//    fun pufOff() {
//        logger.warn { "ending" }
//        task.cancel(true)
//    }
}