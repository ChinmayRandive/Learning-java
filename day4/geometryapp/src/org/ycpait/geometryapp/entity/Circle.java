package org.ycpait.geometryapp.entity;


// now shape become sub class of base class
public class Circle extends Shape{

		private float radius;
		//private String color;
	
		public Circle(float radius, String color) {
			super(color);
			this.radius = radius;
			//this.color = color;
		}

		
		public float calculateArea(){
			return 3.14f * radius * radius;  
		}
		
		
		@Override 	// built in annotation to check if overriding is appropriate
					// it is recommended to annotate for override methods
					// not mandatory 
		
		//***this is method overriding***
		public void draw () {
			//calling the method from shape class 
			super.draw();
			System.out.println("With radius: " + this.radius);
		}
		@Override
		public void getInfo() {
			
		}
		
		public float getPi() {
			return 3.14f;
		}
		
		
		
	
		
}