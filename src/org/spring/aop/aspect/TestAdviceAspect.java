package org.spring.aop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(2)
public class TestAdviceAspect {
	@Before("org.spring.aop.aspect.AOPExpression.noGetterNoSetter()")
	public void testAdvice(JoinPoint point) {
		//System.out.println("Test advice is called");
		
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
	

}
