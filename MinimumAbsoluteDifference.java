package MyProject;

import java.util.*;

class MinimumAbsoluteDifference {


    public static void main(String[] args) {
        
      int[]  nums1 = {3163,10402,4883,27953} ;

     int[]   nums2 = {16605} ;
        System.out.println(minAbsoluteSumDiff( nums1,  nums2) ); 

    // int[] arr =  {2,11,12} ;
    // int target = 1 ;
    //  int num = minimumDifferenceElement(arr,target) ;
    //  System.out.println(num);
    }

    public int minAbsoluteSumDiff(int[] nums1, int[] nums2) {

        int[] diffArray = getDiffArray( nums1, nums2) ;
        int[] bestDiffArr = getBestDiffArray(nums1,  nums2) ;
        int[] saved = getDiffArray( diffArray, bestDiffArr) ;
        long max = getMax(saved) ;
        long diffSum =  calDiffSum(nums1, nums2) ;
        long sum =  diffSum - max ;
        // int res = (int) sum ;
                int mod=1000000007;
        return (int)(sum % mod);
        // return  res ;
}

private long calDiffSum(int[] nums1, int[] nums2)
{
    long diffSum = 0 ;
    for(int i = 0 ; i < nums1.length ; i++)
    {
        diffSum += Math.abs(nums1[i] - nums2[i]) ;
    }
    return diffSum ;
}

    private  int[] getDiffArray(int[] nums1, int[] nums2)
{
    int[] diffArray = new int[nums1.length] ;
    for(int i = 0 ; i < diffArray.length  ; i++)
    {
        diffArray[i] = Math.abs(nums1[i] - nums2[i]) ;
    }
    return diffArray ;
}

    private  int[] getBestDiffArray(int[] nums1, int[] nums2)
{
    int[] bestDiffArray = new int[nums1.length] ;
    int[] temp =  new int[nums1.length] ;
     System.arraycopy(nums1, 0, temp, 0, nums1.length); ;
    Arrays.sort(temp) ;
    for(int i = 0 ; i < bestDiffArray.length  ; i++)
    {
      bestDiffArray[i] = Math.abs( nums2[i] - minimumDifferenceElement(temp, nums2[i]));
    }
    return bestDiffArray ;
}

    private  int minimumDifferenceElement(int[] arr, int target)
{
    int start = 0 ; 
    int end = arr.length -1 ;
   
    while( start <= end )
    {
        int mid = start + (end - start ) /2 ;
        if(arr[mid] == target   )
        {
            return arr[mid] ;
        }
        if(arr[mid] > target  )
        {
            end = mid - 1 ;
        }else if(arr[mid] < target    )
        {
            start = mid + 1 ;
        }
    }
    if(start  < 0 )
    {
        start = 0 ;
    }else if(end < 0)
    {
        end = 0;
    }
    else if(end >= arr.length)
    {
        end = arr.length -1 ;
    } else if(start >= arr.length)
    {
        start = arr.length -1 ;
    }
    long  startDiff = (long)  Math.abs(arr[start] - target ) ;
    long endDiff =  (long) Math.abs(arr[end] - target ) ;
    return startDiff > endDiff ? arr[end] : arr[start] ;
}

private  long getMax(int [] arr)
{
    long max = 0 ;
    for(int i = 0 ; i < arr.length ; i++)
    {
        if(arr[i] > max )
        {
            max = arr[i] ;
        }
    }

    return max ;
}

}
