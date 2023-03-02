//package MyProject;
//
//public class Backtracing {
//
//		   public static void printPermutation(String str, String perm) {
//		       if(str.length() == 0) {
//		           System.out.println(perm);
//		           return;
//		       }
//		      
//		       for(int i=0; i<str.length(); i++) {
//		           char currChar = str.charAt(i);
//		           String newStr = str.substring(0, i) + str.substring(i+1);
////		            System.out.println(newStr);
//		           printPermutation(newStr, perm+currChar);
//		       }
//		   }
//		   public static void main(String args[]) {
////		       String str = "ta";
////		       printPermutation(str,  "");
//		   }
//
//		   
//		   public List<List<String>> nQueens(int n) 
//		   {
//			   List<List<String>> allBoards = new ArrayList<>() ;
//			   char[][] boards = new char[n][n];
//			   
//			   helper(allBoards, boards, 0);			   
//			   return allBoards ;
//		   }   
//		   
//		   												
//		   public static void helper( List<List<String>> allBoards, char [][] boards ,int col )
//		   {
//			   if(boards.length == col) 
//			   {
//				   saveBoard() ;
//				   return ;
//			   }
//			   
//			   for(i=0; i < boards.length ; i++) 
//			   {
//				   
//			   }
//			   
//		   }
//
//
//
//
//}
