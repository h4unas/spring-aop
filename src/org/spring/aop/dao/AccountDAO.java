package org.spring.aop.dao;

import org.springframework.stereotype.Component;

@Component
public class AccountDAO {
	int no;
	
	public void addAccount() {
		System.out.println(getClass().getSimpleName());
		System.out.println("==========================================");
	}
	public void printAccount() {
		System.out.println("Account value printed");
		System.out.println("==========================================");
		
	}
	public void addAccount(Account account) {
		System.out.println("name ="+account.getName());
		System.out.println("name ="+account.getNumber());
		System.out.println("==========================================");
		
		
	}
	public int getNo() {
		System.out.println("getter method is called:");
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	
}
