package com.vti.entity.Encapsulation1;

public class Circle {
	private double radius = 1.0;
	private String color = "red";
	private final double PI = 3.14;
	
	public static void main(String[] args) {
		

	}
	public Circle() {}
	public Circle(double radius) {
		
	}
	public Circle(double radius, String color) {
		
	}
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	} 
	
	public double getArea() {
		return PI * Math.pow(radius, 2.0);
	}
	@Override
	public String toString() {
		return "Circle [radius=" + radius + ", color=" + color + ", PI=" + PI + "]";
	}
	
	

}
