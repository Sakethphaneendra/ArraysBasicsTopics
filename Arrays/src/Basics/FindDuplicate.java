package Basics;
import java.util.Scanner;
public class FindDuplicate {

	public static int[] GetArray(int num) {
		Scanner in = new Scanner(System.in);
		
		int arr[] = new int[num];
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=in.nextInt();
		}
		return arr;
	}
	public static int FindDuplicate(int arr[]) {
		
		int duplicate=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					duplicate = arr[i];
				}
			}
		}
		
		return duplicate;
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the Size of Array :");
		int num = in.nextInt();
		int arr[] =GetArray(num);
		int k =FindDuplicate(arr);
		System.out.println("The Duplicate Value is " +k);
	}
	

}
