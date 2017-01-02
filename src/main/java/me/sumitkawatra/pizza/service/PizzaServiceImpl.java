/**
 * Feel free to use, reuse and abuse this code.
 */
package me.sumitkawatra.pizza.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import me.sumitkawatra.pizza.dao.PizzaDao;

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

}
