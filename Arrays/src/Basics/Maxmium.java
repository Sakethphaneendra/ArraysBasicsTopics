package Basics;

import java.util.Scanner;

public class Maxmium {
	
	public static int[] takeInput()
	{
		Scanner in = new Scanner(System.in);
		System.out.print("The Number of element in Array : ");

		int n = in.nextInt();
		int arr[]= new int[n];
		for(int i=0;i<n;i++){
			
			arr[i]=in.nextInt();
			
		}
		return arr;
	}
	
	public static int getMax(int[] arr){
		
		int max=0;
		
		for(int i=0;i<arr.length;i++) {
			if(max<arr[i]) {
				max =arr[i];
			}
		}
		
		return max;
	}
	public static void main(String[] args) {
		
		int arr[] = takeInput();
		int max = getMax(arr);
		
		System.out.println("The Maxmium element is : "+max);
	}

}
