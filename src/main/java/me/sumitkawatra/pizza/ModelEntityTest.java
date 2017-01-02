/**
 * This is Temporary class in this project to test ORM mapping
 * 
 * me.sumitkawatra.pizza.domain.Pizza
 * me.sumitkawatra.pizza.domain.Base
 * me.sumitkawatra.pizza.domain.Topping
 * 
 */
package me.sumitkawatra.pizza;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import me.sumitkawatra.pizza.domain.Base;
import me.sumitkawatra.pizza.domain.Pizza;
import me.sumitkawatra.pizza.domain.Topping;

@Component
public class ModelEntityTest {
	

	private SessionFactory sessionFactory;
	
	public ModelEntityTest() {
		System.out.println("Pizza DB Init Success");
	}
	

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	
	@Autowired
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
		Base base = new Base();
		base.setName("Italian");
		
		Set<Topping> toppings = new HashSet<Topping>();
		toppings.add(new Topping(null, "Cheese"));
		toppings.add(new Topping(null, "Onion"));
		toppings.add(new Topping(null, "Capsicum"));
		
		Pizza pizza = new Pizza(null,"Special Pizza", base, toppings, new BigDecimal(500));
		
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(base);
		session.flush();
		session.save(pizza);
		transaction.commit();
		session.close();
	}

}
