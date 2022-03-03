package com.tns.application;
import com.tns.framework.*;

public class GSPrimeAcc extends PrimeAcc {
	private static final float charges=0;
	
	public float getCharges() {
		return charges;
	}
	
	public GSPrimeAcc(int accNo, String accNm, float charges, boolean isPrime) {
		super(accNo, accNm, charges, isPrime);
		
	}
//	public GSPrimeAcc() 
//	{
//		super(accNo, accNm, charges, isPrime);
//		// TODO Auto-generated constructor stub
//	}


	public void bookProduct(float isPrime) {
		System.out.println("Dear Prime User, Your Product Charges are: "+charges);
	}

//see afterwards
//	@Override
//	public String toString() {
//		return "GSPrimeAcc [isPrime=" + isPrime + ", accNo=" + accNo + ", charges=" + charges + ", toString()="
//				+ super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
//	};
//	
	@Override
	public String toString() {
		return "GSPrimeAcc []";
	}
	

}
