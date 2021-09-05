package com.bridgelabz.maximumofthree;

public class MaximumOfThree {
	public static void main(String args[]) {
		System.out.println("******* Welcome to Maximum of Three Program *******");
		Integer firstNumber = 34, secondNumber = 201, thirdNumber = 25;
		findMaximum(firstNumber, secondNumber, thirdNumber);
	}

	public static void findMaximum(Integer firstNumber, Integer secondNumber, Integer thirdNumber) {
		Integer maximumNumber;

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
