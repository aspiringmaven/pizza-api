/**
 * Feel free to use, reuse and abuse this code.
 */
package me.sumitkawatra.pizza.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import me.sumitkawatra.pizza.domain.Topping;

/**
 * @author sumitkawatra
 *
 */
@Repository
public class ToppingDaoImpl extends DaoSupport implements ToppingDao {

	/**
	 * 
	 */
	public ToppingDaoImpl() {
	}

	public Topping saveTopping(Topping topping) {
		Session session = getSessionFactory().openSession();
		session.beginTransaction();
		Long toppingId = (Long) session.save(topping);
		session.getTransaction().commit();
		session.close();
		return this.getTopping(toppingId);
	}

	@SuppressWarnings("unchecked")
	public List<Topping> listTopping() {
		List<Topping> toppings = new ArrayList<Topping>();
		Session session = getSessionFactory().openSession();
		session.beginTransaction();
		Query query = session.createQuery("from Topping");
		toppings = query.list();
		session.getTransaction().commit();
		session.close();
		return toppings;
	}

	public Topping getTopping(Long toppingId) {
		Topping topping = new Topping();
		Session session = getSessionFactory().openSession();
		session.beginTransaction();
		topping = (Topping) session.get(Topping.class, toppingId);
		session.getTransaction().commit();
		session.close();
		return topping;
	}

	public Topping getByName(String toppingName) {
		Topping topping = new Topping();
		Session session = getSessionFactory().openSession();
		session.beginTransaction();
		Query query = session.createQuery("from Topping where name = :toppingName");
		query.setString("toppingName", toppingName);
		topping = (Topping) query.uniqueResult();
		session.getTransaction().commit();
		session.close();
		return topping;
	}

}
