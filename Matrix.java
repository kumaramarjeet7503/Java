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
		int[][] matrix = {{1,10,4,2},
						  {9,3,8,7},
						  {15,16,17,12}} ;
		 System.out.println(luckyNumbers(matrix)); 
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
	
}
