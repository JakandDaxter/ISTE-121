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
   public Circle(double _radius ) {
   }

   // accessor

   public double getRadius() {
      return radius;
   }

   // mutator

   public void setRadius(double newRadius) {
   	radius = newRadius;
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
   public void stretchBy(double factor ) {
      radius = radius * factor;
   }

   /**
    * Return a string representation of a circle.
    * @return a string representing this circle
    */
   public String toString() {
     // implement body here
   }
}