package summer_assignments.DAY_1;
import java.util.*;
public class Q2_Multiplication_Table {
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int num,i,multi=0;
    System.out.print("Enter the Numebr: ");
    num=sc.nextInt();
    for(i=1;i<=10;i++){
        multi=num*i;
        System.out.println(num+" x "+i+" = "+multi);
    }
}
}

