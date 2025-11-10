
public class Student {
	private static int count;
	
	//attributes OR Instance Variables
	private int rollNumber;
	private String name;
	private float marks;
	
	public void setMarks(float marks)
	{
		this.marks=marks;
	}
	
	public float getMarks()
	{
		return this.marks;
	}
	//method defination
	//instance method
	void display(){
		System.out.println(this.name);//(s.name)
		System.out.println(this.rollNumber);
		System.out.println(this.marks);
	}
	void display(String format) {
		
		System.out.println("RollNumber \t Name \t  Marks");
		for (int i = 0; i <= 60; i++)
			System.out.print(format);
		
		System.out.println();
		System.out.println(this.rollNumber+"   \t      "+this.name+" \t      "+this.marks);
		
	}
	public static int getCount() {
		return count;
	}
	
//	void accept(int rollNumber,String name,float marks) {
//		this.rollNumber=rollNumber;
//		this.name=name;
//		this.marks=marks;
//	}
	
//	public Student(){
//		this.name="Guest";
//		this.rollNumber=1;
//		this.marks=96.8f;
//	}
	
	public Student(int rollNumber,String name, float marks) {
		System.out.println("Parameterized Constructor");
		count++;
		this.rollNumber=rollNumber;
		this.name=name;
		this.marks=marks;
	}
	@Override
	public String toString()
	{
		System.out.println("in toString");
		return this.rollNumber+"   \t      "+this.name+" \t      "+this.marks;
	}
}