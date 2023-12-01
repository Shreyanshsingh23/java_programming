public class inheritence{

    public static void main(String[] args){
     Human Ram = new Human(5,9);
    System.out.println(Ram.eyes + "\n" + Ram.ears );
    System.out.println("No.of hands of Ram are = " + Ram.hands);
    // Human Ram1 = new Human(5,4);
    // System.out.println(Ram1.hands);

     
    // Human Shyam = new Human();
    // System.out.println("No.of hands of Shyam are = " + Shyam.hands);
    

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
        
    this.eyes = eyessss;
    this.ears = earssss;
    }
     // this constructor is non-parametrized
     Human(){
        this(50,60);
        this.hands = 50;
     }
    

}