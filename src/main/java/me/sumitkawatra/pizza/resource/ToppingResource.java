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

import me.sumitkawatra.pizza.domain.Topping;
import me.sumitkawatra.pizza.service.ToppingService;

@Path("/toppings")
@Component
public class ToppingResource {
	
	@Autowired
	private ToppingService toppingService;

	public ToppingResource() {
	}

	@GET
	@Path("/")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Topping> listAllToppings() {
		return null;
	}

	@GET
	@Path("/{toppingName}")
	@Produces(MediaType.APPLICATION_JSON)
	public Topping getTopping(@PathParam("toppingName") String toppingName) {
		return new Topping();
	}

	@POST
	@Path("/")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Topping addTopping(@BeanParam Topping topping) {
		return new Topping();
	}

	/**
	 * @return the toppingService
	 */
	public ToppingService getToppingService() {
		return toppingService;
	}

	/**
	 * @param toppingService
	 *            the toppingService to set
	 */
	public void setToppingService(ToppingService toppingService) {
		this.toppingService = toppingService;
	}

}
