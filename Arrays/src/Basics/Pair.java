package Basics;

public class Pair {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,4,7,6,5};
		
		for(int i=0;i<arr.length;i++) {
			
			for(int j=i+1;j<arr.length;j++) {
				System.out.println("("+arr[i]+","+arr[j]+")");
			}
		}
	}

}
