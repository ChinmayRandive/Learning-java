package org.ycpait.practice;

public class BillingSystem {

	static final double unit_rate = 8.0;
	double unit;
	
	BillingSystem(double unit){
		this.unit= unit;
		
	}
	
	void CalculateBill() {
		double Bill =  unit_rate * unit;
		System.out.println("Total bill:" + Bill );
		
	}
}
