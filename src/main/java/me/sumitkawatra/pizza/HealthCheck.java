/**
 * 
 */
package me.sumitkawatra.pizza;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * @author sumitkawatra
 *
 */
@Path("/")
public class HealthCheck {

	private static final String HELLO = "Hello World! I'm Alive";
	
	@GET
	@Produces(value=MediaType.TEXT_PLAIN)
	public String sayHello() {
		return HealthCheck.HELLO;
	}

}