package MyProject;

import java.util.Stack;
import java.util.Queue;

public class StackSolution {
    
    public static void main(String[] args) {
        removeDuplicates("abbaca") ;
    }

    public static String removeDuplicates(String s) {
        int i = 0 ;
        Stack<String> st = new Stack<String>() ;
        while( i < s.length())
        {
            if(!st.isEmpty() && st.peek().equals(s.charAt(i)+""))
            {
                st.pop() ;
            }else{
                st.push(s.charAt(i)+"") ;
            }
            
            i++;
        }

        StringBuilder sb = new StringBuilder() ;
        while(!st.isEmpty())
        {
            sb.append(st.pop()+"") ;
        }
        sb.reverse() ;
        String ans = new String(sb) ;
        return ans; 
    }

    public static String removeOuterParentheses(String s) {
        Stack<String> st1 = new Stack<>() ;
        Stack<String> st2 = new Stack<>() ;
        int  i = 0 ;
        StringBuilder sb = new StringBuilder() ;
        while(i < s.length())
        {
            String stringChar = s.charAt(i) + "" ;
            if(stringChar.equals("(") && st1.isEmpty() ) { st1.push(stringChar); i++; continue ; };
            if(stringChar.equals("(")){ sb.append(stringChar) ;st2.push(stringChar) ;} ;

            if(stringChar.equals(")") && st2.isEmpty()){ st1.pop() ; i++ ; continue ; };
            if(stringChar.equals(")")) { sb.append(stringChar); };
            i++ ;
        }
        String ans = new String(sb) ;
        return ans ;
    }

    }
