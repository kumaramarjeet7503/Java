package MyProject;

public class Recursion1 {

	public static void main(String[] args) {
		
		printNumber(5);
		naturalNumberSum(1,0,5) ;
		getFactorial(1,1,5);
		printFabonacci(0,1,7);
		int powerVal = calcPower(5,2);
		System.out.println(powerVal);
	}
	
	private static void printNumber(int num) {
		if(num == 0)
			{
				return ;
			}
		
		System.out.println(num);
		printNumber(num-1);
	}
	
	private static void naturalNumberSum(int num, int sum, int n) 
	{
		if(num == n)
		{
			sum = sum + num;
			System.out.println(sum);
			return;
		}
		sum = sum + num;
		naturalNumberSum(num +1, sum , n);
		
	}
	
	private static void getFactorial(int i , int factorial, int number) 
	{
		if(i == number) {
			factorial = factorial * i ;
			System.out.println(factorial);
			return ;
		}
		factorial = factorial * i ;
		getFactorial(i+1,factorial,number);
	}
	
	private static void printFabonacci(int a , int b,int n) 
	{
		if(n == 0) 
		{
			return ;
		}
		
		int c = a + b ; 
		System.out.println(c);
		printFabonacci(b,c,n-1);
	}
	
	private static int calcPower(int x, int n) 
	{
		if(x == 0 )
			return 0 ;
		if(n == 0)
			return 1 ;
		
		int xPower = calcPower(x,n-1);
		 xPower = x * xPower ;
		return xPower ;
	}

}
