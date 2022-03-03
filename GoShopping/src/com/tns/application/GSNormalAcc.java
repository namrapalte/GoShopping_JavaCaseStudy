package com.tns.application;
import com.tns.framework.*;


public class GSNormalAcc extends NormalAcc{

	
	public GSNormalAcc(int accNo, String accNm, float charges, float deliveryCharge) {
		super(accNo, accNm, charges, deliveryCharge);
		
	}
	
//	public GSNormalAcc() {
//		super(accNo, accNm, deliveryCharge, deliveryCharge);
//		// TODO Auto-generated constructor stub
//	}


	public void bookProduct(float charges) {

		System.out.println("Dear Normal User, Your Charges are: "+charges+" with Delivery Charges is: "+deliveryCharge);
		
	}

	@Override
	public String toString() {
		return "GSNormalAcc [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	
	
}
