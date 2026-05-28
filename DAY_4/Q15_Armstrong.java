package summer_assignments.DAY_4;
import java.util.*;
import java.math.*;
public class Q15_Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, r, d = 0, onum, o;
        System.out.print("Enter the Number: ");
        num = sc.nextInt();
        onum = num;
        o = String.valueOf(Math.abs(num)).length();
        num=Math.abs(num);
        while (num > 0) {
            r = num % 10;
            num /= 10;
            d += (int) Math.pow(r, o);
        }
        if (onum>=0 && onum == d) {
            System.out.print("Entered Number is Armstrong Number");
        } else {
            System.out.print("Entered Number is NOT Armstrong Number");
        }
        sc.close();
    }
}
