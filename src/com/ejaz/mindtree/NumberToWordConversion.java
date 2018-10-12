package com.ejaz.mindtree;

import java.io.IOException;
import java.util.Scanner;

/**
 * @author EjazAhmad
 *
 */
public class NumberToWordConversion {

	/**
	 * @param args
	 * @throws IOException
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number");
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext())
		{
		int number = sc.nextInt();
		if(number==0)
		{
			System.out.println("Program Exited");
			System.exit(0);
		}
		else
		{
		System.out.println(conversion(number));
		System.out.println("Enter the number");
		}
		}
		
	}
	
	public static String conversion(int number)
	{
		String str="";
		int arr[] = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19 };
		String SingleDigits[] = { " ", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten",
				"eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "ninteen" };
		String DoubleDigits[] = { "", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninty" };
		if (number > 999) {
			str="invalid number";
		}
		else if (number < 20 && number>0) {
			for (int i = 0; i < arr.length; i++) {
				if (number == arr[i]) {
					str=SingleDigits[i];
				}
			}
		} else if (number >= 20 && number < 100) {
			int dividend = number / 10;
			int remained = number % 10;
			str = DoubleDigits[getArrayIndex(arr, dividend)] + " " + SingleDigits[getArrayIndex(arr, remained)];
		} else {
			int dividend1 = number / 100;
			int remained1 = (number % 100);
			if(remained1>19)
			{
			int dividend2 = remained1 / 10;
			int remained2 = remained1 % 10;
			str = SingleDigits[getArrayIndex(arr, dividend1)] + " hundred "
					+ DoubleDigits[getArrayIndex(arr, dividend2)] + " " + SingleDigits[getArrayIndex(arr, remained2)];

			}
			else
			{
				str = SingleDigits[getArrayIndex(arr, dividend1)] + " hundred "+""+SingleDigits[getArrayIndex(arr, remained1)];
	
			}
			}
		return str;

	}

	public static int getArrayIndex(int[] arr, int value) {

		int k = 0;
		for (int i = 0; i < arr.length; i++) {

			if (arr[i] == value) {
				k = i;
				break;
			}
		}
		return k;
	}

}
