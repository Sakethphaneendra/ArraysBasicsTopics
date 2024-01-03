package Basics;
import java.util.Scanner;




public class alternativeSwap {
	
	public static int[] takeArrayInput(int n){
		Scanner in=new Scanner(System.in);
		int arr[] = new int[n];
		for(int i=0;i<n;i++) {
			arr[i]= in.nextInt();
		}

		return arr;
	}
	
	public static int[] arraySwap(int[] arr){
		
		int i=0,n=arr.length;
		for(;i<n;i+=2) {
			int j=i+1;
			if(i<(n-1)) 
			{
				arr[i]=arr[i]+arr[j];
				arr[j]=arr[i]-arr[j];
				arr[i]=arr[i]-arr[j];
			}
		}
		return arr;	
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner i=new Scanner(System.in);
		System.out.print("Enter the input : ");

		int n= i.nextInt();
		
		
		int array[]=takeArrayInput(n);
		System.out.println();

		int array2[]=arraySwap(array);
		for(int j=0;j<n;j++){
			System.out.print(array2[j] + " ");
		}
	}

}
