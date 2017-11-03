
public class Five_ConditionalControl01 {
	/**
	 * Exercise CheckPassFail (if-else): Write a program called CheckPassFail
	 * which prints "PASS" if the int variable "mark" is more than or equal to
	 * 50; or prints "FAIL" otherwise. The program shall always print “DONE”
	 * before exiting.
	 */

	
	public static void main(String args[]){
		checkPassFail(20);
		checkPassFail(60);
		
		
	}
	
	public static void checkPassFail(int value){
		
		
		if(value>=50){
			System.out.println("PASS");
		}else {
			
		System.out.println("FAIL");
		}
		System.out.println("DONE");
	}
}
