package org.ycpait.geometryapp;

import org.ycpait.geometryapp.entity.Circle;
import org.ycpait.geometryapp.entity.Shape;

public class GeometryApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Circle c = new Circle(2.89f," black");
//		System.out.println("Area of circle is: "+ c.calculateArea());
//		c.draw();
//		
//		Rectangle r = new Rectangle(50.0f,30.0f,"blue");
//		System.out.println("Area of Rectangle is: " + r.calcilateArea());
//		r.draw();
		
		//--------------------------------------
		
		//shape= reference =  new circle = object
		//s is reference of super class
		// circle method will call
		
				Shape s; // reference 
		// s= new Shape();// van not be created because instantiate abstract class //Error
				s=new Circle(4,"red");
				
				
				// invoking generalised method
				s.calculateArea();
				s.calculatePerimeter();
				s.draw();
				
				//invoking special method
				Circle c=(Circle)s; //downcasting
				c.getPi();
				
				System.out.println("Area of circle is: "+ s.calculateArea());
				s.draw();
				
//				Circle c1 = new Circle(2.89f," black");
				s=c;// upcasting
				System.out.println("\nArea of circle is: "+ s.calculateArea());
				s.draw();
				
				
				
				
				
	}
	}

