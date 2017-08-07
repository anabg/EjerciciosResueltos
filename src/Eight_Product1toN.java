
/**
 * Exercise Product1ToN (Loop): Write a program called Product1ToN to compute
 * the product of integers 1 to 10 (i.e., 1󫎿�...�10). Try computing the
 * product from 1 to 11, 1 to 12, 1 to 13 and 1 to 14. Write down the product
 * obtained and explain the results. Hints: Declare an int variable called
 * product (to accumulate the product) and initialize to 1. Try: Compute the
 * product from 1 to 11, 1 to 12, 1 to 13 and 1 to 14. Write down the product
 * obtained and decide if the results are correct. Try: Repeat the above, but
 * use long to store the product. Compare the products obtained. Hints: Product
 * of 1 to 13 (=6227020800) is outside the range of int [-2147483648,
 * 2147483647], but within the range of long. Take note that computer programs
 * may not produce the correct answer even though everything seems correct!
 * 
 * @author 鍭nita
 *
 */
public class Eight_Product1toN {

	public static void main(String args[]) {

		getProduct1yoN(2);
		getProduct1yoN(4);
		getProduct1yoN(13);
	}

	public static void getProduct1yoN(int value) {
		
		
		long product = 1;
		
		for(int i =1; i<= value; i++){
			
			product = (long) product * i;
			
		}

		
		System.out.println(" The product since 1 to " + value + " is " + product);
	}

}
