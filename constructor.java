public class constructor{

    public static void main(String[] args){
     Human Ram = new Human(4,5);
    System.out.println("No.of eyes of Ram = " + Ram.eyes + "\n" + "No.of ears of Ram = " + Ram.ears );
    System.out.println("No.of hands of Ram are = " + Ram.hands);
    
    Human Shyam = new Human();
    System.out.println( "No.of hands of Shyam are = " +  Shyam.hands);
     
    

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
    
    }
     // this constructor is non-parametrized
     Human(){
        
        this.hands = 50;
     }
    

}