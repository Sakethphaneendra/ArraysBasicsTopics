package Basics;
import java.util.Scanner;
public class findElements {
	
	public static int[] GetArray() {
		
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the Size : ");
		int n = in.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++) {
			
			arr[i]=in.nextInt();
		}
		return arr;
	}
	public static int GetPosition(int arr[]) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the element : ");

		int val = in.nextInt();
		int index =-1;
		
		in.close();
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i] == val) {
				index=i;
				break;
			}
		}
		
		return index;
		
	}
	
	public static void main(String[] args) {
		
		int arr[] = GetArray();
		int index = GetPosition(arr);
		System.out.println("Index at : "+index);
	}

}
