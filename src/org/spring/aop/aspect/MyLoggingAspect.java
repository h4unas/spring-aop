package org.spring.aop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyLoggingAspect {
	
	//This is where we add all of our related advice for logging
	//lets start with @Before advice
	@Before("execution(public void add*())")
	public void beforeAddBeforeAdvice() {
		System.out.println("this is @Before advice");
	}
}
