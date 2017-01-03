/**
 * Feel free to use, reuse and abuse this code.
 */
package me.sumitkawatra.pizza.service;

import java.util.List;

import me.sumitkawatra.pizza.domain.Base;

/**
 * @author sumitkawatra
 *
 */
public interface PizzaBaseService {

	/**
	 * save Pizza Base
	 * 
	 * @param pizzaBase
	 * @return Base
	 */
	public abstract Base savePizzaBase(Base pizzaBase);

	/**
	 * get list of Pizza Base.
	 * 
	 * @return List<Base>
	 */
	public abstract List<Base> listBase();

	/**
	 * get Pizza Base per pizzaBaseId
	 * 
	 * @param pizzBaseId
	 * @return Base
	 */
	public abstract Base getPizzaBase(Long pizzBaseId);
	
	/**
	 * get Pizza Base by Name
	 * @param pizzaBaseName
	 * @return Base
	 */
	public abstract Base getByName(String pizzaBaseName);

}
