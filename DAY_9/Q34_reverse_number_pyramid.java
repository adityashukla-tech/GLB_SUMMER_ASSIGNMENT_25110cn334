package summer_assignments.DAY_9;
import java.util.*;
public class Q34_reverse_number_pyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Size : ");
        int num = sc.nextInt();
        for (int i = num; i >=1; i--) {
            for (int j = 1; j <=i; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
