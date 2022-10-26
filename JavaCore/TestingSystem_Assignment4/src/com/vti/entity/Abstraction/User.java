package com.vti.entity.Abstraction;

public abstract class User {
	private String name;
	protected double salaryRatio;
	
	public User(String name, double salaryRatio) {
		this.name = name;
		this.salaryRatio = salaryRatio;
	}
	
	public abstract double calculatePay();
	
	public void displayInfor() {
		System.out.println("Name: " + name);
		System.out.println("Salary ratio: " + salaryRatio);
		System.out.println("Pay: " + calculatePay());
	}
}
