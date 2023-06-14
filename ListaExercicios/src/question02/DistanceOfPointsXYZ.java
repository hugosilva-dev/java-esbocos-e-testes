package question02;

import java.util.Comparator;
import java.util.Scanner;

public class DistanceOfPointsXYZ {
    public static void main(String[] args) {
        Scanner reading = new Scanner(System.in);
        System.out.print("Please enter the value of A point in format (x,y,z): ");
        String pointA = reading.nextLine();
        System.out.print("Please enter the value of B point in format (x,y,z): ");
        String pointB = reading.nextLine();

        String[] coordenadasA = pointA.split(",");
        String[] coordenadasB = pointB.split(",");

        double xA = Double.parseDouble(coordenadasA[0]);
        double yA = Double.parseDouble(coordenadasA[1]);
        double zA = Double.parseDouble(coordenadasA[2]);
        double xB = Double.parseDouble(coordenadasB[0]);
        double yB = Double.parseDouble(coordenadasB[1]);
        double zB = Double.parseDouble(coordenadasB[2]);

        Double distance = Math.sqrt(
                (Math.pow((xB - xA), 2)) + (Math.pow((yB - yA), 2)) + (Math.pow((zB - zA), 2))
        );
        System.out.printf("Distance = %.2f", distance);


    }
}
