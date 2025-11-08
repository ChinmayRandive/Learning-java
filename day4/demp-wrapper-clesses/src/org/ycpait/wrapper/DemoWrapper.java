package org.ycpait.wrapper;

public class DemoWrapper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
			//primitive
			int i= 10;

			//Primitive to Wrapper 
			
			// old method 
			//Integer iObj = new Integer(i);
			
			// new method
			Integer iObj = i; // auto-boxing
			
			//wrapper to primitive
			int j = iObj.intValue();
			
			//==============================================
			
			//string to wrapper
			Integer o = Integer.valueOf("77");
			 
			//wrapper to string
			String str = o.toString();
			//==============================================
			
			//String to primitive
			int p = Integer.parseInt("87");
			
			//primitive to string
			String data = Integer.toString(p);
			
			//==============================================
			
		
	}

}
