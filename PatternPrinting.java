package MyProject;

public class PatternPrinting {

	public static void main(String[] args) {
//		pattern1();
//		pattern2();
//		 pattern3();
//		 pattern4();
//		pattern5();
//		pattern6() ;
//		 pattern8() ;
		pattern9() ;

	}
	
	public static void pattern9() 
	{
//		*********
//	     *******
//	      *****
//	       ***
//	        *
		int   m = 5;
		int n =5 ;
		for(int row = 0; row < m ; row++) 
		{
			for(int col = n ; col > 0 ; col--) 
			{
				if( col > row  ) 
				{
					System.out.print('*');
				}else 
				{
					System.out.print(" ");
				}
				

			}
			System.out.println("");
		}
	}
	
	public static void pattern8() 
	{
//		    *
//	       ***
//	      *****
//	     *******
//	    *********
		int   m = 5;
		int n =10 ;
		for(int row = 0; row < m ; row++) 
		{
			for(int col = 0 ; col < n ; col++) 
			{
				if( col > n/2 + row  || col < n/2 - row ) 
				{
					System.out.print(' ');
				}else 
				{
					System.out.print("*");
				}
				

			}
			System.out.println("");
		}
	}
	
	public static void pattern7() 
	{
//		 *****
//	      ****
//	       ***
//	        **
//	         *
		int   m = 5;
		int n =5 ;
		for(int row = 0; row < m ; row++) 
		{
			for(int col = 0 ; col < n ; col++) 
			{
				if( col >= row  ) 
				{
					System.out.print(' ');
				}else 
				{
					System.out.print("*");
				}
				

			}
			System.out.println("");
		}
	}
	
	public static void pattern6() 
	{
//	         *
//	        **
//	       ***
//	      ****
//	     *****
		int   m = 5;
		int n =5 ;
		for(int row = 0; row < m ; row++) 
		{
			for(int col = n ; col >= 0 ; col--) 
			{
				if( row >= col  ) 
				{
					System.out.print('*');
				}else 
				{
					System.out.print(" ");
				}
				

			}
			System.out.println("");
		}
	}
	

	
	public static void pattern5() 
	{
//		*
//	    **
//	    ***
//	    ****
//	    *****
//	    ****
//	    ***
//	    **
//	    *
		int   m = 10;
		int n =5 ;
		for(int row = 0; row < m ; row++) 
		{
			if( row < n) {
			for(int col =0 ; col < row ; col++) 
			{
				
				System.out.print('*');

			}
			}else 
			{
				for(int col = m ; col > row ; col--) 
				{
					
					System.out.print('*');

				}
			}
			System.out.println("");
		}
	}	
	
	
	public static void pattern4() 
	{
//		1
//	    1 2
//	    1 2 3
//	    1 2 3 4
//	    1 2 3 4 5
		int   m = 5;
		int n =5 ;
		for(int row = 0; row < m ; row++) 
		{
			for(int col =0 ; col < row ; col++) 
			{
				
				System.out.print(col+1);

			}
			System.out.println("");
		}
	}	
	
	public static void pattern3() 
	{
//		*****
//	    ****
//	    ***
//	    **
//	    *	
		int   m = 5;
		int n =5 ;
		for(int row = 0; row < m ; row++) 
		{
			for(int col = n ; col > row ; col--) 
			{
				
				System.out.print('*');

			}
			System.out.println("");
		}
	}
	
	public static void pattern2() 
	{
//		*
//	    **
//	    ***
//	    ****
//	    *****
			int   m = 5;
			int n =5 ;
			for(int row = 0; row < m ; row++) 
			{
				for(int col =0 ; col < row ; col++) 
				{
					
					System.out.print('*');

				}
				System.out.println("");
			}
	}	
	

	public static void pattern1() 
	{
//		  	*****
//		    *****
//		    *****
//		    *****
//		    *****
		int m = 5 ;
		int n = 5 ;
		for(int row = 0; row < m ; row++) 
		{
			for(int col =0 ; col < n ; col++) 
			{
				System.out.print('*');
			}
			System.out.println("");
		}
	}
	

}
