package org.spring.aop;

import java.util.List;
import java.util.logging.Logger;

import org.spring.aop.dao.Account;
import org.spring.aop.dao.AccountDAO;
import org.spring.aop.service.TrafficFortuneService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainAppArroundWithLogger {
	private static Logger logger=Logger.getLogger(MainAppArroundWithLogger.class.getName());

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		TrafficFortuneService fortuneService = context.getBean(TrafficFortuneService.class);
		String data = fortuneService.getFortune();
		logger.info("The fortune Service is:"+data);
		context.close();
	}

}
