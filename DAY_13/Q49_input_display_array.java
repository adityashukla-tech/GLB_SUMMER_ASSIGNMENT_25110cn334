package summer_assignments.DAY_13;
import  java.util.*;
public class Q49_input_display_array {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int size;
        System.out.print("Enter the Size of the Array: ");
        size=sc.nextInt();
        int[] arr=new int[size];
        for(int i=0;i<size;i++){
            System.out.print("Enter the "+i+" Value: ");
            arr[i]= sc.nextInt();
        }
        System.out.println("The Array is : [ ");
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println(" ] ");
        sc.close();
    }
}
