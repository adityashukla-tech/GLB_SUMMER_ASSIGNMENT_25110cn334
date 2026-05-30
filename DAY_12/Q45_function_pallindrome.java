package summer_assignments.DAY_12;
import java.util.*;
public class Q45_function_pallindrome {
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the Number: ");
    int num= sc.nextInt();
    if(palindrome(num)){
        System.out.print("Result Is Palindrome: ");
    }
    else {
        System.out.print("Result Is NOT Palindrome: ");
    }
    sc.close();
  }
  public static boolean palindrome(int n){
    int onum=n,d=0,r;
    while(onum!=0){
         r=onum%10;
         d=d*10+r;
        onum/=10;
    }
      return n == d;
  }
}
