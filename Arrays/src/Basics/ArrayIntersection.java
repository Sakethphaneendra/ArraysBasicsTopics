package Basics;

public class ArrayIntersection {

	public static void main(String[] args) {
		
		int arr1[] = {2,6,1,2};
		int arr2[] = {1,2,3,4,2};
		int com[] = new int[arr2.length];
		
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr2.length;j++) {
				if(arr1[i]==arr2[j]) {
					System.out.print(arr1[i] + " ,");
					arr1[i]=0;
					arr2[j]=0;
					break;
				}
			}
		}
	

	}

}
