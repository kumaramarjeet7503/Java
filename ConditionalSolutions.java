package MyProject;

import java.util.Scanner ;

public class ConditionalSolutions {

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in) ;
//		int a = in.nextInt() ;
//		int b= in.nextInt();
//		int c = in.nextInt() ;
		
//		maximum(a,b,c);
//		minimum(a,b,c);
		
//		displayGrades(80);
//		isPalindrome(121);
		printPrimeNumber(1, 200) ;
		
	}
	
	public static void maximum(int a, int b, int c) 
	{
		int max = a ;
		max = max > b ? max : b ;
		max = max > c ? max : c ;
		
		System.out.println("Maximum number is : "+max);
	}
	
	public static void minimum(int a, int b, int c) 
	{
		int min = a ;
		min = min < b ? min : b ;
		min = min < c ? min : c ;
		
		System.out.println("Minimum number is : "+min);
	} 
	
	public static void displayGrades(int marks) 
	{
		int percentage = marks/10 ;
		switch(percentage) 
		{
		case 10 :
		case 9 :
			System.out.println("A+");
			break ;
		case 8 : 
			System.out.println("A");
			break ;
		case 7 : 
			System.out.println("B+");
			break ;
		case 6 : 
			System.out.println("B");
			break ;
		case 5 : 
			System.out.println("C");
			break ;
		case 4 : 
			System.out.println("D");
		default : 
			System.out.println("F");
			break ;
		}
		
			
	}

	public static void isPalindrome(int num) 
	{
		int palindrome = 0 ;
		int n = num ;
		while(n > 0 ) 
		{
			int r = n % 10 ;
			palindrome = palindrome*10 + r ;
			n = n/10 ;
		}
		
		 if(num == palindrome) 
			 System.out.println("It is an palindrome number");
		 else {
			 System.out.println("It is not an palindrome number");
		 }
			
	}

	public static void printPrimeNumber(int num1, int num2) 
	{	
	
		while(num1 < num2) {
			if(num1 > 1) {
				int  i = 2 ;
				int count = 0;
				while( i < num1 ) 
				{
					if( num1 % i  == 0) 
					{
						count++ ;
					}
					i++ ;
				}
				if(count  == 0) 
				{
					System.out.println(i);
				}
			}num1++ ;
		}
		
	} 
}
