package hakerrank.algorithms.warmup;

import java.util.Scanner;

public class PlusMinus {

public static void calculateAverage(int[] arr){
        
        //int[] sum = new int[4];
        //List<Long> sum = new <Long>ArrayList();
        int countZeros = 0;
        int countPossitives = 0;
        int countNegatives = 0;
        
        for(int i = 0; i < arr.length ; i++){
        	if(arr[i]>0) {
        		countPossitives ++;
            }
        	else if (arr[i]<0) {
        		countNegatives ++;
            }
        	else countZeros ++;
        }
        
        System.out.println((float)countPossitives/arr.length);
        System.out.println((float)countNegatives/arr.length);
        System.out.println((float)countZeros/arr.length);
     
        //Float.
        //System.out.println(sum.get(0) + " " + sum.get(sum.size()-1));
            
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int[] arr = new int[size];
        
        for(int arr_i=0; arr_i < size; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        
        PlusMinus.calculateAverage(arr);
    }
    
}
