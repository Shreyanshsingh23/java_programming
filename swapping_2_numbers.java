
import java.util.Scanner;

public class swapping_2_numbers {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers to swap ");
       int x=sc.nextInt();
       int y = sc.nextInt();
       System.out.println("Before swapping " + x + " " + y );
       x=x^y; 
       y =x^y;
       x=x^y;
       System.out.println("After swapping "+ x + " " + y );

    }
}
