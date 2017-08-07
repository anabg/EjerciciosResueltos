/**
 * Exercise SumAndAverage (Loop): Write a program called SumAndAverage to
 * produce the sum of 1, 2, 3, ..., to 100. Also compute and display the
 * average. The output shall look like: The sum is 5050 The average is 50.5
 * 
 * @author ÊAnita
 *
 */
public class Seven_SumAndAverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		sumAndAverage(4);
		sumAndAverageWithWhile(4);

	}

	public static void sumAndAverage(int value) {
		int result = 0;
		float average = 0f;
		for (int i = 0; i <= value; i++) {

			result = result + i;

		}

		average = (float) result / value;
		System.out.println("result " + result);
		System.out.println("average " + average);

	}
	
	
	public static void sumAndAverageWithWhile(int value){
		
		int result = 0;
		int count = 1;
		
		float average = 0f;
		
		while (count <= value){
			System.out.println(count);
			System.out.println(result);
			
			result = result + count;
			count ++;
			
		}
		
		average = (float) result / value;
		System.out.println("result " + result);
		System.out.println("average " + average);
	}
}
