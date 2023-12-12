public class constructor{

    
public static void main(String[] args){
     Human Ram = new Human(4,5);
    System.out.println("No.of eyes of Ram = " + Ram.eyes + "\n" + "No.of ears of Ram = " + Ram.ears );
    System.out.println("No.of hands of Ram are = " + Ram.hands);
     
    

    } 
}
// base class
class Human{
     
    // the Human class has three fileds
     int eyes ;
     int ears;
     int hands;
     
     

     // the Human class has one constuctor
     
     // this constructor is paramertized

     Human(int eyessss, int earssss){
    this();    
    this.eyes = eyessss;
    this.ears = earssss;
    c:\Effective 100
    }
     // this constructor is non-parametrized
     Human(){
        
        this.hands = 50;
     }

     // Human class has 3 methods

     public  void increase_hands(int increment){

        hands = hands + increment;
     }
    
     public void increase_eyes(int increment_eyes){

        eyes = eyes + increment_eyes;

     }

     // toString() method to display details of Human

     public String toString(){
        return("No. of eyes are = " + eyes + "No. of ears are = " + ears + " No. of hands are = " + hands );
     } 


}