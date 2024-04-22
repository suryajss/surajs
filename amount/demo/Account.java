package com.amount.demo;

public class Account {
	public double balance;
	
	public Account() {
		this.balance=0.0;
	}
	public Account(double initiaBalance) {
		this. balance = initiaBalance;
	}
public void deposit(double amount) {
	if(amount>0) {
		balance+=amount;
		System.out.println("Deposit of $"+amount +"successful.");
		
	}else {
		System.out.println("invalid amount.plese enter the postive value");
	}
}
public void withdraw(double amount) {
	if(amount>0&&amount<=balance) {
		balance -=amount;
		System.out.println("withdraw of &"+amount+"succssful");
		
	}
	else {
		System.out.println("invalid amount.plese enter the postive value");
}
}
public void displayBalance() {
	System.out.println("current balance : $"+balance);
}
public static void main(String[] args) {
	Account acc1 =new Account(100);
	acc1.deposit(10000);
	acc1.withdraw(2000);
	acc1.displayBalance();
}
}
