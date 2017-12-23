package org.spring.aop.dao;

import org.springframework.stereotype.Component;

@Component
public class AccountDAO {
	public void addAccount() {
		System.out.println(getClass().getSimpleName());
	}
	public void printAccount() {
		System.out.println("getClass().getMethod(printAccount(), null)");
		//return "nothing";
		
	}
}
