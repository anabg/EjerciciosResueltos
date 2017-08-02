
public class Primero_ContarCantidadDeLetrasEnString {

	public static void main(String[] args) {

		String word = "aaaabccdddef";

		char[] a = word.toCharArray();
		StringBuilder endWord = new StringBuilder();
		int count = 1;

		for (int i = 1; i <= a.length; i++) {

			if (a[i - 1] == a[i]) {
				count++;

			} else {
				if (count > 1) {

					endWord.append(String.valueOf(count)).append(String.valueOf(a[i - 1]));
					count = 1;
				} else {

					endWord.append(String.valueOf(a[i - 1]));
					count = 1;
				}

			}
		}

		System.out.println(endWord);

	}
}
