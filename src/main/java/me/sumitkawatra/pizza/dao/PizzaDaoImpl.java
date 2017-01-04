/**
 * Feel free to use, reuse and abuse this code.
 */
package me.sumitkawatra.pizza.dao;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import me.sumitkawatra.pizza.domain.Pizza;

/**
 * @author sumitkawatra
 *
 */
@Repository
public class PizzaDaoImpl extends DaoSupport implements PizzaDao {

	/**
	 * 
	 */
	public PizzaDaoImpl() {

	}

	public Pizza savePizza(Pizza pizza) {
		Session session = getSessionFactory().openSession();
		session.beginTransaction();
		BigInteger pizzaId = (BigInteger) session.save(pizza);
		session.flush();
		session.getTransaction().commit();
		session.close();
		return getPizza(pizzaId);

	}

	@SuppressWarnings("unchecked")
	public List<Pizza> listPizza() {
		List<Pizza> pizzas = new ArrayList<Pizza>();
		Session session = getSessionFactory().openSession();
		session.beginTransaction();
		Query query = session.createQuery("from Pizza");
		pizzas = query.list();
		session.getTransaction().commit();
		session.close();
		return pizzas;
	}

	public Pizza getPizza(BigInteger pizzaId) {
		Pizza pizza = new Pizza();
		Session session = getSessionFactory().openSession();
		session.beginTransaction();
		Query query = session.createQuery("from Pizza where id = :pizzaId");
		query.setBigInteger("pizzaId", pizzaId);
		pizza = (Pizza) query.uniqueResult();
		session.getTransaction().commit();
		session.close();
		return pizza;
	}

	public Pizza getByName(String pizzaName) {
		Pizza pizza = new Pizza();
		Session session = getSessionFactory().openSession();
		session.beginTransaction();
		Query query = session.createQuery("from Pizza where name = :pizzaName");
		query.setString("pizzaName", pizzaName);
		pizza = (Pizza) query.uniqueResult();
		session.getTransaction().commit();
		session.close();
		return pizza;
	}

}
