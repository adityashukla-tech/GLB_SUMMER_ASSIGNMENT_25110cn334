package summer_assignments;
import java.util.*;
public class Q13_Fibonacci_Series {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int num,i,first=0,second=1;
        System.out.print("Enter the Number: ");
        num=sc.nextInt();
        if(num<=0){
            System.out.print("Enter Positive Number: ");
            sc.close();
            return;
        }
        for(i=1;i<=num;i++){
            System.out.print(first+" ");
            int next=first+second;
            first=second;
            second=next;
        }
        sc.close();
    }
}
