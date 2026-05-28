package summer_assignments.DAY_6;
import  java.util.*;
public class Q22_binary_decimal {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Binary: ");
        long binary=sc.nextLong();
        long deci=0,temp;
        long power=0;
        temp=Math.abs(binary);
        while(temp>0){
            long r=temp%10;
            if(r>1) {
                System.out.println("Invalid Binary Input! Only 0 and 1 are allowed.");
                sc.close();
                return;
            }
            temp/=10;
            deci+=r*(long)Math.pow(2,power);
            power++;
        }
        System.out.print("Decimal: "+deci);
        sc.close();
    }
}
