package Basics;

public class findUnique {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {10,20,5,20,10};
		
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				int uni=arr[j];
				if(arr[i]!=arr[j] && arr[i]!=uni)  {
					
					uni=arr[j];
					System.out.println(arr[j]);
					
				}
				else {
					arr[j]=0;
				}
			}
		
		

		}
		
	}

}
