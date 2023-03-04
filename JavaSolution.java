package MyProject;

import java.util.*;


public class JavaSolution {

	public static void main(String[] args) {
		
//		Scanner in = new Scanner(System.in);		
//		String name = in.next();
		
//		isPalindrome(name);
//		findAmstrongNumber(153,1000);
//		printFactors(10);
//		 int lcm = calculateLCM(20,30);
//		int nums[] = {2,2,4};
//		int output[] =  twoSum(nums, 4);
//		System.out.println(output);
//		System.out.println(lcm);
		
		int hcf = calculateHCF(10,5) ;
		System.out.println(hcf);
		
		
	}
	
	public static void isPalindrome(String name) 
	{
		int i = 0;
		int length = name.length();
		int count = 0;
		while (i != length/2) 
		{
			if(length %2 != 0) 
				break ;
			System.out.println(name.charAt(i));
			System.out.println(name.charAt(length-i-1));
			if(name.charAt(i) == name.charAt(length-i-1)) 
			{
				count++;
			}
			i++;
		}
		
		if(length/2 == count) 
		{
			System.out.print("This is a palindrome number");
		}else{
			System.out.print("This is not a  palindrome number");
		}
	}
	
	public static void findAmstrongNumber(int firstNumber, int lastNumber) 
	{
		while(firstNumber != lastNumber) 
		{
			String firstNumberLength =String.valueOf(firstNumber);
			int power = firstNumberLength.length() ;
			long armstrongNumber = 0 ;
			int n = firstNumber ;
			while(n > 0) 
			{
				int r = n % 10 ;
				armstrongNumber += multiplyPower(r,power) ;
				n = n/10;
			}
			
			if(armstrongNumber == firstNumber) 
			{
				System.out.println(firstNumber);
			}
			firstNumber++ ;
		}
	}
	
	public static long multiplyPower(int num,int power) 
	{
		int multiply = 1 ;
		while(power > 0){
			multiply = multiply * num ;
			power-- ;
		}
		
		return multiply ;
	}

    public int subtractProductAndSum(int n) {
        int sum = 0;
        int product = 1 ;
        while(n > 0)
        {
            int r = n %10 ;
            sum += r ;
            product = product * r ;
            n = n /10;
        }

        int diff = product - sum ;
        return diff ;
    }
    
    public static void printFactors(int n) 
    {
    	int i = 1 ;
    	while(i <= n  ) 
    	{
    		if(n % i == 0)
    			System.out.println("The factor is :"+i);
    		i++;
    	}
    }

    public static int calculateLCM(int firstNumber, int secondNumber) 
    {
    	int i = 2 ;
    	int max = firstNumber > secondNumber ? firstNumber : secondNumber ;
    	while(true) 
    	{
    		if(firstNumber % max == 0  && secondNumber % max == 0  ) 
    		{  
    			break;	
    		}
    		i++ ;
    	}
    	
    	return i;
    }
    
    public static int calculateHCF(int num1, int num2) 
    {
    	int i = 2;
    	int min  = num1 > num2 ? num2 : num1 ;
    	int hcf = 1;
    	while(i <= min) 
    	{
    		if(num1 % i == 0 && num2 % i == 0) 
    		{
    			hcf = hcf * i ;
    			num1 = num1/i ;
    			num2 = num2/i ;
    			min  = num1 > num2 ? num2 : num1 ;
    			i = 2;
    		}else 
    		{
    			i++ ;
    		}
    		
    	}
    	
    	return hcf ;
    }
    
//    public static int[]  twoSum(int[] nums, int target) {
//        int i = 0;
//        int output[] = null; 
//        for(i=0; i<nums.length-1; i++)
//        {
//            for(int j=i+1; j<nums.length; j++)
//            {
//                if(nums[i] + nums[j] == target )
//                {
//                    output = {i,j};
//                    return output ;
//                }
//            }
//        }
//    }
}
