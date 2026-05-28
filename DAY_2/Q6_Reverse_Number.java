package summer_assignments;
import java.util.*;
public class Q6_Reverse_Number {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num,i,rev=0;
        System.out.print("Enter the Number: ");
        num=sc.nextInt();
        while(num!=0){
            i=num%10;
            rev=(rev*10)+i;
            num/=10;
        }
        System.out.print("Reverse Number is : "+rev);
        sc.close();
    }
}
