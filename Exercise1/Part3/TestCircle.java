/**
 * TestCircle - class to test the Circle class 
 * ISTE-121 Bonus Lab A - student starter code
 * @author  D. Patric
 * @version 2205
 */

public class TestCircle {
   public static void main(String [] args) {

      // read a radius of the circle from command line
      double radius = Double.parseDouble(args[0]);

      // Instantiate a Circle object
      Circle aCircle = new Circle(radius);

      // Test Factor
      //aCircle.stretchBy(Double.parseDouble(args[1]));

      // Test Radius Set
     // aCircle.setRadius(Double.parseDouble(args[2]));
   
      // Print current status of the circle
      System.out.print(aCircle);
   }
}