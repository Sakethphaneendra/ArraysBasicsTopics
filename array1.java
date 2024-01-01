import java.util.*;
public class array1{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int n = in.nextInt();   
        int array[] = new int[n];
        for (int i = 0; i <array.length; i++) {
            System.out.print("Enter the element : ");
            array[i] = in.nextInt();     
        }
        System.out.println();

         for (int i = 0; i <array.length; i++) {
            System.out.println("The element is : " + array[i]);
                 
        }


    }
}