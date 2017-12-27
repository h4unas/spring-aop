package org.spring.aop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyLoggingAspect {
	
	//pointcut declaration
	@Pointcut("execution(* org.spring.aop.dao.*.*(..))")
	private void forDaoPackage() {}
	
	//lets start with @Before advice
	@Before("forDaoPackage()")
	public void beforeAddBeforeAdvice() {
		System.out.println("this is @Before advice");
	}
}
