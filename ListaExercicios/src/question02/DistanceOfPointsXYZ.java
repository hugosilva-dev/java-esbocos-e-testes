package question02;

import java.util.Scanner;

public class DistanceOfPointsXYZ {
    public static void main(String[] args) {
        Scanner reading = new Scanner(System.in);
        System.out.print("Please enter the value of A point in format (x,y,z): ");
        String pointA = reading.nextLine();
        System.out.print("Please enter the value of B point in format (x,y,z): ");
        String pointB = reading.nextLine();

        String[] coordinateA = pointA.split(",");
        String[] coordinateB = pointB.split(",");

        double xA = Double.parseDouble(coordinateA[0]);
        double yA = Double.parseDouble(coordinateA[1]);
        double zA = Double.parseDouble(coordinateA[2]);
        double xB = Double.parseDouble(coordinateB[0]);
        double yB = Double.parseDouble(coordinateB[1]);
        double zB = Double.parseDouble(coordinateB[2]);

        Double distance = Math.sqrt(
                (Math.pow((xB - xA), 2)) + (Math.pow((yB - yA), 2)) + (Math.pow((zB - zA), 2))
        );
        System.out.printf("Distance = %.2f", distance);


    }
}
