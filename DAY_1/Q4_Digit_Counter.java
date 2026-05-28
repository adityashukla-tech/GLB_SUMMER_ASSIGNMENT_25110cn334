package summer_assignments;
import java.util.*;
public class Q4_Digit_Counter {
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int i=0;
    long num;
    System.out.print("Enter the Number: ");
    num=sc.nextLong();
    while(num>0){
        i++;
        num/=10;
    }
    System.out.print("The Number of Digits in the Number is: "+i);
}
}
