package Basics;

public class Sort01 {

	public static void main(String[] args) {
		
		int arr[] = {1,1,0,1};
		
		int len = arr.length;
		int ss=len-1;
			
		for(int i=0;i<len;i++){
			for(int j=i+1;i<len;j++){
				int p1 =i;
				int p2 = ss-p1;
				if(arr[p1]==0 && arr[p2]==1) {
					System.out.println("Ok No Change" + p1 + "," +p2);
				}
			}
		}
		
		
		
			System.out.println("Ok No Change");
		
//		
//			
//			
//			if(arr[p1]==0 && arr[p2]==1) {
//				break;
//			}
//			else {
//				arr[p1]=1;
//				arr[p2]=0;
//			}
//			
//		}
//		for(int i=0;i<len;i++) {
//			System.out.print(arr[i] + ",");
//		}
//		

	}

}
