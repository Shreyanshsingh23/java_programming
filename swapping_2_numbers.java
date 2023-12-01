
import java.util.Scanner;

public class swapping_2_numbers {
    public static void main(String[] args){
       int x=4;
       int y=5;
       System.out.println("Before swapping "+x+" "+y);
       x=x^y; // x=1
       y=x^y; // y =4
       x=x^y;  // x = 5
       System.out.println("After swapping "+x+" "+y);

    }
}
