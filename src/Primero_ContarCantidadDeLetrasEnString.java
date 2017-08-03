

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
		
		StringBuilder finalWord = new StringBuilder();
		int count = 1;

		System.out.println(word.length());
		for (int i = 0; i < word.length(); i++) {
			if (i != word.length() - 1) {
				if (word.charAt(i) == word.charAt(i + 1)) {

					count++;

				} else {

					if (count > 1) {

						appendRepetedCharacter(word, finalWord, count, i);
						count = 1;
					} else {

						appendSingleCharacter(word, finalWord, i);
						count = 1;
					}

				}
			} else {

				if (word.charAt(i) == word.charAt(i-1)) {
					count++;
					appendRepetedCharacter(word, finalWord, count, i);
				} else
					appendSingleCharacter(word, finalWord, i);

			}
		}
		System.out.println(finalWord);
		return finalWord.toString();
	}

	private static void appendSingleCharacter(String word, StringBuilder finalWord, int i) {
		finalWord.append(String.valueOf(word.charAt(i)));
	}

	private static void appendRepetedCharacter(String word, StringBuilder finalWord, int count, int i) {
		finalWord.append(String.valueOf(count)).append(String.valueOf(word.charAt(i)));
	}
}
