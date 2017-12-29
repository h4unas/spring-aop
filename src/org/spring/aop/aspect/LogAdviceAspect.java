package org.spring.aop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(3)
public class LogAdviceAspect {
	
	@Before("org.spring.aop.aspect.AOPExpression.noGetterNoSetter()")
	public void logAdvice() {
		System.out.println("@log advice is called");
	}

}
