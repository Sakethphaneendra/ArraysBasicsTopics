package SearchingAlgos;

public class BinarySearch {

	public static void main(String[] args) {
		
		int arr[] = {1,4,8,14,19,24,29,35,50};
		
		int start;
		int end=arr.length-1;
		int ss =end;
		
		
		for(int i=0;i<end/2;i++)
		{
			start =i;
			swap(start,ss,arr);
			end--;
		
		}
		
	
			
		}
	
	public static void swap(int i ,int j, int[] arr) {
 
		System.out.println(arr[i] + " " + arr[j]);
		int temp;
		
		temp = i;
		i = (i+j)-temp;
		j=temp;
		System.out.println(arr[i] + " " + arr[j]);
		
	}
		
			
	
		
		
	

}
