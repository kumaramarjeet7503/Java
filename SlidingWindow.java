package MyProject;

import java.util.*;


public class SlidingWindow {
    public  static void main(String[] args) {
        int[] nums = {-1,-1,1} ;
        lengthOfLongestSubstring(" ") ;
        

        System.out.println(Arrays.toString(maxSlidingWindow( nums, 45) ));
    }

    public static int lengthOfLongestSubstring(String s) {
        int i =0 ;
        int j = 0 ;
        int max= 0; 
        int maxWindowSize = 0 ;
        Map<Character,Integer> stringHelper = new HashMap<>();
        while(j < s.length())
        {
            char uniqueChar = s.charAt(j);
            if(stringHelper.get(uniqueChar) == null){
                int uniqueCharValue = stringHelper.get(uniqueChar) == null ? 0 : stringHelper.get(uniqueChar) ;
                stringHelper.put(uniqueChar,uniqueCharValue++);
                j++;
            }else
            {
                if(stringHelper.size() > max)
                {
                    max = stringHelper.size() ;
                    maxWindowSize = j - i + 1  ;
                }
                stringHelper.clear() ;
                i = j ; 
            }
        }
        return stringHelper.size();
    }

    public static int subarraySum(int[] nums, int k) {
        int i = 0 ;
        int j = 0 ;
        int numberOfSubarrays = 0 ;
        int sum = 0 ;

        while(j < nums.length)
        {
            sum = sum + nums[j];
            if(sum < k )
            {
                j++;
            }else if(sum == k )
            {
                numberOfSubarrays++;
            }else if(sum > k)
            {
                while(sum > k)
                {
                    sum = sum - nums[i] ;
                    i++ ;
                }
                if(sum == k)
                {
                    numberOfSubarrays++;
                }
                j++;
            }
        }

        return numberOfSubarrays;
    }

    public static int isWinner(int[] player1, int[] player2) {
        int player1Score = getSumOfValues(player1) ;
        int player2Score = getSumOfValues(player2) ;
        if(player1Score == player2Score)
        {
            return 0 ;
        }else if(player1Score > player2Score)
        {
            return 1 ;
        }else
        {
            return 2 ;
        }
 
     }
 
     public static int getSumOfValues(int[] arr)
     {
         int i = 0;
         int j = 0 ;
         int k = 2 ;
         int sum = 0 ;
         boolean is10 = false ;
         boolean isIncremented = true ;
         while(j < arr.length)
         {
             if(arr[i] == 10)
             {
                 is10 = true ;
             }
             if(is10 == true)
             {
                 if(i==0 && isIncremented )
                 {
                     isIncremented = false ;
                     sum += arr[j] ;
                 }else{
                 sum = sum + 2 * arr[j] ;
                 }
             }else
             {
                   sum += arr[j] ;
             }
              int windowSize = j-i+1 ;   
             if(windowSize < k )
             {
                 j++;
             }else if( windowSize == k)
             {
                
                 i++;
                 j++;
             }
         }
         return sum ;
     }

    public static int countOccurencesOfAnnagram(String sentence, String pattern)
    {
        int i = 0 ;
        int j = 0 ;
        int k = pattern.length() + 1 ;
       
        HashMap<Character,Integer> map = new HashMap<>();

        for(int m = 0 ; m < pattern.length(); m++)
        {
            int countValue = map.get(pattern.charAt(m)) == null ? 1 : map.get(pattern.charAt(m)) + 1;
            map.put(pattern.charAt(m),countValue );
        }
        int count = map.size();
        int ans = 0;

        while( j < sentence.length())
        {
            // Calculating window size
            int windowSize = j - i + 1 ;

            Character charValue = sentence.charAt(j) ; 
            int countValue =  map.get(charValue) - 1 ;
            map.put(charValue,countValue);
            if(countValue == 0)
            {
               count--;
            }
            //  When window size  is less  
            if(windowSize < k)
            {
                j++;
            }else if(windowSize == k)
            {
                if(count == 0)
                {
                    ans++;
                }
                    // Handling if pattern not matched
                Character charValueSlide = sentence.charAt(i+1) ; 
                int countValueSlide =  map.get(charValueSlide) + 1 ;
                map.put(charValueSlide,countValueSlide);
                if(countValueSlide == 1)
                {
                    count++;
                } 
          

                // Shifting window 
                i++;
                j++;
            }
        }
        return ans ;
    }

    public static void firstNegativeInteger(int[] arr, int k){
        int i = 0 ; 
        int j = 0 ;
        //  List for storing negative element
        List<Integer> negativeIntegerArray = new ArrayList<>() ;

        while(j < arr.length)
        {
            int windowSize = j - i + 1 ;
            if(arr[j] < 0 )
                {
                    negativeIntegerArray.add(arr[j]) ;
                }
            if(windowSize < k )
            {
                j++;
            }else if(windowSize == k)
            {
                if(negativeIntegerArray.isEmpty())
                {
                    System.out.println("0");
                }
                else if(arr[i] == negativeIntegerArray.get(0) )
                {
                    System.out.println(negativeIntegerArray.get(0));
                    negativeIntegerArray.remove(0) ;
                }else
                {
                    System.out.println(negativeIntegerArray.get(0));
                }

                i++;
                j++;
            }

        }
    }

    /* public static int[] maxSlidingWindow(int[] nums, int k) {
        int i = 0 ; 
        int j = 0 ;
        //  List for storing negative element
        List<Integer> negativeIntegerArray = new ArrayList<>() ;
         int windowValue = Integer.MIN_VALUE ;

        while(j < nums.length)
        {
           
            int windowSize = j - i + 1 ;
            if(i == k )
                {
                    maxValue = Integer.MIN_VALUE ;
                }
            if(maxValue < nums[j] )
                {
                    maxValue = nums[j] ;
                }
            if(windowSize < k )
            {
                j++;
            }
            else if(windowSize == k)
            {

                negativeIntegerArray.add(maxValue);
                i++;
                j++;
            }

        }
        int[] ans = new int[negativeIntegerArray.size()];
        for(int p = 0 ; p < negativeIntegerArray.size() ; p++ )
        {
            ans[p] = negativeIntegerArray.get(p);
        }

        return ans ;
    }   */

    public static int[] maxSlidingWindow(int[] nums, int k) {
        int i = 0 ; 
        int j = 0 ;
        //  List for storing negative element
        List<Integer> maxArray = new ArrayList<>() ;
         List<Integer> ansArray = new ArrayList<>() ;

        while(j < nums.length)
        {
            int windowSize = j - i + 1 ;
            if(!maxArray.isEmpty() && maxArray.get(0) < nums[j] )
                {
                    maxArray.clear() ;
                }
                maxArray.add(nums[j]) ;
            if(windowSize < k )
            {
                j++;
            }
            else if(windowSize == k)
            {
                if( maxArray.get(0) == nums[i] )
                {
                    ansArray.add(maxArray.get(0));
                    maxArray.remove(0) ;
                    Collections.sort(maxArray, Collections.reverseOrder());
                }else{
                    ansArray.add(maxArray.get(0));
                }
                 
               
                i++;
                j++;
            }

        }
        int[] ans = new int[ansArray.size()];
        for(int p = 0 ; p < ansArray.size() ; p++ )
        {
            ans[p] = ansArray.get(p);
        }

        return ans ;
    }
}
