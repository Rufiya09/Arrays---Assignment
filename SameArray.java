//write a program to declare an with  8 array elements and copy the 8 elements into another array and display the same 

import java.util.Arrays;
public class SameArray
{
	public static void main(String args[])
	{
		int[] array1 = new int []{10,20,30,40,50};
		int [] array2 = new int [array1.length];
		
		 //Copying all elements of one array into another
		for (int i = 0; i < array1.length; i++) {     
            array2[i] = array1[i]; 
		}
		
		//Displaying elements of array arr1  
		System.out.println("Elements of original array: ");    
        for (int i = 0; i < array1.length; i++) {     
           System.out.print(array1[i] + " ");  
		}
		System.out.println(); 
		
		 //Displaying elements of array arr2 
		System.out.println("Elements of new array: ");    
        for (int i = 0; i < array2.length; i++) {     
           System.out.print(array2[i] + " ");    
        }     
    }    
}    
