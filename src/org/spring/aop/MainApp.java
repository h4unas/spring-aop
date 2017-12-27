package org.spring.aop;

import org.spring.aop.dao.Account;
import org.spring.aop.dao.AccountDAO;
import org.spring.aop.dao.MembershipDAO;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException {
		// read spring config java class
				AnnotationConfigApplicationContext context =
						new AnnotationConfigApplicationContext(Config.class);
				
				// get the bean from spring container
				AccountDAO dao = context.getBean("accountDAO", AccountDAO.class);
				
				//account class is created
				Account account = new Account(1, "babu");
				
				// call the business methods
				dao.addAccount();

				dao.addAccount(account);
				
				dao.printAccount();

			
						
				// close the context
				context.close();
	}

}
