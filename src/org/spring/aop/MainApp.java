package org.spring.aop;

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
				
				// call the business method
				dao.addAccount();
				
				// get the bean from spring container
				MembershipDAO dao1 = context.getBean( MembershipDAO.class);
				
				// call the business method
				dao1.addMembership();

//				String str=
						dao.printAccount();
						
				// close the context
				context.close();
	}

}
