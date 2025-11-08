
package org.ycpait.geometryapp.entity;

public class Rectangle extends Shape{
	
	private float length;
	private float breadth;
	//private String color;
	
	
//peramaterised constructor
	public Rectangle(float length, float breadth, String color) {
		super(color);
		this.length = length;
		this.breadth = breadth;
		//this.color = color;
	}

	public float calculateArea(){
		return length * breadth;
	}
	
	public void draw () {
		
		//calling the method from shape class 
		super.draw();
		System.out.println("With breadth: " + this.breadth +"  With length: "+this.length );
	}
	
//	public void draw() {
//		System.out.println("Shape Drawn Using Color: " + this.color);
//	}
	@Override
	public void getInfo() {
		
	}

}

