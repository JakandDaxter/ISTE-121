public class TestCircleA {
        public static void main(String [] args) throws Exception, ShapeException, ArrayIndexOutOfBoundsException, NumberFormatException {

            try{
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
           }catch(ArrayIndexOutOfBoundsException | NumberFormatException e) {
               System.out.println(e);
           } catch(Exception e) {
               System.out.println(e);
           }

        }
    }

