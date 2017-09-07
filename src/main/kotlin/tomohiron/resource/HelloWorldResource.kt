package tomohiron.resource

import mu.KotlinLogging
import tomohiron.model.SampleModel

import javax.ws.rs.GET
import javax.ws.rs.Path
import javax.ws.rs.Produces
import javax.ws.rs.core.MediaType

@Path("/hello")
class HelloWorldResource {

    private val logger = KotlinLogging.logger {}

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    fun hello() : SampleModel {
        logger.warn { "HELLO!" }
        return SampleModel("hello!")
    }
}
