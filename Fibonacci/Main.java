package Fibonacci;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	
        public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the length of the elements");
		int count = scanner.nextInt();
		int[] arr = new int[count];
		
		System.out.println("Enter the number");
		int value = scanner.nextInt();
		
		 arr[0] = value;
		 arr[1] = arr[0];
		 
		
		 
		System.out.println(Arrays.toString(arr(arr,count)));
		
	}
	
	public static int[] arr(int[] arr, int lenghtArr) {
		
		int temp;
		
		for(int i = 1; i < lenghtArr - 1; i++) {

			 temp = arr[i] + arr[i - 1]; 
			 arr[i + 1] = temp;			
		}
		
		return arr;
	}
}