package MyProject;

public class FunctionClass {
	public static void main(String args[]) {
		int sum = calculateSum(10,15);
		int factorial  = getFactorial(5);
		System.out.println(factorial);
		
	}
	
	public static int calculateSum(int a , int b) {
		int sum = a + b ;
		return sum ;
	}
	
	public static int getFactorial(int n) {
		int factorial = 1 ;
		for(int i = n ; i > 0 ; i--) {
			factorial = factorial * i ;
		}
		
		return factorial ;
	}
}
