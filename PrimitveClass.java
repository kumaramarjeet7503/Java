package MyProject;

import java.util.Iterator;

public class PrimitveClass {
	
	public static void main(String args[]) {
		
		int marks[] = new int[3];
		
		marks[0] = 	10 ;
		marks[1] = 12;
		marks[2] = 21 ;
		
		displayArray(marks);
		searchArrayIndex(marks,12);
		getMinMax(marks);
		isSorted(marks);
	}
	
	public static void displayArray(int array[]) {
		for(int i = 0 ; i < array.length ; i++) {
			System.out.println(array[i]);
		}
	}
	
	public static void searchArrayIndex(int array[], int element) {
			for (int i = 0; i < array.length; i++) {
					if(array[i] == element) {
						System.out.println("Element exists at " + i);	return ;		
					}
			}
			System.out.println("Element does not exists");	
	}
	
	public static void getMinMax(int array[]) {
		int min = 0;
		int max = 0;
		for (int i = 0; i < array.length; i++) {
			min = array[i];
			max = array[i];
			for (int j = 0; j < array.length; j++) {
				 if(array[j] > max) {
					 max = array[j];
				 }else if(array[j] < min ) {
					 min = array[j];
				 } 
			}
		}
		
		System.out.println("min "+min);
		System.out.println("max "+max);
	}
	
	public static void isSorted(int array[]) {
		for (int i = 0; i < array.length; i++) {
			for (int j = i+1; j < array.length; j++) {
				if(array[i] > array[j]) {
					System.out.println("The array is not sorted");
					return ;
				}
			}
		}
		System.out.println("Array is sorted");
	}

}
