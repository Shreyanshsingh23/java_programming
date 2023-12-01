import java.util.Scanner;

class Main{
    public static void main(String[] args) {

        System.out.println("Enter 2 numbers");
        Scanner sc=new Scanner(System.in);
        int a =sc.nextInt();
        int b =sc.nextInt();
        int sum = a+ b;
        System.out.print("Sum of two given numbers is: ");
        System.out.println(   sum);
    }
}