/**
 * 
 */
package me.sumitkawatra.pizza.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

/**
 * @author sumitkawatra
 *
 */
@Entity
public class Topping {
	
	@Id 
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "topping_seq_gen")
	@SequenceGenerator(name = "topping_seq_gen", sequenceName = "topping_seq")
	private Long id;
	private String name;

	/**
	 * default constructor
	 */
	public Topping() {
		super();
	}

	/**
	 * @param id
	 * @param name
	 */
	public Topping(Long id, String name) {
		super();
		this.id = id;
		this.name = name;
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

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Topping [id=");
		builder.append(id);
		builder.append(", name=");
		builder.append(name);
		builder.append("]");
		return builder.toString();
	}

}
