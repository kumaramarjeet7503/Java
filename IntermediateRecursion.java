package MyProject;

public class IntermediateRecursion {

	public static int first = -1 ;
	public static int last = -1;
	public static boolean[] mappingArr =  new boolean[25] ; 
	
	public static void main(String[] args) {
		int n = 3 ;
		String name = "amaxxrjexxextx";
//		towerOfHanoi(n,"Src","Helper","Dest" );
//		reverseString(name,0);
//		getFirstLastOccurance(name,'a',0);
//		System.out.println(last);
//		System.out.println(first);
//		int arr[] = {1,2,3,4,2} ;
//		System.out.println(arraySorted(arr,0));
//		moveAllX(name, 0 , "",0);
//		removeDuplicate(name, 0,"");
		String str = "abc";
		printSubsiquence(str,0,""); 
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
	
	public static void moveAllX(String str, int i , String newArr,int count) 
	{
		if(str.length()-1 == i ) 
		{
			for (int j = 0; j < count; j++) {
				newArr += 'x';
			}
			System.out.println(newArr);
			return ;
		}
		if(str.charAt(i) == 'x') 
		{
			count++;
		}else 
		{
			newArr += str.charAt(i);
		}
		moveAllX(str,i+1,newArr,count);
		
	}
	
	public static void removeDuplicate(String str, int i, String newArr) 
	{
		if(str.length()-1 == i) 
		{
			System.out.println(newArr);
			return ;
		}
		if(mappingArr[str.charAt(i)-'a'] == false) 
		{
			newArr += str.charAt(i);
		}else 
		{
			mappingArr[str.charAt(i)-'a'] = true;
		}
		removeDuplicate(str,i+1,newArr);
	}
	
	public static void printSubsiquence(String str, int i, String res ) 
	{
		if(str.length()  == i) 
		{
			System.out.println(res);
			return ;
		}
		char currChar = str.charAt(i) ;
		printSubsiquence(str,i+1,currChar+res);
		printSubsiquence(str,i+1,res);
	}
}
