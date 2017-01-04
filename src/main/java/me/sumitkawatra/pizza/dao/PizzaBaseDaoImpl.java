/**
 * Feel free to use, reuse and abuse this code.
 */
package me.sumitkawatra.pizza.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import me.sumitkawatra.pizza.domain.Base;

/**
 * @author sumitkawatra
 *
 */
@Repository
public class PizzaBaseDaoImpl extends DaoSupport implements PizzaBaseDao {

	/**
	 * 
	 */
	public PizzaBaseDaoImpl() {

	}

	public Base savePizzaBase(Base pizzaBase) {
		Session session = getSessionFactory().openSession();
		session.beginTransaction();
		Long pizzaBaseId = (Long) session.save(pizzaBase);
		session.flush();
		session.getTransaction().commit();
		session.close();
		return getPizzaBase(pizzaBaseId);
	}

	@SuppressWarnings("unchecked")
	public List<Base> listBase() {
		List<Base> pizzaBases = new ArrayList<Base>();
		Session session = getSessionFactory().openSession();
		session.beginTransaction();
		Query query = session.createQuery("from Base");
		pizzaBases = query.list();
		session.getTransaction().commit();
		session.close();
		return pizzaBases;
	}

	public Base getPizzaBase(Long pizzaBaseId) {
		Base pizzaBase = new Base();
		Session session = getSessionFactory().openSession();
		session.beginTransaction();
		pizzaBase = (Base) session.get(Base.class, pizzaBaseId);
		session.getTransaction().commit();
		session.close();
		return pizzaBase;
	}

	public Base getByName(String pizzaBaseName) {
		Base pizzaBase = new Base();
		Session session = getSessionFactory().openSession();
		session.beginTransaction();
		Query query = session.createQuery("from Base where name = :pizzaBaseName");
		query.setString("pizzaBaseName", pizzaBaseName);
		pizzaBase = (Base) query.uniqueResult();
		session.getTransaction().commit();
		session.close();
		return pizzaBase;
	}

}
