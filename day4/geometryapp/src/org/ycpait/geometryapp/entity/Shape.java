package org.ycpait.geometryapp.entity;


// abstract written 
public abstract  class Shape {
	protected String color;

	public Shape(String color) { 
		super();
		
		System.out.println("\nIn Shape(String color)");
		this.color = color;
	}
	
	// 
	public abstract float calculateArea();
	
	public abstract void getInfo();
	
	
	public void draw() {
	
		System.out.println("Shape Drawn Using Colour: " + this.color);
	}
	
	public void calculatePerimeter() {
		
	}
}