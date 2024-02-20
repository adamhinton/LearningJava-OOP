public class Main {
    public static void main(String[] args){

        // Note: Primitive data types are never null. #doors prints as 0 here but strings print as null
        // Default values:
        // Boolean: false
        // byte/short/int/long/char: 0
        // double/float: 0.0

        Car car = new Car();
        // Can't do this since these are private fields
        // Can't SOP them either
//        car.make = "Porsche";
//        car.model = "Carrera";
//        car.color = "Red";
        car.describeCar();

    }
}