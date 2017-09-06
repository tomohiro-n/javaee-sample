package tomohiron.resource;

import tomohiron.model.SampleModel;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/hello")
public class HelloWorldResource {

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public SampleModel hello() {
		return new SampleModel("hello");
	}
}
