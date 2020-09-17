package kapittel2;

import java.util.Scanner;

public class GrossPayCalculator {

        public static void main(String args[]){
            // 1. Get the number of hours worked
            System.out.println("Tast inn antall utførte arbeidstimer den ansatte har jobbet");
            Scanner scanner = new Scanner(System.in);
            int arbeidsTimer = scanner.nextInt();

            //2. get the hourly rate
            System.out.println("Tast inn timesatsen for den ansatte");
            double timeSats = scanner.nextDouble();
            scanner.close();
            //3. Multiply hours and pay rate
            double bruttoLonn = arbeidsTimer * timeSats;
            //4. Display result
            System.out.println("Brutto lønn for den ansatte blir: "+ bruttoLonn + " Kroner");
        }
    }