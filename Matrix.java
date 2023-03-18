package MyProject;

import java.util.Arrays;
import java.util.*;

public class Matrix {

	public static void main(String[] args) {
		
	
//		matrixMultiplication(matA, matB);
//		waveTraversal( matB ) ;			 
		
		int[][] matA = {{0,1},{1,1}} ;
		int[][] matB = {{1,0},{0,1}} ;
//		exitPoint(matB) ;
//		 System.out.println(findRotation(matA, matB));
//		System.out.println(Arrays.toString(sumZero(5)));
		int[][] matrix = {{1,1,4,3},
						  {9,3,8,3},
						  {1,6,7,2},
						  {9,3,3,4}} ;

//		shellRotate( matrix  , 1, 1 ) ; 
//		for (int i =0 ; i < matrix.length ; i++) 
//		{
//			System.out.println(Arrays.toString(matrix[i])); 
//		}
//		 System.out.println(luckyNumbers(matrix)); 
		
//		int[] mat = {1,2,3,4,5} ;
		diagonalTraversal(matrix) ;
	
	}
	
	public static void diagonalTraversal(int[][] mat) 
	{
			for(int row =0 ; row < mat.length; row++) 
			{
				int i = 0 ;
				for( int col = row  ; col < mat[0].length; col++) 
				{
					System.out.println(mat[i][col]);
					i++ ;
				}
			}

	}
	
	public static void shellRotate(int[][] matrix  , int s, int r ) 
	{

		int[] arr =  transferShellToArray(matrix, s) ;
		rotateArray(arr, r) ;
//		System.out.println(Arrays.toString(arr));
		transferArrayToShell(matrix, arr, s) ;
	}
	
	public static int[] transferShellToArray(int[][] mat, int s) 
	{
		int minRow = s ;
		int minCol = s ;
		int maxRow = mat.length - s ;
		int maxCol = mat[0].length - s ;
		int arrLength =  2 *( maxRow - minRow + maxCol - minCol ) -4  ;
		int[] arr = new int[arrLength] ;
		int i = 0 ;
		while(true) 
		{
			if(i == arrLength ) 
			{
				break ;
			}
		
			
			for(int j = minRow; j < maxRow; j++) 
			{
				arr[i] = mat[j][minCol] ;
				i++;
			}
			minCol++ ;
			
			for(int j = minCol ; j < maxCol; j++) 
			{
				arr[i] = mat[maxRow-1][j] ;
				i++;
			}
			maxRow-- ;
			
			for(int j = maxRow-1; j > minRow; j--) 
			{
				arr[i] = mat[j][maxCol-1] ;
				i++;
			}
			maxCol-- ;
			
			for(int j = maxCol; j > minRow; j--) 
			{
				arr[i] = mat[minRow][j] ;
				i++;
			}
		}
		return arr ;
	}
	
	public static void rotateArray(int[] arr, int r) 
	{
		int start = 0 ;
		int startEnd = arr.length - 1 -r ;
		int endStart = arr.length -r ;
		int end = arr.length ;
		
		int i = start ;
		while( i <= startEnd/2 ) 
		{
			int temp = arr[i] ;
			arr[i]  = arr[startEnd-i] ;
			arr[startEnd-i]  = temp ;
			i++ ;
		}
		
		int j = endStart ;
		int mid = end - endStart ;
		mid =  endStart + mid/2 ;
		int s = 0;
		while( j < mid ) 
		{
			int temp = arr[j] ;
			arr[j]  = arr[end-1-s] ;
			arr[end-1-s]  = temp ;
			j++ ;
			s++;
		}
		
		int k = start ;
		while( k < end/2 ) 
		{
			int temp = arr[k] ;
			arr[k]  = arr[end -1 - k] ;
			arr[end -1 - k]  = temp ;
			k++ ;
		}
	}
	
	public static int[] transferArrayToShell(int[][] mat, int[] arr ,int s) 
	{
		int minRow = s ;
		int minCol = s ;
		int maxRow = mat.length - s ;
		int maxCol = mat[0].length - s ;
		int arrLength = arr.length ;  ;

		int i = 0 ;
		while(true) 
		{
			if(i == arrLength ) 
			{
				break ;
			}
		
			
			for(int j = minRow; j < maxRow; j++) 
			{
				 mat[j][minCol] = arr[i] ;
				i++;
			}
			minCol++ ;
			
			for(int j = minCol ; j < maxCol; j++) 
			{
			 mat[maxRow-1][j] = 	arr[i]  ;
				i++;
			}
			maxRow-- ;
			
			for(int j = maxRow-1; j > minRow; j--) 
			{
			  mat[j][maxCol-1] = 	arr[i] ;
				i++;
			}
			maxCol-- ;
			
			for(int j = maxCol; j > minRow; j--) 
			{
				  mat[minRow][j]  = arr[i] ;
				i++;
			}
		}
		return arr ;
	}
	
    public static List<Integer> luckyNumbers (int[][] matrix) {
        List<Integer> sol = new ArrayList<Integer>(matrix.length) ;

        for(int row =0 ; row < matrix.length ; row++ )
        {
            for(int col =0; col < matrix.length; col++)
            {
                boolean flag = true ;
                int i = 0;
                int min = 0;
                while(i < matrix.length)
                {
                    if(matrix[row][col] > matrix[row][i])
                    {
                        min = i;
                    }
                    i++;
                }
                int j =0 ;
                while(j < matrix.length)
                {
                    if(matrix[row][min] < matrix[j][min])
                    {
                        flag = false ;
                        break ;
                    } 
                    j++;
                }

                if(flag == true )
                {
                    sol.add(matrix[row][col]);   
                }
                break ;
            }
        }
        return sol ;
    }
	
    public int[] sumZero(int n) {
        int[] sol = new int[n] ;
        int j = 1;  
        for(int i =1; i <= n ; i++ )
        {
            if(n % 2 == 0)
            {
                if(i <= n){
                sol[i-1] = i ;
                sol[i] = -i ;
                }
                i = i +1 ;
            }else 
            {
                sol[n/2] = 0 ;
               
                if(i < n ){
                    sol[n/2 - j ] = i ;
                    sol[n/2 + j ] = -i ;
                    j++ ;
                    
                }
                 i = i+1 ;
            }
           
        }
    return sol ;
    }
	
    public static boolean findRotation(int[][] mat, int[][] target) {
        int[][] rotation = new int[mat[0].length][mat.length] ;
        int arrayElement = rotation[0].length * rotation.length ;
        int rotate = 0;
        while(rotate != 4 ){
         int count = 0; 
        for(int row = 0 ; row < rotation.length; row++ )
        {
            for(int col = 0; col < rotation.length; col++)
            {
                rotation[row][col] = mat[col][row] ;
            }
            int i = 0;
            int length = rotation.length; 
            while( i < length )
            {
                int temp = rotation[row][i] ;
                rotation[row][i] = rotation[row][length-i-1] ;
                rotation[row][length-i-1] = temp ;

                if(rotation[row][i] == target[row][i])
                {
                    count++ ;
                }
                i++;
            }
         }
        if(count == arrayElement )
        {
            return true; 
        }
        rotate++ ;
        }
        return false ;
    }
	
	public static void spiralTraversal(int[][] mat ) 
	{
		int minc = 0;
	 	int maxr = mat.length -1 ;
	 	int minr= 0;
	 	int maxc = mat[0].length -1;
	 	int total = mat.length * mat[0].length ;
	 	int count = 0;
	 	while(true)
	 	{
	 		if(total == count) 
	 		{
	 			break ;
	 		}

	 		for(int i = minr;  i <= maxr && count < total ; i++ )
	 		{
	 			System.out.println(mat[i][minc]);
	 			count++;
	 		}
	 		minc++ ;
	 		for( int i = minc ; i <= maxc && count < total ; i++  ) 
	 		{
	 			System.out.println(mat[maxr][i]);
	 			count++;
	 		}
	 		maxr--;
	 		for(int i = maxr; i >= minr && count < total ;i-- ) 
	 		{
	 			System.out.println(mat[i][maxc]);
	 			count++;
	 		}
	 		maxc--;
	 		for(int i = maxc; i >= minc && count < total ; i--) 
	 		{
	 			System.out.println(mat[minr][i]);
	 			count++;
	 		}
	 		minr++ ;
	 		
	 	}
	}
	
	public static void matrixMultiplication(int[][] matA, int[][] matB ) 
	{
		int[][] ans = new int[matA.length][matB[0].length] ;
		
		for(int row =0 ; row < ans.length; row++ ) 
		{
			for(int col = 0; col < ans[row].length; col++ ) 
			{
				int length = 0;
				int sum = 0 ;
				while(length < ans[0].length ) 
				{
					ans[row][col] += matA[row][length] * matB[length][col] ; 
					length++;
				}
			}
		}
		
		for(int row = 0; row < ans.length; row++) 
		{
			System.out.println(Arrays.toString(ans[row]) ); 
		}
		
	}

	public static void waveTraversal(int[][] mat) 
	{
		for(int row=0; row < mat.length; row++) 
		{
			for(int col = 0; col < mat[row].length; col++) 
			{
				if(row % 2 == 0) 
				{
					System.out.print(mat[col][row]);
				}else 
				{
					System.out.print(mat[mat.length-col-1][row]);
				}
				
			}
			System.out.println();
		}
		
	}

	public static void exitPoint(int[][] mat) 
	{
		int dir =0 ;
		int i = 0; 
		int j =0 ;
		while(true) 
		{
			dir = (dir + mat[i][j] ) % 4 ;
			
			if(dir == 0) 
			{
				j++ ;
			}else if(dir == 1) 
			{
				i++;
			}else if(dir == 2) 
			{
				j--;
			}else if(dir == 3) 
			{
				i--;
			}
			
			if(i < 0) 
			{
				i++;
				break;
			}else if( j == mat.length ) 
			{
				j--;
				break ;
			}
			else if(j < 0  ) 
			{
				j++ ;
				break ;
			}
			else if( i == mat.length ) 
			{
				i--;
				break ;
			}
		}
		
		System.out.println(i);
		System.out.println(j);
	}
	
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int[][] sol = new int[r][c];
        int matrixElement = mat.length * mat[0].length ;
        int solElement = sol.length *sol[0].length ;
        if(solElement == matrixElement)
        {
            int i = 0 ;
            int j = 0 ;
            for(int row = 0 ; row < mat.length; row++ )
            {
                for(int col = 0 ; col < mat[0].length; col++)
                {
                    while(true)
                    {
                           
                           if(j == sol[0].length -1 )
                           {
                            sol[i][j] = mat[row][col] ;
                              i++;
                              j = 0 ;
                           }else
                           {
                                sol[i][j] = mat[row][col] ;
                               j++;
                           }  break ;
                        }
                        
                }
            }
        }else
        {
            return mat ;
        }
        return sol ;
    }

}
