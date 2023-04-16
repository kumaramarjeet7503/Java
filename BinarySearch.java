package MyProject;

public class BinarySearch {

    public static void main(String[] args)
    {
        int[] arr = {5,4,10,8,14,6} ;
     System.out.println(findPeakElement(arr)) ;    
    }  


    public static int findPeakElement(int[] arr)
    {
        int start = 0 ;
        int end = arr.length - 1 ;
        while(start <= end )
        {
            int mid = start + (end - start) / 2 ;

            if(  arr[mid] == arr[arr.length -1 ] && arr[mid] > arr[mid - 1] )
            {
                return arr[mid] ;
            }
            if(  arr[mid] == 0 && arr[mid] > arr[mid + 1] )
            {
                return arr[mid] ;
            }
            if( arr[mid - 1 ] < arr[mid] && arr[mid] > arr[mid + 1 ]  )
            {
                return arr[mid] ;
            }
            if(arr[mid] < arr[mid + 1] )
            {
                start = mid +  1 ;
            }else if(arr[mid] < arr[mid - 1] )
            {
                end = mid - 1 ;
            }
            
        }
        return -1 ;
    }

    public static int minimumDifferenceElement(int[] arr, int target)
    {
        int start = 0 ; 
        int end = arr.length -1 ;
       
        while( start <= end )
        {
            int mid = start + (end - start ) /2 ;
            if(arr[mid] == target )
            {
                return arr[mid] ;
            }
            if(arr[mid] > target )
            {
                end = mid - 1 ;
            }else
            {
                start = mid + 1 ;
            }
        }
        int min = -1 ;
        int  startDiff =  Math.abs(arr[start] - target ) ;
        int endDiff =  Math.abs(arr[end] - target ) ;
        return startDiff > endDiff ? arr[end] : arr[start] ;
    }

    public static int findFirst1OccurenceInBinarySortedArray(int[] arr)
    {
        int target = 1  ;
        int start = 0 ; 
        int end = 1  ;
        int pivot = -1 ;

        while(arr[end] != target )
        {
            end = end * 2 ;
            int search =  sortedBS(arr, start  , end  ,target) ;
            if(search != -1 )
            {
                pivot = search ;
            }else
            {
                start = end ;
                
            }
        }
        return  firstOccurenceBS(arr,  0 , pivot , target) ;

    }

    public static int findElementInInfiniteArray(int arr[], int target)
    {   
        int start = 0 ;
        while(arr[start] != target) 
        {
            
            int end = start * 2 + 1 ;
            int search =  sortedBS(arr, start  , end  ,target) ;
            if(search != -1 )
            {
                return search ;
            }else
            {
                start = end;
            }
            
        }
        return -1 ;
    }

    public static char findNextAlphabet(char[] charArr, char letter )
    {
        int start = 0 ;
        int end = charArr.length - 1 ;
        char res = '#' ; 
        while(start <= end)
        {
            int mid = start + (end - start )/ 2 ;
            if(charArr[mid]  <= letter )
            {
          
                start = mid + 1  ;
              
            }else 
            {
                res = charArr[mid] ;
                end = mid - 1 ;
            }
        }
        return res ;
    }

    public static int findCeiling(int[] arr, int target )
    {
        int start = 0 ;
        int end = arr.length -1 ;
        int res = -1 ;
        while(start <=  end)
        {
            int mid = start +  (end - start) / 2 ;
        
            if(arr[mid] <= target )
            {
               
                start = mid + 1 ;
            }else
            {
                res = mid ;
                end = mid -1 ;
            }
        }
        return res ;
    }

    public static int findFloor(int[] arr, int target )
    {
        int start = 0 ;
        int end = arr.length -1 ;
        int res = -1 ;
        while(start <=  end)
        {
            int mid = start +  (end - start) / 2 ;
        
            if(arr[mid] <= target )
            {
                res = mid ;
                start = mid + 1 ;
            }else
            {
                end = mid -1 ;
            }
        }
        return res ;
    }

    public static int findElementInNearlySortedArray(int arr[],int target)
    {
        int start = 0 ;
        int end = arr.length -1 ;
        while(start  <= end)
        {
            int mid = start + (end - start )/ 2 ;
            if(arr[mid] == target )
            {
                return mid ;
            }else if( mid - 1 >= 0 && arr[mid -1 ]  == target )
            {
                return mid -1 ;
            }else if (mid + 1 <= arr.length - 1 && arr[mid + 1] == target )
            {
                return mid + 1 ;
            }

            if(arr[mid] > target )
            {
                end = mid - 2 ;
            }else
            {
                start  = mid + 2 ;
            }

       
        }
        return -1 ;
    }

    public static int findMinimumElementInRotatedArray(int arr[], int target)
    {
        int pivot = rotationCount(arr) ;
        int start = 0 ;
        int end = arr.length -1 ;
        if(pivot == -1)
        {
          return   sortedBS( arr,start  ,end ,   target) ;
        }
        
        if(arr[end]  > target )
        {
           return   sortedBS(arr, pivot, end, target) ;
        }else
        {
           return  sortedBS(arr, start, pivot - 1, target) ;
        }

    }

    public static int rotationCount(int[] arr)
    {
        int start = 0 ;
        int n = arr.length -1 ;
        int end = arr.length - 1  ;
        while(start <= end)
        {
            int mid = start + (end - start )/2 ;
            int prev = (n + mid - 1) % n ;
            int next = (mid + 1  ) % n  ;
            if(arr[mid]  < arr[prev] && arr[mid] < arr[next] )
            {
                // You have find the minimum element
                return mid ;
            }else if(arr[start] <= arr[mid] )
            {
                // You are in the sorted part of array
                start = mid + 1 ;
            }else if (arr[mid] <= arr[end] )
            {
                end = mid - 1 ;
            }
        }

        return end - start ;
    }

    public static int countElementBS(int[] arr, int target )
    {
        int firstOccurence = firstOccurenceBS(arr, 0 , arr.length - 1 , target) ;
        int lastOccurence = lastOccurenceBS( arr,target) ;
        int count  = lastOccurence - firstOccurence + 1 ;

        return count ;
    }

    public static int lastOccurenceBS(int[] arr, int target)
    {
        int start = 0 ;
        int end = arr.length ;
        int res = -1 ;
        while(start <= end)
        {
            int mid = start +  (end - start) / 2 ;
            if(arr[mid] == target )
            {
                res = target ;
                start = mid + 1 ;
            }
            if(arr[mid] > target )
            {
                end = mid - 1 ;
            }else
            {
                start = mid + 1 ;
            }
        }

        return res ;  
    }

    public static int firstOccurenceBS(int[] arr, int start , int end ,int target)
    {
        // int start = 0 ;
        // int end = arr.length ;
        int res = -1 ;
        while(start <= end)
        {
            int mid = start +  (end - start) / 2 ;
            if(arr[mid] == target )
            {
                res = mid ;
                end = mid -1 ;
            }
            if(arr[mid] > target )
            {
                end = mid - 1 ;
            }else
            {
                start = mid + 1 ;
            }
        }

        return res ; 
    }

    public static int orderAgnosticBS(int[] arr,int target)
    {
        int start = 0 ;
        int end = arr.length ;

        if(arr[start] == arr[end] )
        {
            if(arr[start] == target )
            {
                return start ;
            }
        }

        if(arr[start] > arr[end] )
        {
            return  reverseSortedBS(arr,0 , arr.length -1 ,  target) ;
        }else
        {
            return  sortedBS(arr,0 , arr.length -1 ,  target) ;
        }

    }

    public static int reverseSortedBS(int[] arr, int start  , int end  , int target)
    {
        // int start = 0 ;
        // int end = arr.length -1 ;

        while(start <= end) 
        {
            int mid = start  + (end - start)/ 2 ;
            if(arr[mid] == target )
            {
                return mid ;
            }
            if(arr[mid] > target )
            {
                start = mid + 1 ;
                end = mid - 1 ;
            }else
            {
                end = mid - 1 ;
            }
        }
        return -1 ;

    }

    public static int sortedBS(int[] arr, int start  , int end  , int target)
    {
        // int start = 0 ;
        // int end = arr.length -1 ;

        while(start <= end) 
        {
            int mid = start  + (end - start)/ 2 ;
            if(arr[mid] == target )
            {
                return mid ;
            }
            if(arr[mid] > target )
            {
                end = mid - 1 ;
            }else
            {
                start = mid + 1 ;
            }
        }
        return -1 ;
    }
}


