package MyProject;

import java.util.*;

public class Strings {
	public static void main(String args[]) {
		
		String firstName = "Amarjeet" ;
		String lastName = "Amarjeet" ;
		String fullName = firstName + lastName ;
		
//		System.out.println(fullName.length());
//		printByChar(fullName);
//		compareString(firstName, lastName);
//		stringBuild();
		reverseChar(fullName);
	}
	
	public static void printByChar(String character) {
		
		for(int i = 0 ; i<character.length(); i++) {
			System.out.println(character.charAt(i));
		}
	}
	
	public static void compareString(String char1, String char2 ) {
		if(char1.compareTo(char2) == 0) {
			System.out.println("String are equal");
		}else
		{
			System.out.println("Strings are not equal");
		}
	}
	
	public static void stringBuild() {
		StringBuilder sb = new StringBuilder("Tony");
		System.out.println(sb);
		sb.setCharAt(0,'P');
		System.out.println(sb);
		sb.insert(0, 'S');
		System.out.println(sb);
		sb.append("This is appended data");
		System.out.println(sb);
	}
	
	public static void reverseChar(String character) {
		for (int i = character.length() -1 ; i > 0 ; i--) {
			System.out.print(character.charAt(i));
		}
	}
}
