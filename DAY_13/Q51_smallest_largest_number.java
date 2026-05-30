package summer_assignments.DAY_13;
import java.util.*;
public class Q51_smallest_largest_number {
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
            }
            int largest = arr[0], smallest = arr[0];
            for (int i = 0; i < size; i++) {
                if (arr[i] > largest) {
                    largest = arr[i];
                }
                if (arr[i] < smallest) {
                    smallest = arr[i];
                }
            }
            System.out.println("The Largest of Array element is: " + largest);
            System.out.println("The Smallest of Array element is: " + smallest);
            sc.close();
        }

}
