package org.spring.aop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class AOPExpression {
	
	//pointcut declaration
	@Pointcut("execution(* org.spring.aop.dao.*.*(..))")
	public void forDaoPackage() {}
	
	//create a pointcut for getter
	@Pointcut("execution(* org.spring.aop.dao.*.get*(..))")
		public void getter() {}
	
	//create a pointcut for setter
		@Pointcut("execution(* org.spring.aop.dao.*.set*(..))")
			public void setter() {}
	//create pointcut include package exclude getter and setter
		@Pointcut("forDaoPackage() && !(getter() || setter())")
	public void noGetterNoSetter() {}

}
