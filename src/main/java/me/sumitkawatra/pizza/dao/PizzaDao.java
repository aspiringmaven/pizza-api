/**
 * 
 */
package me.sumitkawatra.pizza.dao;

import java.math.BigInteger;
import java.util.List;

import me.sumitkawatra.pizza.domain.Pizza;

/**
 * @author sumitkawatra
 *
 */
public interface PizzaDao {
	
	/**
	 * save pizza.
	 * @param pizza
	 * @return Pizza
	 */
	public abstract Pizza savePizza(Pizza pizza);
	
	/**
	 * get list of Pizza Base.
	 * @return List<Pizza>
	 */
	public abstract List<Pizza> listPizza();
	
	/**
	 * get Pizza per pizzaId
	 * @param pizzaId
	 * @return Pizza
	 */
	public abstract Pizza getPizza(BigInteger pizzaId); 
	
	/**
	 * get Pizza by Name
	 * @param pizzaName
	 * @return Pizza
	 */
	public abstract Pizza getByName(String pizzaName);

}
