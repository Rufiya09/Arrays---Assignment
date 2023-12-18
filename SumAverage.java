// write a program to display the sum and average of elements in an array

import java.util.Arrays;
public class SumAverage
{
	public static void main(String args[])
	{
		int [] number1 = new int[] {5,10,15,20,25};
		
	    int sum = number1[0] + number1[1] + number1[2] + number1[3] + number1[4];
		
		int average = sum/2;
		
		System.out.println("the sum of an array is:" + sum);
		System.out.println("the average of an array is:" + average);
	}
}

	