package MyProject;

import java.util.* ;

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
		int [][] indices = {{2,1,5},{3,4,6},{6,7,7}} ;
//		 print2DArray(oddCells(2,3,indices));
		  System.out.println(diagonalSum(indices));  
	}
	
	 public static int diagonalSum(int[][] mat) {
		 	
		 int sum =0;
		 
		 if(mat.length % 2== 0) 
		 {
			 
		 }else 
		 {
			 int center = (mat.length % 2) +1;
			 for(int row = 0 ; row < mat.length; row++) 
			 {
				 int i = row ;
				 int j = center;
				 while(i < j) 
				 {
					 sum += mat[j-1][j-1] ;
					 j-- ;
				 }
				 
				 j = mat.length ;
				 i = center ;
				 while(i)
			 }
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
}
