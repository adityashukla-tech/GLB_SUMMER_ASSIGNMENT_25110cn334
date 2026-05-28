package summer_assignments.DAY_6;
import java.util.*;
public class Q23_count_set_bits {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int num=sc.nextInt();
        if(num==0){ System.out.print("Total Set Bits: "+0); sc.close(); return;}
        int temp=Math.abs(num);
        StringBuilder binary= new StringBuilder();
        while(temp>0){
            binary.append(temp%2);
            temp/=2;
        }
        binary.reverse();
        int i,count=0;
        for(i=0;i<binary.length();i++){
            if(binary.charAt(i)=='1'){
                count++;
            }
        }
        System.out.println("Binary Number: "+binary);
        System.out.print("Total Bits in Number is: "+count);
        sc.close();
    }
}
