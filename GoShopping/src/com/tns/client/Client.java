package com.tns.client;
import com.tns.application.*;
//import com.tns.framework.*;

public class Client 
{
	public static void main(String[] args) 
	{
		// Step 1 - Step a
		GSShopFactory gssfactory = new GSShopFactory();
		gssfactory.getNewPrimeAccount(123, "Arman", 1000, true);
		gssfactory.getNewNormalAccount(111, "Arham", 1000, 50);
		
		
		// Step 2
		GSPrimeAcc gsprime = new GSPrimeAcc(0, null, 0, false);
		gsprime.getAccNm();
		gsprime.getAccNo();
		gsprime.getCharges();
		// Step 4 / Step d.
		gsprime.bookProduct(1000);
		
		// Step 5 / Step e.
		gsprime.toString();
		
		// Step 3
		GSNormalAcc gsnormal = new GSNormalAcc(50, null, 50, 50); 
		gsnormal.getAccNm();
		gsnormal.getAccNo();
		gsnormal.getCharges();
		gsnormal.getDeliveryCharge();
		
		// Step 4 / Step d.
		gsnormal.bookProduct(1000);
		// Step 5 / Step e.
		gsnormal.toString();
	
		

	}

}



