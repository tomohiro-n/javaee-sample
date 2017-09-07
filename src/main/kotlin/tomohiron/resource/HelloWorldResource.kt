package tomohiron.resource

import mu.KotlinLogging
import tomohiron.model.SampleModel
import tomohiron.service.HelloService
import javax.inject.Inject

import javax.ws.rs.GET
import javax.ws.rs.Path
import javax.ws.rs.Produces
import javax.ws.rs.core.MediaType

@Path("/hello")
class HelloWorldResource {

    private val logger = KotlinLogging.logger {}

    @Inject
    lateinit var helloService : HelloService

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    fun hello() : SampleModel {
        helloService.sayHello()
        return SampleModel("hello!")
    }
}
