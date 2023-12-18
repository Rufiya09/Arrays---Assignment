//write a program to arrange an array of elements in ascending order using selection sort algorithm

import java.util.Arrays;
public class AscendingOrder
{
	public static void main(String args[])
	{
		int[] numbers = {14,90,85,66,105,87};
		Arrays.sort(numbers);

		System.out.println("ascending order:" + numbers);
		for(int number : numbers){
			System.out.println(number + " ");
		}
	}
 }