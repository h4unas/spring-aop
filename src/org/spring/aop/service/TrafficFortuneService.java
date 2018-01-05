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
	 
	public String getFortune(boolean trip) {
		try {
			if(trip) {
				throw new RuntimeException("Trip was genarated");
			}
			TimeUnit.SECONDS.sleep(5);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return getFortune();
		
	}

}
