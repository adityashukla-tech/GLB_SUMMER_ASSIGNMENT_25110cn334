package summer_assignments.DAY_14;
import java.util.*;
public class Q54_frequency_element {
public static void main(String[] str){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the Size: ");
    int size=sc.nextInt();
    int[] arr=new int[size];
    for(int i=0;i<size;i++){
        System.out.print("Enter the "+i+" Element: ");
        arr[i]=sc.nextInt();
    }
    System.out.print("Enter the Number you want to search: ");
    int sch=sc.nextInt();
    int count=0;
    for(int i=0;i<size;i++){
        if(arr[i]==sch){
            count++;
        }
    }
    System.out.println();
    if(count==0){ System.out.print("No Searched Number Exist");}
    else{ System.out.print("Number frequency is: "+count);}
    sc.close();
}
}
