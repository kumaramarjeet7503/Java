package MyProject;

import java.util.ArrayList;
import java.util.List;

public class BitManipultions {

    public static void main(String[] args) {

        int[] nums = {1,2,3} ;

        int nfds = 10110 ;
        subsets(nums) ;
    }

        public static List<Integer> grayCode(int n) {
        List<Integer> res = new ArrayList<>() ;
        List<String> aux = generate(n);
        for(String ele : aux )
        {
            res.add(Integer.parseInt(ele,2)) ;
        }
        return res ; 
    }

    public static List<String> generate(int n)
    {
        if(n == 1)
        {
            List<String> help = new ArrayList<>() ;
            help.add("0");
            help.add("1");

            return help ;
        }

        List<String> ans = new ArrayList<>()  ;
        List<String> zero = generate(n - 1);
        for(int i =0; i < zero.size(); i++)
        {
            ans.add("0"+zero.get(i)) ;
        }
        for(int i = zero.size() -1 ; i >=  0; i--)
        {
            ans.add("1"+zero.get(i)) ;
        }

        return ans ;
    }

        public static int singleNumber(int[] nums) {
        int ans = 0 ;
      
        for(int i = 0 ; i < 32; i++)
        {
              int sum = 0 ;
            for(int j = 0 ; j < nums.length; j++)
            {
                if(( (nums[j]>>i) & 1) == 1 )
                {
                    sum++;
                }
            }
            sum %= 3 ;
            if(sum != 0)
            {
                ans |= sum << i ; 
            }
        }
        return ans ;
    }

        public static List<List<Integer>> subsets(int[] nums) {
        List<Integer> curr = new ArrayList<>() ;
        List<List<Integer>> ans = new ArrayList<>() ;
        rec(nums,0,curr,ans);
        return ans ;
    }

    public static void rec(int[] nums, int i, List<Integer> curr,List<List<Integer>>  ans)
    {
        if(i==nums.length)
        {
            ans.add(new ArrayList<Integer>(curr)) ;
            return ;
        }

        curr.add(nums[i]);
        rec(nums,i+1,curr,ans) ;
        curr.remove(curr.size() - 1) ;
        rec(nums,i+1,curr,ans) ;
    } 

        public int countConsistentStrings(String allowed, String[] words) {
        int count = 0 ;
        for(int i = 0 ; i < words.length ; i++)
        {
            boolean isCons = false ;
            for(int j  = 0 ; j < words[i].length() ; j++)
            {
                if( allowed.indexOf(words[i].charAt(j)) == -1 )
                {
                    isCons = false ;
                    break ;
                } 
                isCons = true;
            }
            if(isCons)
            {
                count++;
            }
        }
        return count ;
    }

        public static int xorOperation(int n, int start) {
        int[] aux = new int[n] ;
        for(int i = 0 ; i < n; i++)
        {
            aux[i] = start * 2 ;
        }
        int xor = 0 ;
        for(int ele : aux)
        {
            xor = xor ^ ele ;
        }
        return xor ;
    }

        public static int numberOfSteps(int num) {
        int count = 0 ;
        while(num != 0 )
        {
            if( (num & 1) == 0)
            {
                num = num / 2 ;
            }
            else
            {
                num = num - 1 ;
            }
            count++ ;
        }
        return count ;
    }

        public static int binaryGap(int n) {
        int max = 0 ;
        while(n > 0)
        {
            int num = n & 1 ;
            if(num == 1)
            {   
                n = n >> 1 ;
                int count = 0 ;
                if((n & 1) == 0){
                    while( (n & 1) == 1)
                    {
                        count++ ;
                        n = n >> 1 ;
                    }
                    if(max < count )
                    {
                        max = count ;
                    }
                }
            }
                n = n >> 1 ;
            
            
        }
        return max ;
    }

        public static int countPrimeSetBits(int left, int right) {
        int count = 0 ;
            for(int i = left ; i <= right ; i++)
            {
                int bit = Integer.bitCount(i) ;
                if(isPrimeNo(bit) == true)
                {
                    count++ ;
                }
            }
            return count ;
    }

    public static boolean isPrimeNo(int num)
    {
        if(num == 1)
        {
            return false ;
        }
        int count = 0 ;
        for( int i = 2; i <= num ; i++)
        {
            if(num % i == 0)
            {
                count++ ;
            }
        }
        if(count == 1)
        {
            return true ;
        }else
        {
            return false ;
        }
        
    }
        public boolean hasAlternatingBits(int n) {
        while(n > 0)
        {
            int x = n & 1 ;
            n = n >> 1 ;
            int y = n & 1 ;
            if(x == y)
            {
                return false ;
            }
        }
        return true ;
    }

        public static int findComplement(int num) {
       int i = 0 ;
       int j = 0 ;
        while(i < num)
        {
          i += Math.pow(2,j) ;
          j++ ;
        }
        return i ^ num ;
    }

        public static int hammingDistance(int x, int y) {
        
        int count = 0 ;
        while(x > 0 && y > 0 )
        {
            int first = x & 1 ;
            int sec = y & 1 ;
            if(first != sec)
            {
                count++ ;
            }
            first= first >> 1 ;
            sec = sec >> 1 ;
        }
        return count ;
    }

        public static List<String> readBinaryWatch(int turnedOn) {
        List<String> result = new ArrayList<>() ;
        for(int i = 0 ; i < 12; i++)
        {
            for(int j = 0 ; j < 60; j++)
            {
                int hourBit = Integer.bitCount(i) ;
                int minuteBit = Integer.bitCount(j) ;
                int sumBit = hourBit + minuteBit ;
                if(sumBit == turnedOn )
                {
                    String min = j+"" ;
                    if(j < 10)
                    {
                        min = "0"+min ;   
                    }
                    String aux = i+":"+min ; 

                    result.add(aux) ;
                }
            }
        }
        return result ;
    }

    public static int[] countBits(int n) {
        int[] ans = new int[n+1] ;
        for(int i =0 ; i < ans.length ; i++)
        {
            ans[i] = foundBit(i) ;
        }   
        return ans ;
    }

    public static int foundBit(int num)
    {
        if(num == 0) return 0 ;
        if(num == 1) return 1 ;

        if(num % 2 == 0 ) {
            return foundBit(num/2) ;
        }else 
        {
            return  1 + foundBit(num/2) ;
        }
    }

    public static int reverseBits(int n) {
        int result = 0 ;
        for(int i = 0 ; i < 32 ; i++)
        {
            int lsb = n & 1 ;
            int reverse = lsb << (31-i) ;
            result = result | reverse ;
            n = n >> 1 ;
        }
        return result ;
    }
    
     public static int singleNumber(int[] nums) {
        int x =0 ;
        for(int ele : nums)
        {
            x = x^ele ;
        }
        return x ;
    }

    public String addBinary(String a, String b) {
        int aint = a.length() ;
        int bint = b.length() ;
        int i = 0 ;
        int carry = 0 ;
        String result = "" ;
        while( i < aint || i < bint || carry != 0 )
        {
            int x = 0 ;
            int y = 0 ;
            if(i < aint && a.charAt(aint-i-1)== '1')
            {
                x = 1 ;
            }
            if(i < bint && b.charAt(bint-i-1)== '1')
            {
                y = 1 ;
            }
            result = (x+y+carry)%2 + result ;
            carry = (x+y+carry)/2 ;
            i++;
        }
        return result ;
    }


    }