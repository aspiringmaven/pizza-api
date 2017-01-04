/**
 * Feel free to use, reuse and abuse this code.
 */
package me.sumitkawatra.pizza.service;

import java.math.BigInteger;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import me.sumitkawatra.pizza.dao.PizzaDao;
import me.sumitkawatra.pizza.domain.Pizza;

/**
 * @author sumitkawatra
 *
 */
@Service
public class PizzaServiceImpl implements PizzaService {

	@Autowired
	private PizzaDao pizzaDao;

	public PizzaServiceImpl() {

	}

	public PizzaDao getPizzaDao() {
		return pizzaDao;
	}

	public void setPizzaDao(PizzaDao pizzaDao) {
		this.pizzaDao = pizzaDao;
	}

	public Pizza savePizza(Pizza pizza) {
		return pizzaDao.savePizza(pizza);
	}

	public List<Pizza> listPizza() {
		return pizzaDao.listPizza();
	}

	public Pizza getPizza(BigInteger pizzaId) {
		return pizzaDao.getPizza(pizzaId);
	}

	public Pizza getByName(String pizzaName) {
		return pizzaDao.getByName(pizzaName);
	}

}
