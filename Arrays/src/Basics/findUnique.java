package Basics;
import java.util.Arrays;
import java.util.Scanner;
public class findUnique {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter the size of array : ");
		int n = in.nextInt();
		int[] arr= new int[n];
		for(int i=0;i<arr.length;i++) {
			System.out.print("Enter the Element : ");
			arr[i] = in.nextInt();
		}
		
		int a,b;
		for(int i=0;i<n;i++) {
			a= arr[i];
			for(int j=i+1;j<n;j++) {
				b= arr[j];
				
				if(a!=b) {
					
				}
				else {
					arr[i] =0;
					arr[j] =0;
				}
			}
	
		}
		int[] arr2 = arr;	
		
		for(int m=0;m<n;m++) {
			if(arr2[m] !=0) {
			System.out.println("The Unique Value is " + arr2[m] );

			}

		}
		
		
	}
	
}

