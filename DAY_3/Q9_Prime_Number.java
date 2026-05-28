package summer_assignments.DAY_3;
import java.util.*;
public class Q9_Prime_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, i, flag = 0;
        System.out.print("Enter the Number: ");
        num = sc.nextInt();
        if(num<=1){
            System.out.print("Entered Number is NOT Prime");
            sc.close();
            return;
        }
        for (i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                flag = 1;
                break;
            }
        }
        if (flag == 1) {
            System.out.print("Entered Number is NOT prime");
        } else {
            System.out.print("Entered Number IS Prime");
        }
        sc.close();
    }
}
