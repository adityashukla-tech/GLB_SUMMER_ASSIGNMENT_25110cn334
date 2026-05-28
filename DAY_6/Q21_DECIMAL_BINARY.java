package summer_assignments.DAY_6;
import java.util.*;
public class Q21_DECIMAL_BINARY {
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the Number: ");
    int num=sc.nextInt();
    if(num==0){ System.out.print("Binary: "+0); sc.close(); return;}
    int temp=Math.abs(num);
    StringBuilder binary= new StringBuilder();
    while(temp>0){
       binary.append(temp%2);
       temp/=2;
    }
    System.out.print("Binary: "+binary.reverse());
    sc.close();
}
}
