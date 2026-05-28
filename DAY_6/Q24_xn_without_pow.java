package summer_assignments.DAY_6;
import java.util.*;
public class Q24_xn_without_pow {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int i, num, n;
    double result = 1.0;
    System.out.print("Enter the Number: ");
    num = sc.nextInt();
    System.out.print("Enter the power = ");
    n = sc.nextInt();
    if (num == 0 && n < 0) {
        System.out.print("result: Undefined");
        sc.close();
        return;
    }
    else if (num == 0 && n >= 0) {
        System.out.print("Result: " + (n == 0 ? 1 : 0));
        sc.close();
        return;
    }
    else if(num!=0 && n==0){System.out.print("Result: "+1);
        sc.close();
        return;
    }
    boolean Neg=n<0;
    int ab=Math.abs(n);
    for(i=1;i<=ab;i++){
        result=result*num;
    }
    if(Neg){ result=1.0/result; }
    System.out.print("Result: "+result);
    sc.close();
}
}
