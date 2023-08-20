package MyProject ;

class SearchIn2dArray
{
    public static void main(String[] args) {
        int[][] matrix = {{1},{3}}; 
        int target = 0 ;
        searchMatrix(matrix, target);
    }
    public static boolean searchMatrix(int[][] matrix, int target) {
        
        if(matrix.length == 1)
        {
            return binarySearch(matrix,0 ,target) ;
        }
        int floorIndex = findFloor(matrix, target);
        return binarySearch(matrix, floorIndex ,target) ;
        
    }

    private static int findFloor(int[][] matrix, int target)
    {
        int start = 0 ;
        int end = matrix.length -1 ;
        int res = 0 ;
        while(start <= end)
        {
            int mid = start + (end - start) / 2 ;
            if(matrix[mid][0] <= target )
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

    private static boolean binarySearch(int[][] matrix,int floorIndex  ,int target)
    {
        int start = 0 ;
        int end = matrix[floorIndex].length -1 ;
        while(start <= end)
        {
            int mid = start + (end - start) / 2 ;
            if(matrix[floorIndex][mid] == target)
            {
                return true ;
            }
            if(matrix[floorIndex][mid] > target )
            {
                end = mid -1 ;
            }else
            {
                start = mid + 1 ;
            }
        }
        return false ;
    }
}