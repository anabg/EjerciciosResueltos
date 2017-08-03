
public class Tercero_ReverseAWord {

	
	/*Write a program in Java to reverse any String without using StringBuffer?
			This is another classical Java programming question. You can reverse String in various way in Java but two programming technique is used to do e.g. Iteration and Recursion. Try solving this problem using Iteration first by using Java’s arithmetic operator and than look to implement a recursive solution. Here is one way to reverse String in Java without using StringBuffer.


			Read more: http://www.java67.com/2013/01/10-programming-questions-and-exercises.html#ixzz4oeydxq00*/
	
	
	
	public static void main(String args[]){
		
		String word1 = "casa";
		String finalWord1 = reverseWord(word1);
		
		String word2 = "perro";
		String finalWord2 = reverseWord(word2);
		
		String word3 = "avion";
		String finalWord3 = reverseWord(word3);
		
		String word4 = "mesa";
		String finalWord4 = reverseWord(word4);
		
		System.out.println(word1 + " reverse: " + finalWord1);
		System.out.println(word2 + " reverse: " + finalWord2);
		System.out.println(word3 + " reverse: " + finalWord3);
		System.out.println(word4 + " reverse: " + finalWord4);
	}

	private static String reverseWord(String word) {
		String finalWord = "";
		
		for(int i = word.length()-1; i>=0 ; i--) {
			
			finalWord = finalWord + word.charAt(i);
			
			
		}
		return finalWord;
	}
}
