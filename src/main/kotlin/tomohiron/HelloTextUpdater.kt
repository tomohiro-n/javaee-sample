package tomohiron

import java.util.concurrent.ScheduledFuture
import javax.annotation.PostConstruct
import javax.annotation.Resource
import javax.ejb.Singleton
import javax.ejb.Startup
import javax.enterprise.concurrent.ManagedScheduledExecutorService


@Singleton
@Startup
class HelloTextUpdater {


    @Resource
    private lateinit var helloTextUpdateExecutor : ManagedScheduledExecutorService

    private lateinit var task : ScheduledFuture<*>

    @PostConstruct
    fun startUp() {
        task = helloTextUpdateExecutor.scheduleAtFixedRate(() -> {

        }, 0, 1, TimeUnit.MINUTES)
    }
}