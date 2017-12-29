package org.spring.aop;

import java.util.List;

import org.spring.aop.dao.Account;
import org.spring.aop.dao.AccountDAO;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainAppAfterReturning {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		AccountDAO dao = context.getBean("accountDAO",AccountDAO.class);
		
		//call findAccount method
		List<Account> accounts = dao.findAccount();
		
		//System.out.println(accounts);
		
		
		//close the context
		context.close();
	}

}
