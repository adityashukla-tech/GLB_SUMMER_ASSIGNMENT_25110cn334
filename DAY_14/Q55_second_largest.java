package summer_assignments.DAY_14;
import java.util.*;
public class Q55_second_largest {
    public static void main(String[] str){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Size of the Array: ");
        int size=sc.nextInt();
        int[] arr=new int[size];
        for(int i=0;i<size;i++){
            System.out.print("Enter the "+i+" Element: ");
            arr[i]=sc.nextInt();
        }
        int largest=Integer.MIN_VALUE,seclargest=Integer.MIN_VALUE;
        if(arr==null||arr.length<2){ System.out.print("Second Largest Does NOT Exist"); sc.close(); return;}
        for(int n:arr) {
            if (n > largest) {
                seclargest = largest;
                largest = n;
            } else if (n > seclargest && n != largest) {
                seclargest = n;
            }
        }
        System.out.println();
            if (seclargest==Integer.MIN_VALUE) {
                System.out.println("There is NO Second Largest number.");
            } else {
                System.out.println("The Second Largest number is: " +seclargest);
            }
            sc.close();
        }
    }
