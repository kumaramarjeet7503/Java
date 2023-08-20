package MyProject;

public class PeakIndexInMountainArray {
	
	public static void main(String[] args) 
	{
		int nums[] = {2,1} ;
		findPeakElement(nums);
	}
	
    public static int findPeakElement(int[] nums) {
        int pivot = findPivot(nums) ;
        if(pivot == -1)
        {
            return  nums.length - 1;
        }
        return pivot  ;
        
    }
	
	    public static int findPivot(int[] nums)
	    {
	        int start = 0 ;
	        int end = nums.length - 1 ;
	        while(start < end)
	        {
	            int mid = start + (end - start ) / 2 ;
	            if(nums[start] >= nums[mid] && mid != start )
	            {
	                end = mid ;
	            }
	             if( (mid + 1) <= end &&  nums[mid + 1] > nums[mid])
	            {
	                start = mid + 1 ;
	            }
	             
	            if(  (mid + 1) <= end  &&  nums[mid + 1] < nums[mid]   )
	            {
	            	
	            	if( mid > 0 && nums.length > mid && nums[mid] > nums[mid+1] && nums[mid] > nums[mid -1 ] ) 
	            	{
	            		return mid ;
	            	}
	            	if(mid == 0 ) 
	            	{
	            		return 0 ;
	            	}
	            	else 
	            	{
	            		
	            		start++ ;
	            		end--;
	            	}
	            }
	        }
	        return -1 ;
	    }

}
