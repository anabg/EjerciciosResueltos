
public class Segundo_IdentificarPalindromos {

	public static void main(String args[]) {

		String word1 = "neuquen";
		String word2 = "";
		String word3 = "oso";
		String word4 = "reconocer";
		String word5 = "hola";
		String word6 = "perro";

		//isPalindrome(word1);
		System.out.println(word1 + " is palindrome " + isPalindrome2(word1) );
		//System.out.println(word2 + " is palindrome " + isPalindrome2(word2) );
		System.out.println(word3 + " is palindrome " + isPalindrome2(word3) );
		System.out.println(word4 + " is palindrome " + isPalindrome2(word4) );
		System.out.println(word5 + " is palindrome " + isPalindrome2(word5) );
		System.out.println(word6 + " is palindrome " + isPalindrome2(word6) );

	}

	/*private static boolean isPalindrome(String word1) {
		boolean isPalindrome = true;
		
		for (int i = 0; i < word1.length(); i++) {

			for (int j = word1.length()-1; j >= 0; j--) {

				System.out.println("i " + i);
				System.out.println("j " + j);
				if (i != j) {

					if (word1.charAt(i) != word1.charAt(j)) {
						isPalindrome = false;	
						break;
						
					}
				}
			}
		}
		
		return isPalindrome;
	}
	*/
	
	private static boolean isPalindrome2(String word1) {
		boolean isPalindrome = true;
		
		//for (int i = 0; i < word1.length(); i++) {

			//for (int j = word1.length()-1; j >= 0; j--) {
				int i =0 ,j=word1.length()-1; 
				/*System.out.println("i " + i);
				System.out.println("j " + j);*/
				while (i != j) {
					
					System.out.println("i " + i);
					System.out.println("j " + j);
					i++;
					j--;
					if (word1.charAt(i) != word1.charAt(j)) {
						isPalindrome = false;	
						break;
						
					}
				//}
			//}
		}
		
		return isPalindrome;
	}
}
