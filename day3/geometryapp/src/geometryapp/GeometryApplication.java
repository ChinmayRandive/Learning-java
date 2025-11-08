package geometryapp;

public class GeometryApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Circle c = new Circle(2.89f," black");
		System.out.println("Area of circle is: "+ c.calculateArea());
		c.draw();
		
		Rectangle r = new Rectangle(50.0f,30.0f,"blue");
		System.out.println("Area of Rectangle is: " + r.calcilateArea());
		r.draw();

	}

}
