package question03;

import java.util.Scanner;

public class DebugedCode {
        public static void main(String[] args) {
            Scanner reading = new Scanner(System.in);
            double x1, y1, x2, y2, distance;
            System.out.println("Please insert coordinates x and y in this order:");
            x1 = reading.nextDouble();
            y1 = reading.nextDouble();
            x2 = reading.nextDouble();
            y2 = reading.nextDouble();
            distance = Math.pow(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2), (double) 1/2);
            System.out.println("Distance: " + distance);
        }
    }
