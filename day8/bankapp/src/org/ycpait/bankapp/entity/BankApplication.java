package org.ycpait.bankapp.entity;

public class BankApplication {

	public static void main(String[] args) {
	
		
		// TODO Auto-generated method stub
		Account a = new Account(5000);
	//  	a.withdrawl(500);
		
		
		Thread wife = new Thread(()-> a.withdrawl(1000));
		wife.setName("wife");
		
		
		Thread husband = new Thread(()-> a.deposit(1000));
		husband.setName("husband");
		//husband.setName("Husband");
		wife.start();
		husband.start();
		
	}

}
