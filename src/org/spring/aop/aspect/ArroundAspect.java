package org.spring.aop.aspect;

import java.util.logging.Logger;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(4)
public class ArroundAspect {
	private  Logger logger = Logger.getLogger(getClass().getName());
	@Around("execution(* org.spring.aop.service.TrafficFortuneService.getFortune(..))")
	public Object arround(ProceedingJoinPoint point)throws Throwable {
		String method = point.getSignature().toShortString();
		logger.info("@Arround advice method called is"+method);
		//measher the time consumption of method
		long start =System.currentTimeMillis();
		Object result = point.proceed();
		long end =System.currentTimeMillis();
		logger.info("The result:"+result);
		end = (end-start)/1000;
		String added = end+"sec";
		//Modifing the output for main function
		return "Modified Fortune service by @Arround: "+result +added;
		
	}
	

}
