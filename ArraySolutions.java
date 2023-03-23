package MyProject;

import java.util.* ;
import java.math.*;

public class ArraySolutions {

	public static void main(String[] args) {
		
//		int [] arr = new int[5]; 
//		int [] arr = {0,2,1,5,3,4} ;
//		int [] buildArray = buildArray(arr);
//		System.out.println(Arrays.toString(buildArray));
//		
//		getConcatenation(arr) ;
//		runningSum(arr) ;
//		int [][] arr2D = new int[4][] ;
		
//		int [][] arr2D = {{1,2,3,4,5},{2,23,4,3,2,3}} ;
//		printArray(arr);
//		print2DArray(arr2D) ;
//		maximumWealth(arr2D) ;
//		shuffle(arr,3);
		
//		int[] arr = {2,3,5,1,3};
//		System.out.println(kidsWithCandies(arr,3));
//		numIdenticalPairs(arr);
//		smallerNumbersThanCurrent(arr) ;
		
//		int[] nums = {1,2,3,4,0};
//		int[] index = {0,1,2,3,0};
//		System.out.println(Arrays.toString(createTargetArray(nums,index))); 
		
//	    System.out.println(checkIfPangram("thequickbrownfoxjumpsoverthelazydog"));
//		int [][] image = {{1,1,0},{1,0,1},{0,0,0}} ;
//		System.out.println(flipAndInvertImage(image)); 
//
		int [][] indices = {{2,1,5},
							{3,4,6},
							{6,7,7}} ;
//		 print2DArray(oddCells(2,3,indices));
//		  System.out.println(diagonalSum(indices));  
//		diagonalSum(indices) ;
//		
//		int [][] array = new int[indices.length][];
//		System.out.println(array[0][]);
//		int[] num = {1,2,0,0} ;
//		System.out.println(addToArrayForm(num,34));
//		
//	    int mat[][] =	{{0,0},
//	    				 {0,1}};
//	    int[][] target = {{0,0},
//	    				  {1,0}} ;
		
		int[][] points =   {{-19,9},
				{-15,-19},
				{-5,-8}} ;
				
		System.out.println(findMaxValueOfEquation( points, 10)); 
		

	}
	
    public static int findMaxValueOfEquation(int[][] points, int k) {
        int max = 0 ; 
        for(int row = 0 ; row < points.length; row++ )
        {
            if(row+1 < points.length ){
                int sumOfX = Math.abs(points[row][0] - points[row+1][0] ) ;
                int sumOfY = points[row][1] + points[row+1][1] ;
                if(sumOfX <= k && max < sumOfX + sumOfY )
                {
                    max = sumOfX + sumOfY ;
                }  
            }         
        }
        return max ;
    }
	
    public int[] searchRange(int[] nums, int target) {
        
        int length = 0;
        for(int i = 0 ; i < nums.length; i++)
        {
            if(nums[i] == target )
            {
                length++ ;
            }
        }
        if(length == 0 )
        {
            int[] sol = {-1,-1};
            return sol ;
        }

        if(length == 1 )
        {
            int[] sol = new int[length+1] ;
            int j = 0 ;
        for(int i = 0 ; i < nums.length ; i++)
        {
            if(nums[i] == target )
            {
                sol[j] = i ;
                sol[j+1] = i ;
            }
        }
        return sol ;
        }

        int[] sol = new int[2] ;

        int j = 0;
        for(int i = 0 ; i < nums.length ; i++)
        {
            if(nums[i] == target && j == 0 )
            {
                sol[j] = i ;
                j++ ;
            }else if( (nums[i] == target && i == nums.length-1 ) || (nums[i] == target && i+1 < nums.length  && nums[i+1] != target) )
            {
                sol[j] = i ;
            }
        }

        return sol ;
    }
	
    public void sortColors(int[] nums) {
        for(int i = 0 ; i < nums.length; i++)
        {
            for(int j = i + 1 ; j < nums.length; j++)
            {
                if(nums[i] > nums[j] ){
                    int temp = nums[i] ;
                    nums[i] = nums[j] ;
                    nums[j] = temp ;
                }
            }
        }
	
	   public int[] productExceptSelf(int[] nums) {
	        int[] sol = new int[nums.length] ;

	            int product = 1 ;
	            int isZero = 0 ;
	            for(int j = 0 ; j < nums.length; j++ )
	            {
	                if(nums[j] != 0 ){
	                    product = product * nums[j] ;
	                    }else
	                    {
	                        isZero++ ;
	                    }
	            }

	            for(int i = 0 ; i < nums.length ; i++)
	            {
	                if(nums[i] == 0 && isZero == 1 )
	                {
	                    sol[i] = product ;
	                }else if( isZero != 0 )
	                {
	                   sol[i] = 0 ;
	                }else
	                {
	                     sol[i] = product/nums[i] ;
	                }
	                
	            }

	        return sol ;
	    }
	
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> sol = new ArrayList<Integer>(matrix.length) ;
        int arrayElement = matrix.length * matrix[0].length ;
        int length = 0 ;
            int minr = 0 ;
            int minc = 0;
            int maxr = matrix.length ;
            int maxc = matrix[0].length ;
        while(true)
        {


            if(arrayElement <= length )
            {
                break ;
            }

            for(int i = minc ; i < maxc && arrayElement > length  ; i++  )
            {
                sol.add(matrix[minr][i]) ;
                length++ ;
            } 
            minr++ ;
            for(int i = minr ; i < maxr  && arrayElement > length  ; i++  )
            {
                sol.add(matrix[i][maxc-1]) ;
                 length++ ;
            }
            maxc-- ;
            for(int i = maxc -1 ; i >= minc  && arrayElement > length  ; i--  )
            {
                sol.add(matrix[maxr-1][i]) ;
                 length++ ;
            }
            maxr--;
            for(int i = maxr -1 ; i >= minr  && arrayElement > length  ; i-- )
            {
                sol.add(matrix[i][minc]) ;
                 length++ ;
            }
            minc++ ;
        }
        return  sol ;
    }


    public static List<Integer> addToArrayForm(int[] num, int k) {
   	 List<Integer> ans = new ArrayList<Integer>() ;
       BigInteger sum = new BigInteger("0");
       for(int i=0; i<num.length; i++)
       {
    	   sum = sum.multiply(new BigInteger("10"));
           sum = sum.add(BigInteger.valueOf(num[i]));
       }
       sum = sum.add(BigInteger.valueOf(k)) ;

       while(sum.compareTo(new BigInteger("0")) > 0 )
       {
           BigInteger r = sum.mod(new BigInteger("10"))   ;
           int n = r.intValue();
           sum = sum.divide(new BigInteger("10")) ;
           ans.add(0,n);
       }
       return ans;
   }
	
    public static boolean findRotation(int[][] mat, int[][] target) {
        int [][] operation = new int [mat.length][mat[0].length];
        int arrayElement = mat.length * mat[0].length ;
        boolean ans = false ;
        int length = 0;

    for(int row = 0; row < operation.length; row++)
    {
         int[] temp =  mat[row];
        for(int col = 0; col < operation[row].length; col++)
        {
            if( row <= mat.length ){
                    operation[row][col] = mat[mat.length-row-1][col];
                    operation[operation.length-row-1][col] = temp[col] ;
                }
            if(operation[row][col] == target[row][col])
            {
                length++ ;
            }
        }
    }

    if(length == arrayElement)
    {
        ans = true;
    }
    return ans ;

    }
	
    public int[][] transpose(int[][] matrix) {
        int[][] ans = new int[matrix[0].length][matrix.length] ;

        for(int row=0; row<ans.length; row++)
        {
            for(int col=0; col<ans[row].length; col++)
            {
                ans[row][col] = matrix[col][row] ;
            }
        }
        return ans;
    }

	public static int diagonalSum(int[][] mat) 
{
	int sum =0;
	for(int row = 0; row < mat.length;row++) 
	{
		sum += mat[row][row] ;
	}
	int n = mat.length-1 ;
	int k = 0 ;
	
	while(n >= 0  ) 
	{
        if(n != k)
        {
            sum += mat[n][k] ;
        }
        k++ ;
        n--;
	}
	
	return sum ;
}
	
	public static void printArray(int [] arr) 
	{
		for(int i = 0 ; i < arr.length ; i++) 
		{
			System.out.print(arr[i]);
		}
		System.out.println(Arrays.toString(arr)); 
	}
	
	public static void print2DArray(int [][] arr2D) 
	{
		for(int row = 0; row < arr2D.length ; row++ ) 
		{
			for(int cols = 0 ; cols < arr2D[row].length ; cols++ ) 
			{
				System.out.print(arr2D[row][cols]);
//				System.out.print(Arrays.toString(arr2D[row]));
			}
//			System.out.print(Arrays.toString(arr2D[row]));
			System.out.println();
		}
	}
	
    public static int[] buildArray(int[] nums) {
        int[] helpArray = new int[nums.length];
        for(int i =0 ; i<nums.length; i++)
        {
            helpArray[i] = nums[nums[i]];
        }
        return helpArray ;
    }
    
    public static int[] getConcatenation(int[] nums) {
    	
//    	Input: nums = [1,2,1]
//    			Output: [1,2,1,1,2,1]
//    			Explanation: The array ans is formed as follows:
//    			- ans = [nums[0],nums[1],nums[2],nums[0],nums[1],nums[2]]
//    			- ans = [1,2,1,1,2,1]
        int[] ans = new int[nums.length*2] ;
         int j = 0 ;
        for(int i = 0 ; i <ans.length ; i++)
        {   
            if(i < nums.length)
            {
                ans[i] = nums[i];
            }else
            {
                ans[i] = nums[j] ;
                j++ ;
            }
            
        }

        return ans ;
    }

    public static int[] runningSum(int[] nums) {
        for(int i = 1; i<nums.length; i++)
        {
        	nums[i] += nums[i-1] ;
//            int j = 0;
//            int sum = 0 ;
//            while(j <= i)
//            {
//                sum = sum + nums[j] ;
//                j++;
//            }
//            ans[i] = sum ;
        }
    return nums ;
    }

    public static int maximumWealth(int[][] accounts) {
        int maximumWealth = 0 ;
        for(int customer = 0 ; customer<accounts.length; customer++)
        {
            int sum = 0 ;
            for(int bank = 0 ; bank < accounts[customer].length; bank++)
            {
                    sum += accounts[customer][bank] ;
            }
            if(sum > maximumWealth)
            {
                maximumWealth = sum ;
            }
        }
        return maximumWealth ;
    }

    public static int[] shuffle(int[] nums, int n) {
        int[] ans = new int[nums.length];
         int k = 0 ;
        for(int i = 0; i<n; i++)
        {
            int j = n+i ;
                ans[k] = nums[i];
                ans[k+1] = nums[j];
                k = k+2;
        }
        return ans ;
    }
    
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = 0;
        List<Boolean> ans = new ArrayList<Boolean>() ; 
        for(int i = 0; i<candies.length; i++)
        {
//            candies[i] = candies[i] + extraCandies ;
            if(candies[i] > max)
            {
                max = candies[i];
            }
        }
        
        for(int j = 0; j<candies.length; j++)
        {
            if(candies[j]+ extraCandies >= max )
            {
                ans.add(true);
            }else
            {
                ans.add(false);
            }
        }
        return ans ;
    }

    public static int numIdenticalPairs(int[] nums) {
        int count = 0 ;
         for(int i =0; i<nums.length-1;i++)
         { 
             for(int j = i+1; j<nums.length;j++)
             {
                 if(nums[i] == nums[j])
                 {
                     count++ ;
                 }
             }
         }
         return count ;
     }

    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] ans = new int[nums.length] ;
       for(int i = 0; i<nums.length; i++)
       {
           int count = 0;
           for(int j = 0; j<nums.length; j++)
           { 
               if(i != j && nums[i] > nums[j] )
               {
                   count++ ;
               }
           }
           ans[i] = count ;
       }
       return ans ; 
    }

    public static int[] createTargetArray(int[] nums, int[] index) {
        int[] target = new int[nums.length];
        for(int j=0;j<nums.length;j++)
        {
            target[j] = -1 ;
        }

        for(int i = 0 ; i<nums.length; i++)
        {
            if(target[index[i]] != -1 ){
                int n = target.length-1 ;
                while(n >= index[i] && n > 0 ){
                    target[n] = target[n-1] ;
                    n-- ;
                }
            }
            target[index[i]] = nums[i];
        }
        return target ;
    }
    
    public static boolean checkIfPangram(String sentence) {
        
    	if(sentence.length() < 26 ) 
    	{
    		return false ;
    	}
    	
        for(char i = 'a' ; i<='z' ; i++ ) 
        {
        	if(sentence.indexOf(i) < 0 )
        		return false;
        }
        return true ;
        
    }
    
        public static int largestAltitude(int[] gain) {
            int largestAltitude = 0 ;
            for(int i =0; i<gain.length; i++)
            {
                int k = i ;
                int netGain = 0 ;
                while(k >= 0)
                {
                    netGain += gain[k] ;
                    k--;
                }
                if(largestAltitude < netGain )
                {
                    largestAltitude = netGain ;
                }
            }

        return largestAltitude ;
        }

        public static int[][] flipAndInvertImage(int[][] image) {
            for(int row = 0; row < image.length; row++)
           {
               for(int col = 0; col < image[row].length; col++ )
               {
                   if(col < image[row].length/2 )
                   {
                       int temp = image[row][col] ;
                       image[row][col] = image[row][image[row].length-col-1] ;
                       image[row][image[row].length-col-1] = temp ;
                   }
                   if(image[row][col] == 0)
                   {
                      image[row][col] = 1; 
                   }else
                   {
                       image[row][col] = 0 ;
                   }
               }
           }
       return image ;
   }

        public static int oddCells(int m, int n, int[][] indices) {
            int[][] matrix = new int[m][n] ;
           for(int i = 0; i < indices.length; i++)
           {
               for(int j = 0; j<indices[i].length; j++)
               { 
                   if(j == 0)
                   {
                    for(int col = 0; col < matrix[indices[i][j]].length; col++)
                       {
                          matrix[indices[i][j]][col] += 1 ;
                       }
                   }else
                   {
                    for(int col = 0; col < matrix.length; col++)
                       {
                          matrix[col][indices[i][j]] += 1 ;
                       }
                   }
             
               }
           }

            int odd = 0 ;
           for(int row = 0; row<matrix.length; row++)
           {
               for(int col=0; col< matrix[row].length; col++)
               {
                   if(matrix[row][col] % 2 != 0)
                   {
                       odd++ ;
                   }
               }
           }

           return odd ;

        }
        public int findNumbers(int[] nums) {
            int even =0;
            for(int i=0; i<nums.length;i++)
            {
                int count = 0 ;
                int number = nums[i] ;
                while(number > 0)
                {
                    number = number/10 ;
                    count++;
                }
                if(count %2 == 0)
                {
                    even++ ;
                }
            }
            return even ;
        }
}
