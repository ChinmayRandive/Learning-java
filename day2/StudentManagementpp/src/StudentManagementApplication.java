
public class StudentManagementApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		1. Create a reference
		System.out.println("No. of Students:"+Student.getCount());
		Student s,s1;
		
//		2. Create object and assign to reference variable
		s=new Student(1, "Amit", 83.38f);
		s.display("=");
		s1=new Student("Mayur", 86.38f);
	//	s.rollNum=-1;		// to stop this we make sure rollnum is not accessible outside the class in which it is declared
//		s.name="Amit";
//		s.marks=89.38f;
		
//		s.accept(1, "Amit", 83.38f);
//		s1.accept(2, "Mayur", 86.38f);
		
		
	
		s1.display("=");
		System.out.println("No. of Students:"+Student.getCount());
		
		
	}

}
