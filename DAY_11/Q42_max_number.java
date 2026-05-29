package summer_assignments.DAY_11;
import java.util.*;
public class Q42_max_number {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number 1: ");
        int num1=sc.nextInt();
        System.out.print("Enter the Number 2: ");
        int num2=sc.nextInt();
        System.out.print("Enter the Number 3: ");
        int num3=sc.nextInt();
        if(num1==num2 && num2==num3){ System.out.print("NO Maximum , all are same:"); sc.close(); return; }
        System.out.print("Result Maximum: "+maxx(num1,num2,num3));
        sc.close();
    }
    public static int maxx(int n1,int n2,int n3){
        if(n1>n2 && n1>n3) { return n1; }
        else return Math.max(n2,n3);
    }
}
