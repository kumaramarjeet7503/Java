package MyProject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class MathSolutions {
    public static void main(String[] args) {
        kthFactor(7,2) ;
    }

        public int integerBreak(int n) {
        if(n == 2)
        {
            return 1 ;
        }
        if(n == 3)
        {
            return 2 ;
        }

    int product = 1 ;
        while( n > 4)
        {
            product *= 3 ;
            n = n -3 ;
        }
        product *= n ;
        return product  ;
    }

        public static int kthFactor(int n, int k) {
        List<Integer> help = new ArrayList<>() ;
        int count = 0 ;
        for(int i = 1; i <= n; i++)
        {
            int ans =  n % i ;
            if( ans == 0)
            {
                 count++ ; 
                if(count == k)
                {
                   
                    return i ;
                }
            }
        }
        return -1 ;
    }

        public static double angleClock(int hour, int minutes) {
        double hourAngel = 30 * hour + 0.5 * minutes ;
        double minAngel = 6 * minutes ;

        double difference = Math.abs(hourAngel - minAngel) ;
        if(difference > 180)
        {
            difference = Math.abs(difference - 360) ;
        } 

        return difference ;
    }

        public static int uniquePaths(int m, int n) {
        int i = 0 ; 
        int j = 0 ;
        int uniquePath = reached(0,0,0,m,n) ;
        return uniquePath ;
        
    }

        public static int numSquares(int n) {
        int[] dp = new int[n+1] ;
        dp[0] = 0;
        dp[1] = 1 ;

        for(int i = 2; i <= n; i++)
        {
            int min = Integer.MAX_VALUE ;
            for(int j = 1; j * j <=  i ; j++)
            {
                int rem = i - j * j ;
                if(dp[rem] < min)
                {
                    min = dp[rem] ;
                }
            }
            dp[i] = min + 1 ;   
        }
        return dp[n] ;
    }

    public static int reached(int row , int col, int count, int m , int n )
    {
        if(row == m && col == n )
        {
            count++ ;
            return count ;
        }
        if(row < m)
        {
            
            count += reached(row+1,col,count,m,n) ;
        }
        if(col < n)
        {
           
            count += reached(row,col+1,count,m,n) ;
        }
        return count ;
    }

        public static String intToRoman(int num) {
        
        Map<Integer, String> hm = new HashMap<>() ;
        hm.put(1000,"M") ;
          hm.put(900,"CM") ;
        hm.put(500,"D") ;
         hm.put(400,"CD") ;
        hm.put(100,"C") ;
           hm.put(90,"XC") ;
        hm.put(50,"L") ;
         hm.put(40,"XL") ;
        hm.put(10,"X") ;
         hm.put(9,"IX") ;
        hm.put(5,"V") ;
         hm.put(4,"IV") ;
        hm.put(1,"I") ;
       
        StringBuilder sb = new StringBuilder() ;
        while(num > 0)
        {
            if(num >= 1000)
            {
                num = num - 1000 ;
                sb.append(hm.get(1000)) ;
                continue ;
            }
            if(num >= 900 && num < 1000)
            {
                num = num - 900 ;
                sb.append(hm.get(900)) ;
            }
            if(num >= 500)
            {
                num = num - 500 ;
                sb.append(hm.get(500)) ;
            }
            if(num >= 400 && num < 500)
            {
                num = num - 400 ;
                sb.append(hm.get(400)) ;
            }
            if(num >= 100)
            {
                num = num - 100 ;
                sb.append(hm.get(100)) ;
                continue ;
            }
            if(num >= 90 && num < 100)
            {
                num = num - 90 ;
                sb.append(hm.get(90)) ;
            }
            if(num >= 50)
            {
                num = num - 50 ;
                sb.append(hm.get(50)) ;
            }
              if(num >= 40 && num < 50)
            {
                num = num - 40 ;
                sb.append(hm.get(40)) ;
            }
            if(num >= 10)
            {
                num = num - 10 ;
                sb.append(hm.get(10)) ;
                continue ;
            }
            if(num >= 9 && num < 10)
            {
                num = num - 9 ;
                sb.append(hm.get(9)) ;
            }
               if(num >= 5)
            {
                num = num - 5 ;
                sb.append(hm.get(5)) ;
            }
              if(num >= 4 && num < 5)
            {
                num = num - 4 ;
                sb.append(hm.get(4)) ;
            }
            if(num >= 1)
            {
                num = num - 1 ;
                sb.append(hm.get(1)) ;
                continue ;
            }

        }

        String ans = new String(sb) ;
        return ans ; 
    }

        public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> ans = new ArrayList<>() ;
        while(left <= right)
        {
            if(isSelfDividing(left)) ans.add(left) ; 
            left++ ;
        }
        return ans ;
    }

    public boolean isSelfDividing(int num)
    {
        boolean isSelfDividing = false ;
        int original = num ;
        while( num > 0)
        {
            int r = num % 10 ;
            if(r == 0) return false ;
            if(original % r != 0 ) return false ;
            num = num / 10 ;
        }
        return true ;
    }

        public int climbStairs(int n) {
        int[] memo = new int[n+1] ; 
        int stairs = rec(n,memo) ;
        return stairs ;
    }

    public int rec(int n,int[] memo)
    {
        if(n <= 1) return 1 ;
        // Memoization
        if(memo[n] > 0) return memo[n] ;
        int num1 = rec(n-1,memo) ;
        int num2 = rec(n-2,memo) ;
        memo[n] = num1 + num2 ;
        return num1 + num2 ;
    }

         public boolean isPowerOfTwo(int n) {
        if(Integer.bitCount(n) == 1)
        {
            if(((n >> 31 ) & 1 ) == 1 ) return false ;
            return true ;
        }
        
        return false ;
    }

       public static boolean isPowerOfFour(int n) {
        if(Integer.bitCount(n) == 1)
        {
            for(int i = 0 ; i < 32; i++)
            {
                if( (n & 1) == 1)
                {
                    if( i % 2 == 0)
                    {
                        return true ;
                    }
                    return false ;
                }
                n = n >> 1 ;
            }
        } 
        return false ;
    }
}
