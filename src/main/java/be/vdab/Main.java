package be.vdab;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/*
 * Je benadert de IOC container vanuit je code met de class ClassPathXmlApplicationContext.
 */

public class Main {

	public static void main(String[] args) {
		
		// De constructor parameter is de naam van het Spring configuratiebestand.
		try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("container.xml")) {
		}
	}
}
