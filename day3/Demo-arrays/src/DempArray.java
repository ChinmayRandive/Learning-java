
public class DempArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// if we dont pass value in the array an exception is generated
		// args is local variable we can not access it outside
		System.out.println(args[0]);
		
		
		// Declaration of an array
		int [] numbers;
		numbers =  new int[3];
		
		// Assigining values to array
		numbers[0]= 10;
		numbers[1]= 20;
		numbers[2]= 30;
		//numbers[3]= 40;  // Exception
		
		
		// printing values
		System.out.println(numbers[0]);
		System.out.println(numbers[1]);
		System.out.println(numbers[2]);
		
		
		//way2 assigining values
		float [] marks = new float [2];
		marks [0] = 89.78f;
		marks [1] = 79.88f;
		
		
		//way3******************************************
		String [] subjects = {"java","spring","Dbt"};
		//System.out.println(subjects[0]);
		//System.out.println(subjects[1]);
		
		//**********************************************
		
		// printing values by for loop***********
		//for(int i =0; i< subjects.length;i++) {
		//System.out.println(subjects[i]);
		//}
		//****************************************
		
		
		
		// enhance for loop or for-in loop
		//added in jdk 5
		//*syntax*//
		for (String s : subjects) {
			System.out.println(s);
		}
	}

}
