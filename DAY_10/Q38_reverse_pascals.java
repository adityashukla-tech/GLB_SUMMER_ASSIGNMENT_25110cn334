package summer_assignments.DAY_10;
import java.util.*;
public class Q38_reverse_pascals {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Size: ");
        int num=sc.nextInt();
        for(int i=num-1;i>=0;i--){
            for(int spaces = 0; spaces<num-i-1; spaces++){
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        sc.close();
    }
}
