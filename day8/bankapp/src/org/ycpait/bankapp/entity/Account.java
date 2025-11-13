package org.ycpait.bankapp.entity;

import com.sun.tools.javap.TryBlockWriter;

public class Account {
	private int balance;
	
	public Account(int balance) {
		this.balance = balance;
	}
	public int getBalance() {
		return balance;
	}
	synchronized public void withdrawl(int amount) {
		System.out.println(this.balance + " Check Balance By "+ Thread.currentThread().getName());
		this.balance=this.balance - amount;
		System.out.println(this.balance + " Check Balance By "+ Thread.currentThread().getName());
	}
	
	
	
	
	
	synchronized public void deposit(int amount) {
		System.out.println(this.balance + " Check Balance By "+ Thread.currentThread().getName());
		this.balance=this.balance + amount;
		System.out.println(this.balance + " Check Balance By  "+ Thread.currentThread().getName());
	}

}
