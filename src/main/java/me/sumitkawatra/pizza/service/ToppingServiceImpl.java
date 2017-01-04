/**
 * Feel free to use, reuse and abuse this code.
 */
package me.sumitkawatra.pizza.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import me.sumitkawatra.pizza.dao.ToppingDao;
import me.sumitkawatra.pizza.domain.Topping;

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

	public Topping saveTopping(Topping topping) {
		return toppingDao.saveTopping(topping);
	}

	public List<Topping> listTopping() {
		return toppingDao.listTopping();
	}

	public Topping getTopping(Long toppingId) {
		return toppingDao.getTopping(toppingId);
	}

	public Topping getByName(String toppingName) {
		return toppingDao.getByName(toppingName);
	}

}
