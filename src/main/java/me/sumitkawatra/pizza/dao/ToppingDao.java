/**
 * Feel free to use,reuse and abuse this code.
 */
package me.sumitkawatra.pizza.dao;

import java.util.List;

import me.sumitkawatra.pizza.domain.Topping;

/**
 * @author sumitkawatra
 *
 */
public interface ToppingDao {
	
	/**
	 * save Topping.
	 * @param Topping
	 * @return Topping
	 */
	public abstract Topping saveTopping(Topping Topping);
	
	/**
	 * get list of Topping.
	 * @return List<Topping>
	 */
	public abstract List<Topping> listTopping();
	
	/**
	 * get Topping per toppingId.
	 * @param pizzBaseId
	 * @return Topping
	 */
	public abstract Topping getTopping(Long toppingId); 
	
	/**
	 * get Topping by Name.
	 * @param pizzaBaseName
	 * @return Topping
	 */
	public abstract Topping getByName(String toppingName);

}
