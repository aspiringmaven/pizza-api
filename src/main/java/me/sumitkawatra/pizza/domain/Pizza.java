/**
 * 
 */
package me.sumitkawatra.pizza.domain;

import java.math.BigDecimal;
import java.util.Set;

/**
 * @author sumitkawatra
 *
 */
public class Pizza {

	private Long id;
	private String name;
	private Base base;
	private Set<Topping> toppings;

	private BigDecimal price;

	/**
	 * 
	 */
	public Pizza() {
		super();
	}

	/**
	 * @param id
	 * @param name
	 * @param base
	 * @param toppings
	 * @param price
	 */
	public Pizza(Long id, String name, Base base, Set<Topping> toppings, BigDecimal price) {
		super();
		this.id = id;
		this.name = name;
		this.base = base;
		this.toppings = toppings;
		this.price = price;
	}

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the base
	 */
	public Base getBase() {
		return base;
	}

	/**
	 * @param base
	 *            the base to set
	 */
	public void setBase(Base base) {
		this.base = base;
	}

	/**
	 * @return the toppings
	 */
	public Set<Topping> getToppings() {
		return toppings;
	}

	/**
	 * @param toppings
	 *            the toppings to set
	 */
	public void setToppings(Set<Topping> toppings) {
		this.toppings = toppings;
	}

	/**
	 * @return the price
	 */
	public BigDecimal getPrice() {
		return price;
	}

	/**
	 * @param price
	 *            the price to set
	 */
	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Pizza [id=");
		builder.append(id);
		builder.append(", name=");
		builder.append(name);
		builder.append(", base=");
		builder.append(base);
		builder.append(", toppings=");
		builder.append(toppings);
		builder.append(", price=");
		builder.append(price);
		builder.append("]");
		return builder.toString();
	}

}
