/**
 * Feel free to use, reuse and abuse this code.
 */
package me.sumitkawatra.pizza;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

/**
 * @author sumitkawatra
 *
 */
@Component
public class PizaaPostProcessor implements BeanPostProcessor{

	/**
	 * 
	 */
	public PizaaPostProcessor() {
	}

	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println(" finished ! " + beanName);
		return bean;
	}

	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.print(beanName + " init start.... ");
		return bean;
	}

}
