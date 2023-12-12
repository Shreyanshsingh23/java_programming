public class return_value{

    public static void main(String[] args){
        Car Verna = new Car();
        System.ot.println(Verna.wheels);
    }

    class Car{
        int wheels;
        int brakes;
        int seats;
       
        Car(){
            this.wheels = 4;
        }
    }

}