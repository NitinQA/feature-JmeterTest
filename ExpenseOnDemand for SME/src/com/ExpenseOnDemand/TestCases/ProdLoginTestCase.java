package com.ExpenseOnDemand.TestCases;
import java.io.IOException;

import com.ExpenseOnDemand.utility.*;

public class ProdLoginTestCase extends ProdLogin {

	public static void main(String[] args) {

		ProdLoginTestCase prodlogin=new ProdLoginTestCase();
		
		
		prodlogin.ieBrowser();
		
		
		prodlogin.prodUrl();
		
		
		try {
			prodlogin.loginCredentials();
		} catch (IOException | InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		/*
		 * prodlogin.chromeBrowser(); try { prodlogin.loginCredentials(); } catch
		 * (IOException | InterruptedException e) { // TODO Auto-generated catch block
		 * e.printStackTrace(); }
		 */


	}

}
