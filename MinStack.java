package MyProject;

class MinStack {
    private int[] arr ;
    private int size = 10 ;
    private int top = -1 ;
    private int min = Integer.MAX_VALUE ;

    public MinStack() {
        arr = new int[size] ;        
    }
    
    public void push(int val) {
        if(isFull())
        {
            size = size * 2 ;
            int[] temp =  new int[size];
            for(int i = 0 ; i < arr.length; i++)
            {
                temp[i] = arr[i] ;
            }
            arr = temp ;
        }
        top++ ;
        arr[top] = val ;
        if(min >= val) min = val ;
    }
    
    public void pop() {
        top = top - 1 ;
        if(isEmpty()) return ;
        int temp = top ;
        min = arr[top] ;
        while(temp >= 0)
        {
            if(arr[temp] <= min ) min = arr[temp] ; 
            temp--;
        }
    }
    
    public int top() {
        if(isEmpty()) return 0 ;
        return arr[top] ;
    }
    
    public int getMin() {
        return min ;
    }

    public boolean isFull()
    {
        if(arr.length == size) return true ;
        return false ;
    }

    public boolean isEmpty()
    {
        if(top < 0) return true ;
        return false ;
    }
}
