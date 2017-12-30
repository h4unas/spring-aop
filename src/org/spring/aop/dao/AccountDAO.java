package org.spring.aop.dao;

import java.util.ArrayList;
import java.util.List;

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
	public List<Account> findAccount(boolean trip) {
		
		if(trip) {
			throw new  RuntimeException("tripper is in on");
		}
		List<Account> accounts = new ArrayList<>();
//		System.out.println("==========================================");
		
		//create sample account
		Account account1 = new Account(2,"balakrishnan"); 
		Account account2 = new Account(3,"pandi"); 
		Account account3 = new Account(4,"durai singam");
		
		//add the accounts to list
		accounts.add(account1);
		accounts.add(account2);
		accounts.add(account3);
		
		//return accounts
		return accounts;
		
	}
	
	public int getNo() {
		System.out.println("getter method is called:");
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	
}
