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
public class Base {
	
	@Id 
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "base_seq_gen")
	@SequenceGenerator(name = "base_seq_gen", sequenceName = "base_seq")
	private Long id;
	private String name;

	/**
	 * default constructor
	 */
	public Base() {
		super();
	}

	/**
	 * @param id
	 * @param name
	 */
	public Base(Long id, String name) {
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
		builder.append("Base [id=");
		builder.append(id);
		builder.append(", name=");
		builder.append(name);
		builder.append("]");
		return builder.toString();
	}

}
