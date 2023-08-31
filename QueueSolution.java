package MyProject;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class QueueSolution {
    
   Queue<Integer> data ;
    public RecentCounter() {
        data = new LinkedList<>() ;    
    }
    
    public int ping(int t) {
        data.add(t) ;
        int val = t - 3000 ;
        while( !data.isEmpty() && data.element() < val )
        {
            data.remove() ;
        }
        return data.size() ;  
    }
    
     public Queue<Integer> modifyQueue(Queue<Integer> q, int k) {
        // add code here.
        if(q.isEmpty() || q.size() < k ) return q ;
        Stack<Integer> st = new Stack<>() ;
        Queue<Integer> ans = new LinkedList<>() ;
        
        int i = 0 ;
        while(i < k)
        {
            st.push(q.remove()) ; 
            i++;
        }
        
        while(!st.isEmpty())
        {
            ans.add(st.pop()) ;
        }
        
        while(!q.isEmpty())
        {
            ans.add(q.remove()) ;
        }
        return ans ;
        
    }
    }
