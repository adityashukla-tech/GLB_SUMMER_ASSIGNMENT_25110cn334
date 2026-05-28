package summer_assignments.DAY_1;
import java.util.*;
import java.util.Scanner;
public class Q1_Sum_N_Natural_Number {
    public static void main(String[] args){
    int num,sum=0,i;
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the Number til Summing: ");
    num=sc.nextInt();
    for( i=1;i<=num;i++) {
        sum+=i;
    }
    System.out.println("Answer: "+sum);
    sc.close();
    }
}
