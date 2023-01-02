package MyProject;

public class IntermediateRecursion {

	public static int first = -1 ;
	public static int last = -1;
	
	public static void main(String[] args) {
		int n = 3 ;
		String name = "karishma";
//		towerOfHanoi(n,"Src","Helper","Dest" );
//		reverseString(name,0);
//		getFirstLastOccurance(name,'a',0);
//		System.out.println(last);
//		System.out.println(first);
		int arr[] = {1,2,3,4,2} ;
		System.out.println(arraySorted(arr,0));
	}
	
	public static void towerOfHanoi(int n,String src, String helper, String dest) 
	{
		if(n == 1) {
			
			System.out.println("Transfer disk "+n +" from "+src+" to "+dest);
			return ;
		}
		towerOfHanoi(n-1,src,dest,helper);
		System.out.println("Transfer disk "+n +" from "+src+" to "+dest);
		towerOfHanoi(n-1,helper,src,dest);
	}
	
	public static void reverseString(String str,int index ) 
	{
		if(str.length()-1 == index) 
		{
			System.out.println(str.charAt(index));
			return ;
		}
		reverseString(str,index+1);
		System.out.println(str.charAt(index));
	}
	
	public static void getFirstLastOccurance(String str, char character,int index) {

		if(str.length() -1 == index ) 
		{
			return ;
		}
		char currChar = str.charAt(index) ;
		if( currChar == character ) 
		{
			if( first == -1) {
				first = index;
			}else 
			{
				last = index ;
			}
		}

		getFirstLastOccurance( str, character, index+1);
	}
	
	public static boolean arraySorted(int[] arr,int index) 
	{
		if(arr.length -1  == index) 
		{
			return true ;
		}
		if(arr[index] > arr[index + 1]) 
		{
			return false ;
		}else 
		{
			return arraySorted(arr, index+1);
		}
	
	}

}
