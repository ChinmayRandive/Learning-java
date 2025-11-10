package org.ycpait.geometryapp;

interface Printable{
	
	void print();
	
	static void of() {}
	////this is default method without                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         
	default void printFormat() {
		System.out.println("Default printFormat");
	}
}


public interface Drawable {
int PX =1;
void draw();
void print();
}

class Circle implements Drawable, Printable{
	@Override
	public void draw() {
		System.out.println(PX);
	//	PX = 1;
	}
	@Override
	public void print() {
		
	}
	public void printFormat() {
	
	}
	
	class Main{
		
		public static void main(String[]args) {
			Drawable d;
			// d= new Drawable();//this is error
		}
	}
}
