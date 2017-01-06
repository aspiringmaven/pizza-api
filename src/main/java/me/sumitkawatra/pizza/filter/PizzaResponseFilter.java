/**
 * Feel free to use, reuse and abuse this code.
 */
package me.sumitkawatra.pizza.filter;

import java.io.IOException;

import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerResponseContext;
import javax.ws.rs.container.ContainerResponseFilter;
import javax.ws.rs.ext.Provider;

/**
 * @author sumitkawatra
 *
 */
@Provider
public class PizzaResponseFilter  implements ContainerResponseFilter{

	public void filter(ContainerRequestContext containerRequestContext, ContainerResponseContext containerResponseContext) throws IOException {
		containerResponseContext.getHeaders().add("X-Powered-By", "Pizza Dev Center :-)");
		
	}

}
