/**
 * Feel free to use, reuse and abuse this code.
 */
package me.sumitkawatra.pizza.resource;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import me.sumitkawatra.pizza.domain.Pizza;
import me.sumitkawatra.pizza.service.PizzaService;

/**
 * @author sumitkawatra
 *
 */

@Path("/pizzas")
public class PizzaResource {

	private PizzaService pizzaService;

	public PizzaResource() {
	}

	@GET
	@Path("/")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Pizza> listAllPizza() {
		return null;
	}

	@GET
	@Path("/{pizzaId}")
	@Produces(MediaType.APPLICATION_JSON)
	public Pizza getPizza() {
		return new Pizza();
	}

	@POST
	@Path("/")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Pizza addPizza() {
		return new Pizza();
	}

	public PizzaService getPizzaService() {
		return pizzaService;
	}

	public void setPizzaService(PizzaService pizzaService) {
		this.pizzaService = pizzaService;
	}

}
