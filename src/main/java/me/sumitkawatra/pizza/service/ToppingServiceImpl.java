/**
 * Feel free to use, reuse and abuse this code.
 */
package me.sumitkawatra.pizza.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import me.sumitkawatra.pizza.dao.ToppingDao;

/**
 * @author sumitkawatra
 *
 */
@Service
public class ToppingServiceImpl implements ToppingService {
	
	@Autowired
	private ToppingDao toppingDao;

	public ToppingServiceImpl() {

	}

	public ToppingDao getToppingDao() {
		return toppingDao;
	}

	public void setToppingDao(ToppingDao toppingDao) {
		this.toppingDao = toppingDao;
	}

}
