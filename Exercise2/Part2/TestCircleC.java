import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;


public class TestCircleC {
        public static void main(String [] args) {

            double radius = 0;

            do{
            try{

                Scanner scan = new Scanner(System.in);
                // read a radius of the circle from command line
                System.out.print("Enter a circle radius: ");

            radius = scan.nextDouble();

           } catch(InputMismatchException e) {
               System.out.println(e);
           } catch(NoSuchElementException e) {
                System.out.println("   CTRL+C Program stops. . .");
                System.exit(0);
           } catch(Exception e) {
                System.out.println(e);
           }}while(radius>0);

            Circle aCircle = new Circle(radius);
            System.out.print(aCircle);
        }

    }

