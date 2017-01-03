/**
 * Feel free to use, reuse and abuse this code.
 */
package me.sumitkawatra.pizza.resource;

import java.util.List;

import javax.ws.rs.BeanParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import me.sumitkawatra.pizza.domain.Base;
import me.sumitkawatra.pizza.service.PizzaBaseService;

/**
 * @author sumitkawatra
 *
 */

@Path("/bases")
@Component
public class PizzaBaseResource {
	
	@Autowired
	private PizzaBaseService pizzaBaseService;

	public PizzaBaseResource() {

	}

	@GET
	@Path("/")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Base> listPizzaBases() {
		return pizzaBaseService.listBase();
	}

	@GET
	@Path("/{baseName}")
	@Produces(MediaType.APPLICATION_JSON)
	public Base getPizzaBase(@PathParam("baseName") String pizzaBaseName) {
		return pizzaBaseService.getByName(pizzaBaseName);
	}

	@POST
	@Path("/")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Base savePizzaBase(Base pizzaBase) {
		return pizzaBaseService.savePizzaBase(pizzaBase);
	}

	/**
	 * @return the pizzaBaseService
	 */
	public PizzaBaseService getPizzaBaseService() {
		return pizzaBaseService;
	}

	/**
	 * @param pizzaBaseService
	 *            the pizzaBaseService to set
	 */
	public void setPizzaBaseService(PizzaBaseService pizzaBaseService) {
		this.pizzaBaseService = pizzaBaseService;
	}

}
