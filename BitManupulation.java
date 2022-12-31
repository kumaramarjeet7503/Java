package MyProject;

public class BitManupulation {
		public static void main(String args[]) {
			
			int num = 6; // 0110
			int pos = 3;
			int bitMask = 1<<pos;
			int bit = 1 ;
			
			getBit(bitMask, num);
			setBit(bitMask, num);
			clearBit(bitMask, num);
			updateBit(bitMask, num, bit);
		}
		
		private static void getBit(int bitMask, int num ) {
			
			String output = "";
			if((bitMask & num) == 0 ) {
			     output = "The number is 0";
			}else {
				output = "The number is 1";
			}
			System.out.println(output);
		}
		
		private static void setBit(int bitMask, int num) {
			String output = "The number is " ;
			int newNum = bitMask | num ;
			System.out.println(output+newNum);
		}
		
		private static void clearBit(int bitMask, int num) {
			String output = "The number is ";
			int newNum = (~bitMask) & num ;
			System.out.println(output+newNum);
		}
		
		private static void updateBit(int bitMask, int num, int bit) {
			if(bit == 1) {
				setBit(bitMask,num);
//				The number is 14
			}else {
				clearBit(bitMask,num);
//				The number is 6
			}
		}
}