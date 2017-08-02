
public class Primero_ContarCantidadDeLetrasEnString {
	public static void main(String[] args) {

		String word = "aaaabccdddef";

		char[] a = word.toCharArray();
		StringBuilder endWord = new StringBuilder();
		int count = 1;

		System.out.println(a.length);
		for (int i = 0; i < a.length; i++) {
			if (i != a.length - 1) {
				if (a[i] == a[i + 1]) {

					count++;

				} else {

					if (count > 1) {

						endWord.append(String.valueOf(count)).append(String.valueOf(a[i]));
						count = 1;
					} else {

						endWord.append(String.valueOf(a[i]));
						count = 1;
					}

				}
			} else {

				if (a[i] == a[i - 1]) {
					count++;
					endWord.append(String.valueOf(count)).append(String.valueOf(a[i]));
				} else
					endWord.append(String.valueOf(a[i]));

			}
		}
		System.out.println(endWord);

	}
}
