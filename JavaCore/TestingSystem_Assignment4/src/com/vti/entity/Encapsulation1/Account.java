package com.vti.entity.Encapsulation1;

public class Account {
	private String id;
	private String name;
	private int balance;
	
	public static void main(String[] args) {
	}

	public Account(String id, String name, int balance) {}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	public int credit(int amount) {
		return amount;
	}
	public int debit(int amount) {
		return amount;
	}
	public void tranferTo(Account account, int amount) {
		System.out.println("Tranfer " + account + " to " + account.getName());
	}
	
}
