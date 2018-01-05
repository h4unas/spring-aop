package org.spring.aop.service;

import java.util.concurrent.TimeUnit;

import org.springframework.stereotype.Component;

@Component
public class TrafficFortuneService {
	
	public String getFortune() {
		try {
			TimeUnit.SECONDS.sleep(5);
			//Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "smooth traffic this morning:";
		
	}

}
