class DemoConditionalConstructs{
	public static void main(String[]args){
		int age;    //variable declaration
		age= 18;	// assigining value
		char nationality= 'I';
		
		if (age>18){
		System.out.println("Eligible for voting");
}		



		if (age>18){
			if(nationality =='I')
				System.out.println("Eligible for voting");
}	

				//or

		
		if (age>18 && nationality =='I'){
				System.out.println("Eligible for voting");
}		




		else{
				System.out.println("Not Eligible for voting");
}
		

}

}