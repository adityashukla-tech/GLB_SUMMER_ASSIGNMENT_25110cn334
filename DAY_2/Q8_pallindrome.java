package summer_assignments.DAY_2;
import java.util.*;
public class Q8_pallindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, i, rev = 0, onum;
        System.out.print("Enter the Number: ");
        num = sc.nextInt();
        if(num<0){
            System.out.print("Entered Number is NOT Palindrome");
            sc.close();
            return;
        }
        onum = num;
        while (onum > 0) {
            i = onum % 10;
            rev = (rev * 10) + i;
            onum /= 10;
        }
        if (rev == num) {
            System.out.print("The Number IS Palindrome ");
        } else {
            System.out.print("Entered Number is NOT Palindrome");
        }
        sc.close();
    }
}
