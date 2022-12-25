package MyProject;

import java.util.Iterator;
import java.util.Scanner;

public class MyClass {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
			
//		int tableNumber = sc.nextInt();
//		for(int i = 1; i < 10; i++ ) {
//			System.out.println(tableNumber+" *"+ " "+i + " =" + tableNumber*i );
//		}
		
//		System.out.println("Solid Rectangle");
//		for(int i = 0 ; i< 4 ; i++) {
//			for (int j = 0; j < 5 ; j++) {
//				System.out.print("*");
//			}
//			System.out.println("");
//		}
		
//		System.out.println("Hollow Rectangle");
//		for(int i = 0 ; i< 4 ; i++) {
//			System.out.print("*");
//			for (int j = 0; j < 4 ; j++) {	
//				if(i == 0 || i == 3) {
//					System.out.print("*");
//				}else
//				{
//					System.out.print(" ");
//				}
//			}
//			System.out.print("*");
//			System.out.print("\n");
//		}
		
//		System.out.println("Half Pyramid");
//		int rows = 5 ;
//		int cols = 6 ;
//		for (int i = 0; i < rows; i++) {
//			for (int j = 0; j < rows; j++) {					
//					if(j >= rows-i) {
//						System.out.print("*");
//					}
//					else 
//					{
//						System.out.print(" ");
//					}
//			}
//			 System.out.println("");
//		}
		
		System.out.println("number pyramid");
		
		int rows = 5 ;
		int sum = 0 ;
		int bit = 0;
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < i; j++) {
		 
				switch(bit) {
					case 1 :
						bit = 0 ;
						break ;
					case 0 : 
						bit = 1 ;
						break ;
					default :
						bit =  ;
						break ;
				}
				System.out.print(bit);
				if(pattern == 1)
					bit = 0 ;
			}
			 System.out.println("");
		}
		
	}
	
	
}
