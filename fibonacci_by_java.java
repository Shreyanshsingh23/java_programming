import java.util.Scanner;

public class fibonacci_by_java {
    
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n = sc.nextInt();

        int a = 0;

        int b = 1;

        System.out.print(a  + "," + b + ",");

        int sum = 0;
        int i = 1;

        for(i=1;i<=n;i++){
        sum = a + b;

        a = b;
        b = sum;
        
        System.out.print(sum + ",");


        }
    }
}
