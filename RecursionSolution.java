package MyProject;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.Arrays;

public class RecursionSolution {
    public static void main(String[] args)
    {
        // countZero(1020,0) ; 
        // char[][] board = {{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}} ; 
        // exist(board,"ABCCED") ;  
        // String a = "" ;
        // countGoodNumbers(1) ;
        // System.out.println(pad("","23")) ;
        // int[] un = {1,4,0,3} ;
        // Stack arr = new Stack<Integer>()  ;
        // arr.push(1);
        // arr.push(4);
        // arr.push(0);
        // arr.push(3)  ;
        // reverse(arr) ;
    
        int[] candidates = {10,1,2,7,6,1,5}; int target = 8 ;
        combinationSum2(candidates,target) ;
        
    }

    public static List<List<Integer>> ans = new ArrayList() ;
    public static List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<Integer> curr = new ArrayList() ;
        Arrays.sort(candidates) ;
        return sum(candidates,target,0,0,curr) ;
    }

    public static List<List<Integer>> sum(int[] candidates, int target, int index,int sum, List<Integer> curr)
    {
        if(index == candidates.length || sum > target )
        {
            return ans ;
        }

        if(sum == target)
        {
            ans.add(curr);
        }

        if(candidates[index] < target )
        {
            curr.add(candidates[index]) ;
            sum = sum + candidates[index];
            sum(candidates,target,index+1,sum,curr) ;
            sum = sum - candidates[index] ;
            curr.remove(curr.size() - 1) ;
        }
        return ans ;
    }


    public static void reverse(Stack<Integer> st)
    {
        if(st.size() == 1) return ;
        int top = st.pop() ;
        reverse(st) ;
             insertIntoStack(st,top);
        
    }

    public static void insertIntoStack(Stack<Integer> st, int top)
    {
        if(st.empty())
        {
            st.push(top) ;
            return ;
        }

        int ele = st.pop() ;
        insertIntoStack(st, top);
        st.push(ele) ;
        return ;
    }

    public static void sort(Stack<Integer> arr)
    {
        if(arr.size() == 1) return ;
        
        int temp = arr.pop()  ;        
        sort(arr) ;
        insert(arr,temp) ;
        
    }

    public static void insert( Stack<Integer> arr, int num)
    {
        if(arr.size() == 0 || arr.get(arr.size() - 1) <= num )
        {
            arr.push(num) ;
            return ;
        } 

        int temp = arr.pop() ;
        insert(arr,num) ;
        arr.push(temp) ;
        return ;
    }

    public static String decodeString(String s) {
        Stack<Integer> numStack = new Stack<>();
        Stack<StringBuilder> strStack = new Stack<>();
        StringBuilder currentString = new StringBuilder();
        int num = 0;

        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                num = num * 10 + (c - '0');
            } else if (c == '[') {
                numStack.push(num);
                strStack.push(currentString);
                currentString = new StringBuilder();
                num = 0;
            } else if (c == ']') {
                int repeatTimes = numStack.pop();
                StringBuilder temp = new StringBuilder(strStack.pop());
                for (int i = 0; i < repeatTimes; i++) {
                    temp.append(currentString);
                }
                currentString = temp;
            } else {
                currentString.append(c);
            }
        }

        return currentString.toString();
    }

    public static ArrayList<String>  pad(String p, String up)
    {
        if(up.isEmpty())
        {
            ArrayList<String> list = new ArrayList<>() ;
            list.add(p) ;
            return list ;
        }

        int digit =  up.charAt(0) - '0' ;
        digit = digit - 1 ;
        ArrayList<String> ans = new ArrayList<>() ;
        for(int i = (digit - 1 ) * 3    ; i <= digit * 3 ; i++)
        {
            char ch = (char) ('a'+ (i ) ) ; 
            ans.addAll(pad(p + ch ,up.substring(1)))  ;
        }
        return ans ;
    }

    public static void subs(String p, String up)
    {
        if(up.isEmpty()) {System.out.println(p); return;}
        char ch = up.charAt(0);
        subs(p+ch,up.substring(1)) ;
        subs(p,up.substring(1)) ;
    }

    public static int countGoodNumbers(long n) {
        int count = 0;
     if(n % 2 == 0) 
            {
                for(long i = 1; i < n ; i = i + 2 )
                {
                     if(isPrime(i)) count++ ;
                }
            }
            return count ;
        }
    
        public static boolean isPrime(long n)
        {
            if(n < 2) return false ;
            if(n == 2) return true ;
            for(long i = 2 ; i * i < n ; i++ )
            {
                if(n % i == 0)
                {
                    return false ;
                }
            }
            return true ;
        }

      public static boolean exist(char[][] board, String word) {
        for(int i = 0 ; i < board.length; i++)
        {
            for(int j = 0 ; j < board[0].length; j++)
            {
                if(board[i][j] == word.charAt(0) && dfs(board,word,0,i,j))
                {
                    return true  ;
                }
            }
        }
        return false ;
    }

    public static boolean dfs(char[][] board, String word, int count, int i, int j)
    {
        if(count == word.length()) return true ;
        if(i == -1 || i == board.length || j == -1 || j == board[0].length || board[i][j] != word.charAt(count) ) return false ;
        char temp = board[i][j] ;
        board[i][j] = '*' ;
        boolean found = dfs(board,word,count+1,i+1,j) ||  dfs(board,word,count+1,i-1,j) || dfs(board,word,count+1,i,j+1) || dfs(board,word,count+1,i,j-1) ;
        board[i][j] = temp ;
        return found ;
    }

        public static boolean isPowerOfThree(int n) {
        return recursion(n) ;   
      }
  
      public static boolean recursion( int n)
      {
          if(n < 0) return true ;
          if(n % 2 == 0) return false ;
          if(n % 5 == 0) return false ;
          return recursion(n/3) ;   
      }

    public static int countZero(int num, int count)
    {
        if(num % 10 == num)
        {
            return count ;
        }
        if(num % 10 == 0) count++ ;
        return countZero(num/10, count) ;
    }

    

}
