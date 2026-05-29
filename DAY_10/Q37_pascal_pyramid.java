package summer_assignments.DAY_10;
import java.util.*;
public class Q37_pascal_pyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Size: ");
        int num = sc.nextInt();
        int i,j;
        for( i=0;i<num;i++) {
            for (int spaces = 0; spaces < num - i - 1; spaces++) {
                System.out.print(" ");
            }
            for (j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        sc.close();
    }

}
