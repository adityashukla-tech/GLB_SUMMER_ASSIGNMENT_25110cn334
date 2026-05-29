package summer_assignments.DAY_9;
import java.util.*;
public class Q35_repeated_character  {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Size : ");
        int num=sc.nextInt();
        char alpha='A';
        for(int i=0;i<num;i++){
            for(int j=1;j<=i+1;j++){
                System.out.print(alpha+" ");
            }
            alpha++;
            System.out.println();
        }
        sc.close();
    }
}
