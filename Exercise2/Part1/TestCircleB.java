package Part1;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.lang.Runtime;

public class TestCircleB {
        public static void main(String [] args) {

            try{

                Scanner scan = new Scanner(System.in);
                // read a radius of the circle from command line
                System.out.print("Enter a circle radius: ");

            double radius = scan.nextDouble();
            // Instantiate a Circle object
            Circle aCircle = new Circle(radius);
               // Test Factor
               //aCircle.stretchBy(Double.parseDouble(args[1]));

               // Test Radius Set
               // aCircle.setRadius(Double.parseDouble(args[2]));

               // Print current status of the circle
               System.out.print(aCircle);
           } catch(NoSuchElementException e) {
               System.out.println(e);
           } catch(Exception e) {
               System.out.println(e);
                Runtime.getRuntime().addShutdownHook(new Thread(() -> System.out.println("\nCTRL+C Program Stops. . .")));
           }


        }


    }

