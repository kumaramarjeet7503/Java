package MyProject;

public class Sorting {

	public static void main(String[] args) {
		int num[] = new int[] {12,21,10,12,15,3};
		
		int sortedArray[] = new int[num.length] ;
//		sortedArray = bubbleSort(num);
//		sortedArray = selectionSort(num);
		sortedArray = insertionSort(num);

		printArray(sortedArray);
	}
	
	public static void printArray(int[] array)
	{
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}
	
	public static int[] bubbleSort(int[] array) 
	{
			for (int i = 0; i < array.length-1; i++) {
			for (int j = i+1; j < array.length; j++) {
				if(array[i] > array[j]) {
					swap(array,i,j);				}
			}
		}
		
		return array;
	}
	
	public static int[] selectionSort(int[] array) 
	{
		for (int i = 0; i < array.length; i++) {
			int min = i;
			for (int j = i+1 ; j < array.length; j++) {
				if(array[j] < array[i] ) {
					min = j;
				}
				swap(array,i,min);
			}
		}
		return array;
	}
	
	public static int[] insertionSort(int[] array) 
	{
		for (int i = 0; i < array.length; i++) {
			int current = array[i];
			int j = i-1 ;
			while(j >= 0 && current < array[j]  ) 
			{
				array[j+1] = array[j];
				j-- ;
			}
			array[j+1] = current ;
		}
		return array;
	}
	
	public static int[] swap(int[] array , int a , int b) {
		int swap = array[b];
		array[b] = array[a];
		array[a] = swap ;
		return array ;
	}

}
