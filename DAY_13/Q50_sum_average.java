package summer_assignments.DAY_13;
import java.util.*;
public class Q50_sum_average {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size;
        System.out.print("Enter the Size of the Array: ");
        size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Enter the " + i + " Value: ");
            arr[i] = sc.nextInt();
        }
        int sum=0;
        for (int i = 0; i < size; i++) {
           sum+=arr[i];
        }
        double avg=(double)sum/size;
        System.out.println("The Sum of Array element is: "+sum);
        System.out.println("The Average of Array element is: "+avg);
        sc.close();
    }
}
