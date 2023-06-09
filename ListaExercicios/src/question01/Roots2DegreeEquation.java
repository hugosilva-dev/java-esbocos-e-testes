package question01;

import java.util.Scanner;

import static java.lang.Double.NaN;

public class Roots2DegreeEquation {
    public static void main(String[] args) {
        Scanner reading = new Scanner(System.in);
        System.out.println("Consider the equation in format ax²+bx+c");
        System.out.print("Please enter the value of 'a': ");
        double a = reading.nextDouble();
        System.out.print("Please enter the value of 'b': ");
        double b = reading.nextDouble();
        System.out.print("Please enter the value of 'c': ");
        double c = reading.nextDouble();

        double deltaRoot = Math.sqrt(Math.pow(b, 2.0) - 4 * (a * c));
        if (Double.isNaN(deltaRoot)){
            System.out.println("This equation hasn't real roots.");
        }else {
            double root1 = (-b + deltaRoot) / (2 * a);
            double root2 = (-b - deltaRoot) / (2 * a);
            System.out.printf("S = {%.2f, %.2f}%n", root1, root2);
        }
    }
}
