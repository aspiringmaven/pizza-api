/**
 * Feel free to use, reuse and abuse this code.
 */
package me.sumitkawatra.pizza.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import me.sumitkawatra.pizza.dao.PizzaBaseDao;

/**
 * @author sumitkawatra
 *
 */
@Service
public class PizzaBaseServiceImpl implements PizzaBaseService {

	@Autowired
	private PizzaBaseDao pizzaBaseDao;

	public PizzaBaseServiceImpl() {

	}

	public PizzaBaseDao getPizzaBaseDao() {
		return pizzaBaseDao;
	}

	public void setPizzaBaseDao(PizzaBaseDao pizzaBaseDao) {
		this.pizzaBaseDao = pizzaBaseDao;
	}

}
