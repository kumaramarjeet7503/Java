package MyProject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SortingSolutions {

 static List<List<Integer>> result= new ArrayList<>() ;
    public static void main(String[] args) {
        // String[] nums = {"abc","bca","abd"} ;
        int[][] nums =  {{1,3},{2,6},{8,10},{15,18}} ;
        merge(nums) ;
    }

        public static int[][] merge(int[][] intervals) {
        int start  = 0 ; 
        int end = 1 ;
        List<List<Integer>> aux = new ArrayList<>() ;
        for(int i = 0 ; i < intervals.length - 1; i++)
        {
            int j = i + 1;
            List<Integer> ele = new ArrayList<>() ;  
                ele.add(intervals[i][start]);
                ele.add(intervals[i][end]) ;
            if(intervals[i][end] >= intervals[j][start])
            {
                ele.removeAll(ele);                  
                ele.add(intervals[i][start]);
                ele.add(intervals[j][end]) ;
                aux.add(ele);
            }else
            {
                List<Integer> ele2 = new ArrayList<>() ; 
                ele2.add(intervals[j][start]);
                ele2.add(intervals[j][end]) ;
                aux.add(ele);
                aux.add(ele2);
            }
        }
        
        int[][] ans = new int[aux.size()][2] ;
        for(int i = 0 ; i < aux.size(); i++)
        {
            for(int j = 0 ; j < 2; j++)
            {
                ans[i][j] = aux.get(i).get(j) ;
            }
        }
        return ans ;
    }
    
        public static List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res = new ArrayList<>() ;
        Map<String,List<String>> hm = new HashMap<>() ;
        for(int i = 0 ; i < strs.length  ; i++){
            char[] curr = strs[i].toCharArray() ;
            Arrays.sort(curr);
            String currStr = new String(curr) ;
            if(hm.containsKey(currStr))
            {
                hm.get(currStr).add(strs[i]);
                  hm.put(currStr,hm.get(currStr));
            }else
            {
                List<String> anagram = new ArrayList<>() ;
                anagram.add(strs[i]) ;
                hm.put(currStr,anagram);
            }
        }
        for( String str : hm.keySet() )
        {
            res.add(hm.get(str)) ; 
        }
        return res ;
    }

    // public static List<List<String>> groupAnagrams(String[] strs) {
      
    //     List<List<String>> res = new ArrayList<>() ;
    //     for(int i = 0 ; i < strs.length - 1 ; i++){
    //         List<String> anagram = new ArrayList<>() ;
    //           int j = i + 1 ;
    //           if(strs[i] != "-1")
    //           {
    //             anagram.add(strs[i]) ;
    //           }
              
    //         while( j < strs.length && strs[i] != "-1"  )
    //         { 
    //              boolean isAnagram = true ;
    //             if(strs[i].length() == strs[j].length())
    //             {
                   
    //                 for(int k = 0 ; k < strs[i].length(); k++)
    //                 {
    //                     char matchChar = strs[i].charAt(k) ;
    //                     if(strs[j].indexOf(matchChar) == -1)
    //                     {
    //                         isAnagram = false ;
    //                         break ;
    //                     }
    //                 }
    //             }
    //             if(isAnagram && strs[j] != "-1")
    //             {
    //                 anagram.add(strs[j]) ;
    //                 strs[j] = "-1" ;
    //             }
    //             j++;
    //         }
    //         res.add(anagram);
    //     }
    //     return res ;
    // }

    public static int threeSumClosest(int[] nums, int target) {
        // Arrays.sort(nums);
        int min = Integer.MAX_VALUE ;
        List<Integer> aux = new ArrayList<Integer>() ;
        for(int i = 0 ; i < nums.length; i++)
        {
            if(i==0 || nums[i-1] != nums[i] ){
                int current = nums[i] ;
                int j = nums.length - 1;
                int k = i + 1 ;
                while(k<j)
                {
                    int sum = current + nums[k] + nums[j] ;
                    aux.add(sum);
                    j--;
                } 
            }
        }
        int outputElement = 0 ;
        for(int element : aux)
        {
            if(min > Math.abs(target - element))
            {
                min = target - element ;
                outputElement = element ;
            }
        }
        return outputElement ;
    }

    public static void twoSumSorted(int i, int j, int[] nums, int target)
    {
        int current = nums[i-1] ;
        while(i<j)
        {
            if(nums[i]+nums[j] > target )
            {
                j--;
            }
            else if(nums[i]+nums[j] > target )
            {
                i++;
            }else
            {
                List<Integer> sol = new ArrayList<Integer>() ;
                sol.add(current) ;sol.add(nums[i]) ; sol.add(nums[j]) ;
                result.add(sol);

                while(i<j && nums[i] == nums[i+1] )
                {
                    i++;
                } 
                while(i<j && nums[j] == nums[j-1] )
                {
                    j--;
                } 
                i++;
                j--;
            }
        }
    }

        public static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> output = new ArrayList<>() ;
        Arrays.sort(nums) ;
        int index = 1 ;
        for(int i = 0 ; i < nums.length - 1 ; i++)
        {
            if(nums[i] == index && nums[i] != nums[i+1])
            {
                if(nums[i+1] - nums[i] != 1)
                {
                    output.add(++index) ;
                }
                index++;
            }
        }
        return output ;
    }
    
     public static int[] sortByBits(int[] arr) {
        int bitCount = 0 ;
        for(int element = 0 ;element < arr.length ; element++  )
        {
              bitCount = Integer.bitCount(arr[element]) ;
            //  long binary =  Long.valueOf(Integer.toBinaryString(arr[element])) ;
            //  int bitCount = getBitCount(binary) ;
            //  arr[element] = bitCount ;
        }
        Arrays.sort(arr);
        return arr ;
    }

        public static int getBitCount(long binary)
    {
        int count = 0 ;
        while(binary > 0 )
        {
            long r = binary % 10 ;
            if(r == 1)
            {
                count++ ;
            }
            binary = binary / 10 ;
        }

        return count ;
    }

        public static int[] arrayRankTransform(int[] arr) {
        int[] output = new int[arr.length] ;
        int[] original = new int[arr.length] ;

        for(int i = 0 ; i < arr.length ; i++)
        {
            original[i] = arr[i] ;
        }

        Arrays.sort(arr) ;
        Map<Integer,Integer> hashMap = new HashMap<>() ;
         for(int i = 0 ; i < arr.length ; i++)
        {
            if(hashMap.get(arr[i]) == null ){
                hashMap.put(arr[i],i+1) ;
            }
        }

        for(int i = 0 ; i < original.length ; i++)
        {
            output[i] = hashMap.get(original[i]) ;
        }
        return output ;
    }

        public static int[] relativeSortArray(int[] arr1, int[] arr2) {
        int[] output = new int[arr1.length] ;
        int currentIndex = 0 ;
        //  Added repeated element into output array
        for(int i =0 ; i < arr2.length ; i++)
        {
            for(int j =0 ; j < arr1.length ; j++)
            {
                if(arr2[i] == arr1[j])
                {
                    output[currentIndex] = arr1[j] ;
                    arr1[j] = -1 ;
                    currentIndex++;
                }
            }
        }

        Arrays.sort(arr1) ;
        for(int i = 0 ; i < arr1.length; i++)
        {
            if(arr1[i] != -1)
            {
                output[currentIndex] = arr1[i] ;
                currentIndex++;
            }
        }

    return output ;
    }
    
    public static int[][] allCellsDistOrder(int rows, int cols, int rCenter, int cCenter) {
        int[][] ans = new int[rows*cols][2] ;
        for(int i = 0 ; i < rows ; i++)
        {
            for(int j = 0 ; j < cols ; j++)
            {
                int boxNo = i * cols + j ;
                ans[boxNo][0] = i ;
                ans[boxNo][1] = j ; 
            }
        }

        return ans ;
    }

    public static int[] sortArrayByParity(int[] nums) {
    //    Arrays.sort(nums) ;
        for(int i = 0 ; i < nums.length; i++)
        {
            int j = i + 1 ;
            while(nums[i] % 2 != 0 )
            {
                if(j < nums.length && nums[j] % 2 == 0)
                {
                    swap(nums,i,j);
                }
                j++;
            }
        }
            return nums ;
    }

                public static void swap(int[] arr, int a, int b) 
        {
            int temp = arr[a] ;
            arr[a] = arr[b] ;
            arr[b] = temp ;
        }

      public static int maximumProduct(int[] nums) {
        int j = 0 ;
        int i = 0 ;
        int multiply = 1 ;
        int maxProduct = 1 ;
        while(j < nums.length )
        {
            int windowSize = j  - i + 1 ;
            multiply = multiply * nums[j] ;
            if(windowSize < 3)
            {
                maxProduct = multiply ;
                j++ ;
            }else if(windowSize == 3)
            {
                if(multiply > maxProduct || nums.length == 3 )
                {
                     maxProduct = multiply ;
                }
                multiply = multiply / nums[i] ;
                i++;
                j++;
            }
        }
        return maxProduct ;
    }

     public static int thirdMax(int[] nums) {
        int i = nums.length - 1 ;
      while( i > 0 ){
          
          if(nums[i] != nums.length - 1)
          {
              int temp = nums[i] ;
              nums[i] =  nums[nums.length - i - 1]  ;
              nums[nums.length - i - 1]  = temp ;
          }
          else
          {
              i++ ;
          }
      }
      return nums.length <= 2 ? nums[2] : nums[0] ;    
    }
    
    public int majorityElement(int[] nums) {
        int count = 0 ;
        int majority = nums[0];
        for(int i = 0 ; i < nums.length; i++)
        {
            if(nums[i] == majority)
            {
                count += 1 ;
            }else
            {
                count = count - 1 ;
                if(count == 0)
                {
                    majority = nums[i] ;
                    count = 1 ;
                }
            }
        } 

        return majority ;   
    }

    public static boolean containsDuplicate(int[] nums) {
      
        for(int i = 0 ; i < nums.length  ; i++)
        {
            int count = 0 ;
            for(int j = i + 1 ; j <= nums.length/ 2 ; j++)
            { 
                if(nums[i] == nums[j] || nums[i] == nums[nums.length - j] )
                {
                    return true ;
                }
            }
        }
        return false ;
    }
}
