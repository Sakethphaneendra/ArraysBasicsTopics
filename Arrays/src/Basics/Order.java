package Basics;
import java.util.Scanner;
public class Order {
	
	public static void Approch1(int n){
		int a=0,b=n-1;
		int array[] = new int[n];	
		for(int i=1;i<=n;i++) {
			array[a]=i;
			if(i<n) {array[b]=++i;}	
			a=a+1;
			b=b-1;
		}

		for(int i=0;i<n;i++) {
			System.out.print(array[i] + ",");
		}
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter size of array : ");
		int n= in.nextInt();
		Approch1(n);
		
		int array2[] = new int[n];
		System.out.println();

		System.out.println(array2);
	
		
		
	}
}
