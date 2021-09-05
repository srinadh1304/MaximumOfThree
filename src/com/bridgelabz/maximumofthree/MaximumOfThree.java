package com.bridgelabz.maximumofthree;
public class MaximumOfThree<T extends Comparable<T>> {

	T toCompare1, toCompare2, toCompare3;
	
	public MaximumOfThree(T tocompare1, T tocompare2, T tocompare3) {
		this.toCompare1 = tocompare1;
		this.toCompare2 = tocompare2;
		this.toCompare3 = tocompare3;
	}

	public void testMaximum() {
		MaximumOfThree.findMaximum(this.toCompare1, this.toCompare2, this.toCompare3);
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
	
	
	
	public static void main(String[] args) {

		System.out.println("****** Welcome To Computing Maximum Of Three Program ******");

		Integer firstNumber = 35, secondNumber = 20, thirdNumber = 125;
		Float number1 = 1.2f, number2 = 8.12f, number3 = 17.44f;
		String firstString = "Peach", secondString = "Banana", thirdString = "Apple";
		
		new MaximumOfThree<Integer>(firstNumber, secondNumber, thirdNumber).testMaximum();
		new MaximumOfThree<Float>(number1, number2, number3).testMaximum();
		new MaximumOfThree<String>(firstString, secondString, thirdString).testMaximum();
		
	}


}