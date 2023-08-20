package MyProject;
import java.util.Arrays ;

public class Sorting {

	public static void main(String[] args) {
		int num[] = {5,3,2,1,4};
		
		// int sortedArray[] = new int[num.length] ;
//		sortedArray = bubbleSort(num);
//		sortedArray = selectionSort(num);
		// sortedArray = insertionSort(num);
		// sortedArray = cycleSort(num) ;
		// insertionSort(num) ;
		quickSort(num, 0, num.length-1);

		printArray(num);
	}
	
	public static void quickSort(int[] arr , int low , int high)
	{
		if(low >= high) return ;

		int start = low ;
		int end = high ;
		int pivot = low + (high - low)/2 ;
		while(start <= end)
		{
			while(arr[start] < arr[pivot]) start++ ;
			while(arr[end] > arr[pivot]) end-- ;
			if(start <= end) {
				int temp = arr[start] ;
				arr[start] = arr[end] ;
				arr[end] = temp ;
				start++;
				end-- ;
			}
		}
		quickSort(arr, start, high);
		quickSort(arr, low, end); 
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
				if(array[j] < array[min] ) {
					min = j;
				}
			}
			swap(array,i,min);
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

	public static int[] cycleSort(int[] arr)
	{
		int i = 0 ;
		while(i < arr.length)
		{
			int correct = arr[i] - 1 ;
			if( arr[i] != arr[correct] )
			{
				swap(arr,i,correct) ;
			}else
			{
				i++;
			}
		}
		return arr ;
	}
	
	public static int[] swap(int[] array , int a , int b) {
		int swap = array[b];
		array[b] = array[a];
		array[a] = swap ;
		return array ;
	}

	public static void mergeSort(int[] array)
	{
		divide(array,0,array.length - 1);
	}

	public static void divide(int[] arr, int left, int right)
	{
		if(left >= right)
		{
			return ;
		}

		int mid = left + (right - left)/2 ;
		divide(arr, left,mid);
		divide(arr,mid+1,right) ;
		conquer(arr,mid,left,right) ;
	}

	public static void conquer(int[] arr, int mid , int left, int right)
	{
		int[] merged = new int[right - left + 1] ;
		int index1 = left ;
		int index2 = mid + 1 ;
		int x = 0 ;

		while(index1 <= mid && index2 <= right)
		{
			if(arr[index1] > arr[index2])
			{
				merged[x] = arr[index2] ;
				x++;
				index2++;
			}else
			{
				merged[x] = arr[index1] ;
				index1++;
				x++ ;	
			}
		}

		while(index1 <= mid )
		{
				merged[x] = arr[index2] ;
				x++;
				index1++;
		}

		while(index2 <= right )
		{
				merged[x] = arr[index2] ;
				x++;
				index2++;
		}

		for(int i = 0, j = left; i < merged.length ; i++, j++)
		{
			arr[j] = merged[i] ;
		}
	}



}
