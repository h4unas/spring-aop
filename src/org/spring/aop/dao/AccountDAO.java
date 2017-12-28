package org.spring.aop.dao;

import org.springframework.stereotype.Component;

@Component
public class AccountDAO {
	int no;
	
	public void addAccount() {
		System.out.println("addAccount() with no arg:");
		System.out.println("==========================================");
	}
	public void printAccount(Account account, String dept) {
		System.out.println("Name is:"+account.name+" and his dept is :"+dept);
		System.out.println("==========================================");
		
	}
	public void addAccount(Account account) {
		System.out.println("name ="+account.getName());
		System.out.println("number ="+account.getNumber());
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
