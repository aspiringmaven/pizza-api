/**
 * 
 */
package me.sumitkawatra.pizza.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.stereotype.Component;

/**
 * @author sumitkawatra
 *
 */
@Path("/")
@Component
public class HealthCheck {

	private static final String HELLO = "Hello World! We are online, Please Serve you a Pizza :)";
	
	@GET
	@Produces(value=MediaType.TEXT_PLAIN)
	public String sayHello() {
		return HealthCheck.HELLO;
	}

}