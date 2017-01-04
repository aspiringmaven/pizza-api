/**
 * Feel free to use, reuse and abuse this code.
 */
package me.sumitkawatra.pizza.resource;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import me.sumitkawatra.pizza.domain.Pizza;
import me.sumitkawatra.pizza.service.PizzaService;

/**
 * @author sumitkawatra
 *
 */

@Path("/pizzas")
@Component
public class PizzaResource {

	@Autowired
	private PizzaService pizzaService;

	public PizzaResource() {
	}

	@GET
	@Path("/")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Pizza> listAllPizza() {
		return pizzaService.listPizza();
	}

	@GET
	@Path("/{pizzaName}")
	@Produces(MediaType.APPLICATION_JSON)
	public Pizza getPizza(@PathParam("pizzaName") String pizzaName) {
		return pizzaService.getByName(pizzaName);
	}

	@POST
	@Path("/")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Pizza addPizza(Pizza pizza) {
		System.out.println("Got Pizza for saving..");
		return pizzaService.savePizza(pizza);
	}

	public PizzaService getPizzaService() {
		return pizzaService;
	}

	public void setPizzaService(PizzaService pizzaService) {
		this.pizzaService = pizzaService;
	}

}
