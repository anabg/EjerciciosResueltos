

/*Compress String with character and its count. 
Example: "aaabbba" -> compress -> "a3b3a1”*/ 

public class Primero_ContarCantidadDeLetrasEnString {
	public static void main(String[] args) {

		String word = "aaaabccdddef";
		System.out.println(" Original Word: " + word + " compressed word " + compressString(word));
		
		String word2 = "abbcccddddeeeeefffff";
		System.out.println(" Original Word: " + word2 + " compressed word " + compressString(word2));
		
		String word3 = "ana";
		System.out.println(" Original Word: " + word3 + " compressed word " + compressString(word3));
		

	}

	private static String compressString(String word) {
		

		//char[] a = word.toCharArray();
		StringBuilder endWord = new StringBuilder();
		int count = 1;

		System.out.println(word.length());
		for (int i = 0; i < word.length(); i++) {
			if (i != word.length() - 1) {
				if (word.charAt(i) == word.charAt(i + 1)) {

					count++;

				} else {

					if (count > 1) {

						endWord.append(String.valueOf(count)).append(String.valueOf(word.charAt(i)));
						count = 1;
					} else {

						endWord.append(String.valueOf(word.charAt(i)));
						count = 1;
					}

				}
			} else {

				if (word.charAt(i) == word.charAt(i-1)) {
					count++;
					endWord.append(String.valueOf(count)).append(String.valueOf(word.charAt(i)));
				} else
					endWord.append(String.valueOf(word.charAt(i)));

			}
		}
		System.out.println(endWord);
		return endWord.toString();
	}
}
