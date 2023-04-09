package MyProject;

import java.util.HashMap;
import java.util.Arrays ;

public class SearchSolutions {

	public static void main(String[] args) {
//		mySqrt(2147395600) ;
		
//		 int[] arr =  {2,3,5,9,14,16,18} ;
//		 int target = 2 ;
//	          System.out.println(getCeliengOfNumber(arr, target));	
//	          System.out.println(getFlooringofNumber(arr,target) );
//		isPerfectSquare(808201) ;
//		char[] letters = {'c','f','j'} ;
//		nextGreatestLetter(letters, 'j') ;
//		int[][] grid  = {{4,3,2,-1},{3,2,1,-1},{1,1,-1,-2},{-1,-1,-2,-3}} ;
		int[] nums = {1,0,1,1,1} ;
//		int[] nums = {1,2,3,1} ;
		// System.out.println(search(nums,3));
        reachNumber(2) ;

	}

       public static int reachNumber(int target) {
        target = Math.abs(target) ;
        int sum = 0 ;
        int end =  target ;
        int step = 0 ;
        while(sum < end)
        {
             step++ ;
            sum += step ;
           
        }
        
        while( (sum - target) % 2 != 0 )
        {
             step++ ;
            sum += step ;
        }

        return step ;
    }
	
    public static int[] findRightInterval(int[][] intervals) {
        HashMap<Integer,Integer> hm = new HashMap<>() ;
        int[] first = new int[intervals.length] ;
        
        for(int i = 0 ; i < intervals.length; i++) 
        {
        	hm.put(intervals[i][0],i) ;
        	first[i] = intervals[i][0] ;
        }
        
        Arrays.sort(first);
        
        for(int i = 0 ; i < intervals.length ; i++) 
        {
        	int key = 
        }
        
    }
    
    public static boolean search(int[] nums, int target) {
    int pivot = findPivot(nums) ;
    int start = 0 ;  
    int end = nums.length - 1 ;
    if(pivot == -1 )
    {
        return binarySearch(nums, target, 0 , end ) ;
    } 
    if( nums[pivot] == target )
    {
        return true ;
    }
    if(nums[start] <= target )
    {
        return binarySearch(nums, target, start , pivot) ;
    }else
    {
        return binarySearch(nums, target, pivot + 1 , end) ;
    }
}

public static int findPivot(int[] nums)
{
    int start = 0 ;
    int end = nums.length - 1 ;
    while(start <= end)
    {
        int mid = start + (end - start ) / 2 ;
        if(nums[start] > nums[mid] )
        {
            end = mid;
        }
        else if( nums[start] == nums[mid] && nums[mid] == nums[end] )
        {
        	if(nums[start] > nums[start + 1] ) 
        	{
        		return start ;
        	}
        	start++ ;
        	if(nums[end] > nums[end - 1] ) 
        	{
        		return end ;
        	}
        	end-- ;
        }
        else if( (mid + 1) <= end &&  nums[mid + 1] > nums[mid])
        {
            start = mid + 1 ;
        }else if(  (mid + 1) <= end  &&  nums[mid + 1] < nums[mid] )
        {
            return mid ;
        }
    }
    return -1 ;
}

public static boolean binarySearch(int[] arr ,int target, int start, int end)
{
    while(start <= end)
    {
        int mid = start + (end - start) / 2 ;
        if(arr[mid] == target )
        {
            return true ;
        }
        if(arr[mid] > target )
        {
            end = mid - 1 ;
        }else
        {
            start = mid + 1 ;
        }
    }
    return false ;
}

//public static int search(int[] nums, int target) {
//return findPivot(nums) ;
//int pivot = findPivot(nums) ;
//int start = 0 ;  
//int end = nums.length - 1 ;
//if(pivot == -1 )
//{
//    return binarySearch(nums, target, 0 , end ) ;
//} 
//if( nums[pivot] == target )
//{
//    return pivot ;
//}
//if(nums[start] <= target )
//{
//    return binarySearch(nums, target, start , pivot) ;
//}else
//{
//    return binarySearch(nums, target, pivot + 1 , end) ;
//}
//}

//public static int findPivot(int[] nums)
//{
//int start = 0 ;
//int end = nums.length - 1 ;
//while(start < end)
//{
//    int mid = start + (end - start ) / 2 ;
//    if(nums[start] >= nums[mid] && mid != start )
//    {
//        end = mid ;
//    }
//     if( (mid + 1) <= end &&  nums[mid + 1] > nums[mid])
//    {
//        start = mid + 1 ;
//    }
//     
//    if(  (mid + 1) <= end  &&  nums[mid + 1] < nums[mid]   )
//    {
//    	return mid ;
//    	
////    	if(mid -1 >= start && nums[mid-1] < nums[mid])
////    		{return mid ;}
////    	else if( nums[start] == nums[mid] )
////         {
////    		start = start + 1 ;
////    	end= end -1 ;
////    	}
//    }
//}
//return -1 ;
//}

//    public static int binarySearch(int[] arr ,int target, int start, int end)
//    {
//        while(start <= end)
//        {
//            int mid = start + (end - start) / 2 ;
//            if(arr[mid] == target )
//            {
//                return mid ;
//            }
//            if(arr[mid] > target )
//            {
//                end = mid - 1 ;
//            }else
//            {
//                start = mid + 1 ;
//            }
//        }
//        return -1 ;
//    }
	
    public int singleNonDuplicate(int[] nums) {
        int start = 0 ;
        int end = nums.length -1 ;

        while( start <= end )
        {
            if(start == end)
            {
                return nums[start] ;
            }

            if(nums[start] != nums[start + 1] )
            {
                return nums[start] ;    
            }
            if(nums[end] != nums[end - 1]  )
            {
                return nums[end] ;
            }
            
            int mid = start + (end - start) / 2 ;
            if(nums[mid] == nums[mid + 1] )
            {
                mid = mid + 1;
            }else if(nums[mid] == nums[mid -1 ] )
            {
                mid = mid  ;
            }else
            {
                return nums[mid] ;
            }
            if(mid % 2 != 0 )
            {
                start = mid + 1 ;
            }else
            {
                end = mid ;
            }
        }
        return -1 ;
    }
	
    public int specialArray(int[] nums) {
        int  n = nums.length ;
        for(int i = 0  ; i < n ; i++)
        {
            int count = 0 ;
            for(int j = 0 ; j < nums.length ; j++)
            {
                if(nums[j] >= i + 1 )
                {
                    count++;
                }
            }
            if(count == i + 1 )
            {
                return count  ;
            }
        }
        return -1 ;
    }
	
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int distance = 0 ;
        for(int i = 0 ; i < arr1.length ; i++)
        {
            boolean flag = true ;
            for(int j = 0 ; j < arr2.length; j++)
            {
                if( Math.abs(arr1[i] - arr2[j]) <= d )
                {
                    flag = false ;
                    break ;
                }
            }
            if(flag)
            {
                distance++ ;
            }
        }

        return distance ;
    }
	
    public static int countNegatives(int[][] grid) {
        int negativeCount = 0 ; 


        for(int row = 0 ; row < grid.length; row++)
        {
            int left = 0 ;
            int right = grid[0].length ;
            while(left < right)
            {
                int mid = left + ( right - left )/ 2 ;
                if( grid[row][mid] < 0 )
                {
                    right = mid  ;
                }else
                {
                    left = mid + 1 ;
                }
            }

            negativeCount += ( grid[row].length - left ) ;
        }

        return negativeCount ; 
     }
	
    public static int peakIndexInMountainArray(int[] arr) {
        int left = 0 ;
        int right = arr.length -1 ;
        while( left < right )
        {
            int mid = left + (right - left) / 2 ;

             if(arr[mid] > arr[mid + 1] && arr[mid] > arr[mid -1] )
             {
                 return mid ;
             }

            if(arr[mid] < arr[mid + 1 ] )
            {
                left = mid + 1 ; 
            }else
            {
                right = mid ;
            }
        }
        return right ; 
     }
	
    public static int searchInsert(int[] nums, int target) {
        int left = 0; 
        int right = nums.length  ;
        while(left <= right && left < nums.length )
        {
            int mid = left + (right - left) /2 ;
            if(nums[mid] == target)
            {
                return mid ;
            }
            if(nums[mid] > target )
            {
                right = mid -1 ;
            }else
            {
                left = mid + 1 ;
            }
        }

        return left ;
    }
	
		public static int binarySearch(int[] arr, int k) 
		{
			int left =  0 ;
			int right = arr.length ;
			int index = -1 ;
			while(left <= right ) 
			{
				int mid = left + ( right - left ) / 2 ;
				if(arr[mid] == k ) 
				{
					
					 index =  mid ;
				}
				
				if(arr[mid] > k ) 
				{
					right = mid - 1 ;
				}else 
				{
					left = mid + 1 ; 
				}
			}
			return index ;
		}
	
	   public static int findKthPositive(int[] arr, int k) {
	       int start = 0 ;
	       int end = arr.length - 1 ;

	       if(arr[end] == end + 1 )
	       {
	           return arr[end] + k ; 
	       } 
	       while(start < end )
	       {
	           int mid = start + ( end - start ) / 2 ;
	           int missing = arr[mid] - ( mid + 1 ) ;
	           if( missing >= k  )
	           {
	               end = mid - 1 ;
	           }else
	           {
	               start = mid + 1 ;
	           }
	       }

	       return  (arr[start] + k) - (arr[start] - start ) ;
	    }
	
    public static int findKthPositiveN2(int[] arr, int k) {
        int a = 1 ;
        int b = 0 ;
        int c = 0 ;
        int[] helper = new int[k] ;
        int length = arr[arr.length-1] + k  ;
        while(a <= length ){
        
        if(b == k)
        {
            break ;
        }

        if(a >= arr[0] && c < arr.length )
        {
                if(a == arr[c])
                {
                    c++ ;
                }else
                {
                    helper[b] = a ; 
                    b++ ;
                }
            }else
            {
                helper[b] = a ;
                b++ ;
            }
                a++ ; 
        }
        return helper[k-1];
    }
	
    public static char nextGreatestLetter(char[] letters, char target) {
        int left = 0 ; 
        int right = letters.length -1 ;

        if(letters[right] <= target )
        {
            return letters[left] ;
        }

        while(left <= right )
        {
            int mid = left + ( right - left ) / 2 ;
            if(letters[mid] > target )
            {
                right = mid -1 ;
            }else
            {
                left = mid + 1 ;
            }
        }

        return letters[left]  ;
    }
	
    public int arrangeCoins(int n) {
        int start = 0 ; 
        int end = n ;
        while(start <= end)
        {
            int mid = start + (end - start) /2 ;
            long element =(long) mid * (mid+1) /2 ;
            if( n >= element )
            {
                  start = mid + 1 ;
                
            }else
            {
              end = mid - 1 ;
            }
        }
        return start - 1 ;

    }
	   public static boolean isPerfectSquare(int num) {
	        int start = 0 ;
	        int end = num  ; 
	        if(num == 1){ return true ; }

	        while(start < end )
	        {
	            int mid = start + (end -start) /2 ;
	            long assumed = (long) mid * mid ;
	            if( assumed == num )
	            {
	                return true ;
	            }
	            if(assumed > num)
	            {
	                end = mid   ;
	            }else 
	            {
	                start = mid + 1  ;
	            }
	        }

	        return false ;
	    } 
	
    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;
        while (left < right) {
            int sum = numbers[left] + numbers[right];
            int mid = left + (right - left) / 2;
            if (sum == target) {
                return new int[]{left + 1, right + 1};
            } else if (sum < target) {
                if (numbers[right] + numbers[mid] < target) {
                    left = mid;
                }
                left++;
            } else {
                if (numbers[left] + numbers[mid] > target) {
                    right = mid;
                }
                right--;
            }
        }
        return new int[]{-1, -1};
    }
	
    public int[] twoSumWithLinear(int[] numbers, int target) {

        int [] ans = new int[2] ;

        for(int i = 0; i < numbers.length; i++ )
        {
            for(int j = i +1 ; j < numbers.length ; j++)
            {
                if(numbers[i] + numbers[j]  == target )
                {
                    ans[0] = i+1 ;
                    ans[1] = j+1 ;
                    return  ans ;
                }
            }
        }

        return ans ;
    }
	
    public int[] twoSumOptimize(int[] numbers, int target) {

        int [] ans = new int[2] ;
            int start = 0 ;
            int end = numbers.length -1  ;
            while( start < end )
            {
                if( (numbers[start] + numbers[end] ) == target  )
                {
                    ans[0] = start + 1 ;
                    ans[1] = end + 1 ; 
                    return ans ;
                }

                if( (numbers[start] + numbers[end] ) > target )
                {
                    end = end -1 ;
                }else
                {
                    start = start +1 ;
                }
            }           
        return ans ;
    }
	
    public int firstBadVersion(int n) {
        int start = 0 ; 
        int end = n ;

        while(start < end )
        {
            int mid =  start +  ( end - start ) / 2 ;
            if(isBadVersion(mid) && isBadVersion(mid-1) == false )
            {
                return mid ;
            }
            if(isBadVersion(mid))
            {
                end = mid -1 ;
            }else
            {
                start = mid + 1 ;
            }
        }
        return start ;
    }
	
	public static int getFlooringofNumber(int[] arr, int target) 
	{
		int start = 0 ;
		int end = arr.length -1  ;
		
		while(start < end) 
		{
			int mid = (start + end) / 2 ;
			
			if(arr[mid] == target ) 
			{
				return arr[mid] ;
			}
			
			if(arr[mid] > target ) 
			{
				end = mid -1 ;
			}else 
			{
				start = mid + 1 ;
 			}
		}
		
		return arr[end] ;
	}
	
	public static int getCeliengOfNumber(int[] arr, int target) 
	{
		int start = 0 ;
		int end = arr.length -1  ;
		
		while(start < end) 
		{
			int mid = (start + end) / 2 ;
			
			if(arr[mid] == target ) 
			{
				return arr[mid] ;
			}
			
			if(arr[mid] > target ) 
			{
				end = mid -1 ;
			}else 
			{
				start = mid + 1 ;
 			}
		}
		
		return arr[start] ;
	}
	
      public int guessNumber(int n) {
        int i = 0 ;
        boolean isAsc = guess(i) < guess(n) ? true : false ;

            if(isAsc)
            {
                int start = 0 ;
                int end = n ;
                while( start <= end )
                {
                    int mid = start + (end - start ) / 2 ;
                        if (guess(mid) == 0 )
                        {
                            return mid ;
                        }else if(guess(mid) > 0 )
                        {
                            start = mid + 1 ;
                        }else if(guess(mid) < 0 )
                        {
                            end = mid -1 ;
                        }
                }

            }else
            {
                int start = n ;
                int end = 1 ;
                while( end <= start )
                {
                    int mid = start + (end - start) / 2 ;
                        if (guess(mid) == 0 )
                        {
                            return mid ;
                        }else if(guess(mid) > 0 )
                        {
                            end = mid + 1  ;
                        }else if(guess(mid) < 0 )
                        {
                            start = mid  - 1 ;
                        }
                }
            }
    return -1 ;
    }
    public static int mySqrt(int x) {
        int i = 0 ;
        while( i <= x )
        {
            if( (i * i <= x   && (i+1) * (i+1) > x ) || i * i == x  )
            {
                return i ;
               
            }
             i++;
        }
        return -1 ;
    }
}
