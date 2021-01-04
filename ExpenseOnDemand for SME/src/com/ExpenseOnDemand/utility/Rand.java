package com.ExpenseOnDemand.utility;
import java.util.Random;
public class Rand {



public static CharSequence[] username() {
		int leftLimit = 97; // letter 'a'
		int rightLimit = 122; // letter 'z'
		int targetStringLength = 5;
		Random random = new Random();

		String generatedString = random.ints(leftLimit, rightLimit + 1).limit(targetStringLength).collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append).toString();
			

		System.out.println(generatedString);
		return null;
	}


	public static void main(String[] args) {

		
		  Rand user = new Rand();
		  Rand.username();
		 
			}

}



