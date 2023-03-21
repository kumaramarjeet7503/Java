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
//		pattern10() ;
//		pattern11() ;
//		pattern12() ;
//		pattern13();
//		pascalTriangle();
//		pattern14() ;
//		pattern15() ;
		patter16() ;
	}
	
	public static void patter16() 
	{

//         4 4 4 4 4 4 4  
//         4 3 3 3 3 3 4   
//         4 3 2 2 2 3 4   
//         4 3 2 1 2 3 4   
//         4 3 2 2 2 3 4   
//         4 3 3 3 3 3 4   
//         4 4 4 4 4 4 4  
		
		int n = 7 ;
		int length =  n * n ;
		int element = 0; 
		int num = 4 ;
		while(true) 
		{
		  int	minr = 0 ;
		  int	minc = 0 ;
		  int	maxr = n ;
		  int	maxc = n ;
		  
		  if(length == element) {
			  break ;
		  }
			
		  for(int i = minr ; i < maxr && length > element ; i++ ) 
		  {
			  System.out.println(num);
			  element++;
		  }
		  minc++ ;
		  
		  for(int i = minc; i < maxc && length > element ; i++) 
		  {
			  System.out.print(num);
			  element++;
		  }
		  maxr--;
		  for(int i = maxr; i > minr && length > element ; i--) 
		  {
			  System.out.println(num);
			  element++;
		  }
		  maxc--;
		  for(int i =maxc ; i > minc && length > element ; i-- ) 
		  {
			  System.out.print(num);
			  element++;
		  }
		  num--;
		}
	}
	
	public static void pattern15() 
	{
//		    *      *
//        *   *  *   *
//      *      *      *
		int n =3 ;
		for(int i =0 ; i < n ; i++) 
		{
			for(int j = 0 ; j <= 3* n ; j++) {
				if( j == n - i || j == 2 * n -i || j == n + i || j == 2 * n +i ) 
				{
					System.out.print("* ");
				}else 
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	
	public static void pattern14() 
	{

//       1
//       2  3
//       4  5  6
//       7  8  9  10
//       11 12 13 14 15
		int i =1 ;
		int n = 6;
		for(int row = 0 ; row < n ; row++) 
		{
			for(int col = 0 ; col < row ; col++) 
			{
				System.out.print(i + " ");
				i++;
			}
			System.out.println();
		}
	}
	
	public static void pascalTriangle() 
	{
//		    1
//        1   1
//      1   2   1
//    1   3   3   1
//  1   4   6   4   1
		
		int n = 5 ;
		
		for(int i = 0 ; i < n; i++ ) 
		{
			// For printing spaces
//			for(int j = 0 ; j < n-i ; j++) 
//			{
//				System.out.print(" ");
//			}
//			
			// For printing traingle values
			int  values = 1 ;
			for(int k = 0 ; k < n; k++) 
			{
				System.out.print(values);
				values = values * (i - k )/ (k + 1) ;
				
			}
			System.out.println();
		}
		
		
	}
	
	public static void pattern13() 
	{
//	       *
//        * *
//       *   *
//      *     *
//     *       *
//      *     *
//       *   *
//        * *
//         *
		int n = 5 ;
		for(int row = 0 ; row < 2 * n ; row++ ) 
		{
			for(int col = 1 ; col < 2 * n ; col++) 
			{
				if(row < n ) {
					if(col == n - row  || col == n+ row  ) 
					{
						System.out.print('*');
					}else 
					{
						System.out.print(" ");
					}
				}
				else 
				{
					if(col ==  row - n   || col == 2 * n - row  ) 
					{
						System.out.print('*');
					}else 
					{
						System.out.print(" ");
					}
				}
				
			}
			System.out.println();
		}
		
	}
	
	public static void pattern12() 
	{
//		   *
//        * *
//       *   *
//      *     *
//     *********
		
		int n = 5 ;
		for(int row = 0 ; row < n ; row++ ) 
		{
			for(int col = 1 ; col < 2 * n ; col++) 
			{
				if(col == n - row  || row == n -1 || col == n+ row  ) 
				{
					System.out.print('*');
				}else 
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	
	public static void pattern11() 
	{
//		 * * * * *
//	      * * * *
//	       * * *
//	        * *
//	         *
		int   m = 5;
		int n =10 ;
		int i = 0;
		for(int row = 0; row < m ; row++) 
		{
			
			for(int col = 0 ; col < n/2 ; col++) 
			{
				if( col < row  ) 
				{
					System.out.print(' ');
				}else 
				{
					if(row % 2 == 0) {
					if(col  % 2  == 0  ) 
					{
						System.out.print("*");
						}
					else {
						System.out.print(" ");
						}
					}else {
					if(col  % 2  != 0  ) 
					{
						System.out.print("*");
						}
					else {
						System.out.print(" ");
						}
					}
					
				}
			}
			for(int col = n/2 ;  col < n -i  ; col++  ) 
			{
					if(row % 2 == 0) {
						if(col  % 2  == 0  ) 
						{
							System.out.print("*");
							}
						else {
							System.out.print(" ");
							}
						}else {
						if(col  % 2  != 0  ) 
						{
							System.out.print("*");
							}
						else {
							System.out.print(" ");
							}
						}
				
			}
			System.out.println("");
			i++ ;
		}
	}
	
 	public static void pattern10() 
	{
//		   *
//	   	  * *
//  	 * * *
	//  * * * *
	// * * * * *
		int   m = 5;
		int n =10 ;
		for(int row = 0; row < m ; row++) 
		{
			for(int col = 0 ; col < n ; col++) 
			{
				if( col > n/2 + row  || col < n/2 - row  ) 
				{
					System.out.print(' ');
				}else 
				{
					
					System.out.print(" * ");
				
				}
				

			}
			System.out.println("");
		}
	}

	
	public static void pattern9() 
	{
//		*********
//	     *******
//	      *****
//	       ***
//	        *
		int   m = 5;
		int n =10 ;
		int i = 0;
		for(int row = 0; row < m ; row++) 
		{
			
			for(int col = 0 ; col < n/2 ; col++) 
			{
				if( col < row  ) 
				{
					System.out.print(' ');
				}else 
				{
					System.out.print("*");
				}
			}
			
			
			for(int col = n/2+1 ;  col < n -i  ; col++  ) 
			{
				
					System.out.print('*');
					
				
			}
			System.out.println("");
			i++ ;
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
				if( col <= row  ) 
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
