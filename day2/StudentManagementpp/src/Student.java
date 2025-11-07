public class Student {
	
	private static int count;
	//Attributes
	private int rollNum;
	private String name;
	private float marks;
	
	
	// created setter 
	public void setMarks(float marks) {
		//this.rollNum = rollNum;
		this.marks = marks;
		//this.name = name;
	}
	
	
	
	// rightclick on screen > click source > click generate setter and getter > tick check button > generate
public int getRollNum() {
		return rollNum;
	}


	public void setRollNum(int rollNum) {
		this.rollNum = rollNum;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public float getMarks() {
		return marks;
	}
	
	
	// we can write it in private also  
//	private static void setCount(int count) {
//		Student.count = count;
//	}



//	
//	public Student(){
//		System.out.println("Non Parameterize Constructor");
//		this.rollNum=1;
//		this.name="Default";
//		this.marks=40.0f;
//	}
	public Student(int rollNum,String name,float marks){
//		System.out.println("Parameterize Constructor");
		count++;
		this.rollNum=count;
		this.name=name;
		this.marks=marks;
	}
	public Student(String name,float marks){
//		System.out.println("Parameterize Constructor");
		count++;
		this.rollNum=count;
		this.name=name;
		this.marks=marks;
	}
	
//	void accept(int rollNum,String name,float marks) {
//		this.rollNum=rollNum;
//		this.name=name;
//		this.marks=marks;
//	}
	
	public static int getCount() {
		return count;
	}

	void display() {
		System.out.println(this.rollNum);   //just rollNum will work even though this is not written
		System.out.println(this.name);		// it is recommended to use this explicitly inside the instance method
		System.out.println(this.marks);
		
	}
	void display(String format) {
		System.out.println("RollNumber \t Name \t Marks");
		for(int i=1;i<=40;i++) {
			System.out.print(format);
		}
		System.out.println();
		System.out.println(this.rollNum+ "\t\t"+ this.name+"\t"+this.marks);
		
	}
	
	@Override 
	//to string print the information of object
	public String toString() {
		 System.out.println("in toString");
		return this.rollNum + " " + this.name + " " + this.marks;
	}

}
