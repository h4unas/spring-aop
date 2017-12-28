package org.spring.aop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(1)
public class CloudAdviceAspect {
	

	//lets start with @Before advice
	@Before("org.spring.aop.aspect.AOPExpression.noGetterNoSetter()")
	public void beforeAddBeforeAdvice() {
		System.out.println("@cloud advice");
	}

	
	
}
