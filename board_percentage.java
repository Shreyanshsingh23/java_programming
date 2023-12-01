import java.util.Scanner;

public class board_percentage {
    
    public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter your Maths marks: ");
    float mathematics = sc.nextInt();

    System.out.print("Enter your English marks: ");
    float Eng = sc.nextInt();

    System.out.print("Enter your IT marks: ");
    float IT = sc.nextInt();

    System.out.print("Enter your Chemistry marks: ");
    float Chemistry = sc.nextInt();

    System.out.print("Enter your Physics marks: ");
    float Physics = sc.nextInt();
    // int total = Physics + Eng + IT + Chemistry + mathematics ;
    //  System.out.println(total + " =total marks");

    // double a = total / 500 ;
      
    float percentage = ((mathematics + Eng + IT + Chemistry + Physics) / 500) * 100;
    

    System.out.print("Your percentage in Boards Exam is: ");
    
    System.out.println(percentage + "%");
      


}
}