package hakerrank.algorithms.warmup;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class MiniMaxSum {
	public static void calculateMaxAndMin(int[] arr){
        
        //int[] sum = new int[4];
        List<Long> sum = new ArrayList();
        
        
        for(int i = 0; i < arr.length ; i++){
        	int s = 0;
            for(int j = 0; j < arr.length ; j++){
                if(i!=j){
                    s = s + arr[j];
                }
                 
            }
           sum.add(new Long (s));
        }
        
        java.util.Collections.sort(sum);
        for (Long object : sum) {
			System.out.println(object);
		}
        
        System.out.println(sum.get(0) + " " + sum.get(sum.size()-1));
            
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        for(int arr_i=0; arr_i < 5; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        
        MiniMaxSum.calculateMaxAndMin(arr);
    }
}

