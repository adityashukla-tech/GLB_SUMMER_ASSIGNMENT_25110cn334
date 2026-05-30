package summer_assignments.DAY_13;
import java.util.*;
public class Q52_count_even_odd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size;
        System.out.print("Enter the Size of the Array: ");
        size = sc.nextInt();
        int[] arr = new int[size];
        if (size == 0) { System.out.print("No Array Exist"); sc.close(); return;}
        for (int i = 0; i < size; i++) {
            System.out.println("Enter the " + i + " Element: ");
            arr[i] = sc.nextInt();
        }int even=0,odd=0;
        for (int i = 0; i < size; i++) {
            if (arr[i] %2==0) {
                even++;
            }
           else {odd++;
            }
        }
        System.out.println("The Even Array element are: " + even);
        System.out.println("The Odd Array element are: " + odd);
        sc.close();
    }
}
