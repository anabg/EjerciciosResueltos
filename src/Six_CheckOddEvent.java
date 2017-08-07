/**
 * Exercise CheckOddEven (if-else): Write a program called CheckOddEven which
 * prints "Odd Number" if the int variable “number” is odd, or “Even Number”
 * otherwise. The program shall always print “BYE!” before exiting.
 * 
 * @author æAnita
 *
 */
public class Six_CheckOddEvent {

	public static void main(String args[]){
		
		checkOddEven(8);
		checkOddEven(16);
		checkOddEven(1);
		checkOddEven(9);
		
		
	}
	
	
	public static void checkOddEven(int value){
		
		if(value%2!=0){
			
			System.out.println("Odd Number");
		}
		else {
			
			System.out.println("Even Number");
		}
		
		System.out.println("BYE");
	}
}
