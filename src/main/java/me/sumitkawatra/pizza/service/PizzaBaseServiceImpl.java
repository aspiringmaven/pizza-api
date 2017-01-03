/**
 * Feel free to use, reuse and abuse this code.
 */
package me.sumitkawatra.pizza.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import me.sumitkawatra.pizza.dao.PizzaBaseDao;
import me.sumitkawatra.pizza.domain.Base;

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

	public Base savePizzaBase(Base pizzaBase) {
		return pizzaBaseDao.savePizzaBase(pizzaBase);
	}

	public List<Base> listBase() {
		return pizzaBaseDao.listBase();
	}

	public Base getPizzaBase(Long pizzBaseId) {
		return pizzaBaseDao.getPizzaBase(pizzBaseId);
	}

	public Base getByName(String pizzaBaseName) {
		return pizzaBaseDao.getByName(pizzaBaseName);
	}

}
