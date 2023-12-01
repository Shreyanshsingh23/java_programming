import java.util.Scanner;

public class prime_in_java {

    public static void main(String[] args){
   
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the value of n");
    int n = sc.nextInt();

    for(int a = 2; a < n ;a++){

        if(n%a == 0){
           System.out.println("Given number is not a Prime Number");
           return;

        }

        else{
            continue;
        }

         
    }
     
  System.out.println("Given number is a Prime Number");
    
}
}