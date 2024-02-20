
// This class is like a blueprint for an object we'll create.
// Public means it can be used anywhere.
public class Car {

    // called fields because they're defined in a class's body and not in a method
    // Much like defining interface properties in TS
  private String make;
  private String model;
  private String color;
  private int doors;
  private boolean convertible;

  // public bc it gives user a way to interact with the class
  public void describeCar(){
      System.out.println(doors + color + make + model + convertible);
  }

}
