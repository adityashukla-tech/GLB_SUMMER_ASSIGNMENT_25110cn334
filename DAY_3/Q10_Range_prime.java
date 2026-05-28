package summer_assignments.DAY_3;
import java.util.*;
public class Q10_Range_prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2, i, j, flag = 0;
        System.out.print("Enter the Number to start from: ");
        num1 = sc.nextInt();
        System.out.print("Enter the Number to End from: ");
        num2 = sc.nextInt();
        if(num1>num2){
            int temp=num1;
            num1=num2;
            num2=temp;
        }
        boolean Found=false;
        for (j = num1; j <= num2; j++) {
            if(j<=1){
                continue;
            }
            flag=0;
            for (i = 2; i*i <= j; i++) {
                if (j % i == 0) {
                    flag = 1;
                    break;
                }
            }
            if(flag==0) {
                System.out.print(j + " ");
                Found=true;
            }
        }
        if(!Found){System.out.print("None Found");}
        sc.close();
    }
}
