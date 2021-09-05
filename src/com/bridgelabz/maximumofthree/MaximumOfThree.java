package com.bridgelabz.maximumofthree;

public class MaximumOfThree {
	public static void main(String args[]) {
		System.out.println("******* Welcome to Maximum of Three Program *******");
		Integer firstNumber = 34, secondNumber = 201, thirdNumber = 25;
		findMaximum(firstNumber, secondNumber, thirdNumber);
		Float number1 = 1.2f, number2 = 8.12f, number3 = 17.44f;
		findMaximum(number1, number2, number3);
		String firstString = "Apple", secondString = "Banana", thirdString = "Peach";
		findMaximum(firstString, secondString, thirdString);
	}

	public static <T extends Comparable<T>> void findMaximum(T firstNumber, T secondNumber, T thirdNumber) {
		T maximumNumber;
		
		if(firstNumber.compareTo(secondNumber)>0 && firstNumber.compareTo(thirdNumber)>0) {
			maximumNumber = firstNumber;
		}
		else if(secondNumber.compareTo(firstNumber)>0 && secondNumber.compareTo(thirdNumber)>0) {
			maximumNumber = secondNumber;
		}
		else {
			maximumNumber = thirdNumber;
		}
		
		System.out.println("The maximum number is: " + maximumNumber);
	}

}