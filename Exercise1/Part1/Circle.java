/**
 * Circle - class to model a circle
 * ISTE-121 Bonus Lab A - student starter code
 * @author  D. Patric
 * @version 2205
 */

public class Circle {
   //Circle radius;
   private double radius;

   /**
    * constructor
    * @param _radius the radius of the circle
    */
   public Circle(double _radius ){
         if(isValid(_radius)){
            this.radius = _radius;
         }else{
            System.out.println("Radius can not be less than or equal to 0.0");
            System.out.println("Program Exiting");
            System.exit(0);
         }

   }

   // accessor

   public double getRadius() {
      return radius;
   }

   // mutator

   public void setRadius(double newRadius) {
      if(isValid(newRadius)){
         this.radius = newRadius;
      }else{
         System.out.println("Radius can not be less than or equal to 0.0");
         System.out.println("Program Exiting");
         System.exit(0);
      }
   }

   // methods

   /**
    * area - compute and return the area of the circle
    * @return the area of the circle
    */
   public double area() {
      return Math.PI * radius * radius;
   }

   /**
    * stretchBy - stretches circle size by multiplying
    * the radius by the factor provided.
    * @param factor the stretch factor
    */
   public void stretchBy(double factor ){
      if(isValid(factor)){
         radius = radius * factor;
      }else{
         System.out.println("The factor can not be less than or equal to 0.0");
         System.out.println("Program Exiting");
         System.exit(0);
      }
   }

   /**
    * Return a string representation of a circle.
    * @return a string representing this circle
    */
   public String toString() {
     // implement body here
      return "Circle: " + this.radius;
   }

   /**
    * isValid  - validates circle dimensions
    * the value has to be , x > 0.0
    * @param x the stretch factor
    * @return if value is greater than  0.0
    */
   public boolean isValid(double x) {
      return x > 0.0;
   }
}