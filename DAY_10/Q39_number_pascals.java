package summer_assignments.DAY_10;
import java.util.*;
public class Q39_number_pascals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Size: ");
        int num = sc.nextInt();
        int i, j;
        for (i = 1; i <= num; i++) {
            for (int spaces = 0; spaces < num - i ; spaces++) {
                System.out.print(" ");
            }
            for (j = 1; j <= i; j++) {
                System.out.print(j);
            }
            for( j=i-1;j>=1;j--){
                System.out.print(j);
            }
            System.out.println();
        }
        sc.close();
    }
}
