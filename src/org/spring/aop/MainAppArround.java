package org.spring.aop;

import java.util.List;

import org.spring.aop.dao.Account;
import org.spring.aop.dao.AccountDAO;
import org.spring.aop.service.TrafficFortuneService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainAppArround {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		TrafficFortuneService fortuneService = context.getBean(TrafficFortuneService.class);
		String data = fortuneService.getFortune();
		System.out.println("The fortune Service is:"+data);
		context.close();
	}

}
