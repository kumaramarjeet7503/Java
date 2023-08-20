package MyProject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ArrayClass {

	public static void main(String[] args) {
		int[] nums =  {1,0,-1,0,-2,2};
		int target =  0 ;
		fourSum( nums, target) ;
	
	}
	
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        int length = nums.length ;
        List<List<Integer>> ans = new  ArrayList<>() ;
        
        for(int i = 0 ; i <= length - 3 ; i++  )
        {
            for(int j = i + 1 ; j <= length - 2 ; j++  )
            {
                int l = j + 1 ;
                int h = length - 1 ;
                while(  l < h )
                {
                    long assumedSum = (long)(nums[i] + nums[j]) ;
                    long requiredSum = (long)(target - assumedSum) ;
                    long sum =  (long)(nums[l] + nums[h]);
                    if(requiredSum == sum)
                    {
                       
                        List<Integer> uniqueQuad  = new ArrayList<>() ;
                        uniqueQuad.add(nums[i]);
                        uniqueQuad.add(nums[j]);
                        uniqueQuad.add(nums[h]);
                        uniqueQuad.add(nums[l]);
                        if(checkUniqueElement(ans,uniqueQuad))
                        {
                            ans.add(uniqueQuad); 
                        }                        
                        l++;
                        h--;
                    }
                    if(sum < requiredSum)
                    {
                        l++;
                    }else if(sum > requiredSum)
                    {
                        h--;
                    }
                }

            }
        }
        return ans ;
}

public boolean checkUniqueElement(List<List<Integer>> ans,List<Integer> uniqueQuad)
{
    if(ans.isEmpty())
    {
        return true ;
    }
    for(int i = 0 ; i < ans.size() ; i++)
    {
        if(ans.get(i).equals(uniqueQuad))
        {
            return false ;
        }
    }

    return true ;
}

}
