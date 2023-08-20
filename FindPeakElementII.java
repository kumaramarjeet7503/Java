package MyProject;
import java.util.Arrays; 

public class FindPeakElementII {
    public static void main(String[] args) {

        // findPeakGrid(mat) ;
        int[]  nums = {9930,9923,9983,9997,9934,9952,9945,9914,9985,9982,9970,9932,9985,9902,9975,9990,9922,9990,9994,9937,9996,9964,9943,9963,9911,9925,9935,9945,9933,9916,9930,9938,10000,9916,9911,9959,9957,9907,9913,9916,9993,9930,9975,9924,9988,9923,9910,9925,9977,9981,9927,9930,9927,9925,9923,9904,9928,9928,9986,9903,9985,9954,9938,9911,9952,9974,9926,9920,9972,9983,9973,9917,9995,9973,9977,9947,9936,9975,9954,9932,9964,9972,9935,9946,9966}; int k = 3056 ;
        System.out.println(maxFrequency(nums,k)); ;
    }

    public static int maxFrequency(int[] nums, int k) {
        int i = 0 ;
        int j = nums.length - 1 ;
        int maxFrequency = 1 ;
        int consumedK = 0 ;
        Arrays.sort(nums) ;
        while(i <= j && consumedK < k )
        {
            if( j > 0 && nums[j-1] < nums[j] && k > 0  )
            {
                consumedK += nums[j] - nums[j-1] ;
                if(consumedK < k)
                {
                    nums[j-1] = nums[j] ;
                    maxFrequency++ ;
                       
                }if(consumedK == k)
                {
                    maxFrequency++  ;
                }
            }
              j = j-1 ;
        }
        return maxFrequency ;
    }

    public static  int[] findPeakGrid(int[][] mat) {
        // Inputs for find peak grid
                // int[][] mat = { {7,6},
                // {2,5},
                // {3,4},
                // {1,2},
                // {2,1}};
        int i = 0 ;
        int j = mat[0].length - 1 ;
        int[] ans = new int[2] ;
        while(i >= 0 && j >= 0 && i <= mat.length -1  && j <= mat[0].length -1  )
        {
            int[] res = getPeakElementIndex( mat, j, i);
            if(res[0] == -1 && res[1] == -1 )
            {
                ans[0] = i ;
                ans[1] = j ;
                return ans ;
            }else
            {
                i = res[0] ;
                j = res[1] ;
            }
        }
                      return ans ;  
    }
    private static int[] getPeakElementIndex(int[][] mat,int mid, int i)
    {
        int[] peakIndex = new int[2] ;
        peakIndex[0] = -1 ;
        peakIndex[1] = -1 ;
        
        if( mid -1 >= 0 && mat[i][mid] < mat[i][mid-1] )
        {
           peakIndex[0] = i ;
           peakIndex[1] = mid-1 ;
        }
        if( mid +1 < mat[0].length && mat[i][mid] < mat[i][mid+1] )
        {
            peakIndex[0] = i ;
           peakIndex[1] = mid+1 ;
        }
        if(i +1 < mat.length && mat[i][mid] < mat[i+1][mid] )
        {
            peakIndex[0] = i+1 ;
           peakIndex[1] = mid ;
        }
        if( i -1 >= 0 && mat[i][mid] < mat[i-1][mid])
        {
            peakIndex[0] = i-1 ;
           peakIndex[1] = mid ;
        }

        return peakIndex ;
    }
}
