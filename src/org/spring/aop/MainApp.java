package org.spring.aop;

import org.spring.aop.dao.AccountDAO;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		// read spring config java class
				AnnotationConfigApplicationContext context =
						new AnnotationConfigApplicationContext(Config.class);
				
				// get the bean from spring container
				AccountDAO dao = context.getBean("accountDAO", AccountDAO.class);
				
				// call the business method
				dao.addAccount();

				// do it again!
				System.out.println("\nlet's call it again!\n");
				
				// call the business method again
				dao.addAccount();
						
				// close the context
				context.close();
	}

}
