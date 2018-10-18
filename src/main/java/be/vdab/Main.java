package be.vdab;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/*
 * Je benadert de IOC container vanuit je code met de class ClassPathXmlApplicationContext.
 */

public class Main {

	public static void main(String[] args) {
		
		// De constructor parameter is de naam van het Spring configuratiebestand.
		try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("container.xml")) {
			
			// *** Een bean vragen adhv zijn id ***
			/*
			System.out.println(context.getBean("classA", ClassA.class).getBoodschap());
			System.out.println(context.getBean("classB", InterfaceB.class).getBoodschap());
			*/
			
			// *** Een bean vragen adhv zijn class of interface ***
			
			// Als slechts 1 bean bestaat v/e class, kan je die bean vragen met de method getBean, waarbij je enkel die class opgeeft die bij de bean hoort
			System.out.println(context.getBean(ClassA.class).getBoodschap());
			// Als slechts 1 bean bestaat, waarvan de class een interface implementeert, kan je die bean vragen met de method getBean, waarbij je die interface opgeeft.
			System.out.println(context.getBean(InterfaceB.class).getBoodschap());
		}
	}
}
