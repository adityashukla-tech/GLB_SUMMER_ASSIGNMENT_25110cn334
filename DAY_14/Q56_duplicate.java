package summer_assignments.DAY_14;
import java.util.*;
public class Q56_duplicate {
    public static void main(String[] str) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Size of the Array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Enter the " + i + " Element: ");
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < size; i++) {
            for (int j = i+1; j <size; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println("Duplicates are: " + arr[i]);
                    break;
                }
            }
        }
        sc.close();
    }
}
