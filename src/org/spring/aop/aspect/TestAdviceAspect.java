package org.spring.aop.aspect;

import java.util.List;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.spring.aop.dao.Account;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(2)
public class TestAdviceAspect {
	@Before("org.spring.aop.aspect.AOPExpression.noGetterNoSetter()")
	public void testAdvice(JoinPoint point) {
		
		//display the method signature
		MethodSignature signature = (MethodSignature)point.getSignature();
		System.out.println("@Test Method signature is:"+signature);
		
		//display method argument
		
		//get arguments
		Object[] args = point.getArgs();
		System.out.println("Argument List:");
		//loop the args
		for (Object object : args) {
			System.out.println(object);
		}
		
	
	}
	@AfterReturning(
			pointcut = "execution(* org.spring.aop.dao.AccountDAO.findAccount(..))", 
			returning = "result")
	public void afterReturningFindAccountAdvice(JoinPoint point, List<Account> result) {
		
		//print the method
		String method = point.getSignature().toShortString();
		System.out.println("@Test@After");
		System.out.println("Method :"+method);
		
		//print the returning
		System.out.println("IT RETURNS :"+result);
		
		//Post process the data
		convertUpperCase(result);
		System.out.println("After Post Process:");
		System.out.println(result);
	}
	private void convertUpperCase(List<Account> result) {
		//loop through the account
		for (Account account : result) {
			//change to upper
			String upperCase = account.getName().toUpperCase();
			account.setName(upperCase); 
		}
		
	}
	
	
	

}
