package Basics;
import java.util.Scanner;
public class arrayBasics {

	public static void main(String[] args) {
		
		int sum = call();
		System.out.println(sum);
	}
	
	public static int call(){

		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		int arr[]= new int[n];
		int sum=0;
		for(int i=0;i<n;i++){
			
			arr[i]=in.nextInt();
			sum= sum+arr[i];
		}
		
		return sum;
		
		
	}

}
