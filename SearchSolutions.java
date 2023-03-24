package MyProject;

public class SearchSolutions {

	public static void main(String[] args) {
		mySqrt(2147395600) ;

	}
	
      public int guessNumber(int n) {
        int i = 0 ;
        boolean isAsc = guess(i) < guess(n) ? true : false ;

            if(isAsc)
            {
                int start = 0 ;
                int end = n ;
                while( start <= end )
                {
                    int mid = start + (end - start ) / 2 ;
                        if (guess(mid) == 0 )
                        {
                            return mid ;
                        }else if(guess(mid) > 0 )
                        {
                            start = mid + 1 ;
                        }else if(guess(mid) < 0 )
                        {
                            end = mid -1 ;
                        }
                }

            }else
            {
                int start = n ;
                int end = 1 ;
                while( end <= start )
                {
                    int mid = start + (end - start) / 2 ;
                        if (guess(mid) == 0 )
                        {
                            return mid ;
                        }else if(guess(mid) > 0 )
                        {
                            end = mid + 1  ;
                        }else if(guess(mid) < 0 )
                        {
                            start = mid  - 1 ;
                        }
                }
            }
    return -1 ;
    }
    public static int mySqrt(int x) {
        int i = 0 ;
        while( i <= x )
        {
            if( (i * i <= x   && (i+1) * (i+1) > x ) || i * i == x  )
            {
                return i ;
               
            }
             i++;
        }
        return -1 ;
    }
}
