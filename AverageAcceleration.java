import java.util.Scanner;

public class AverageAcceleration {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double v0, v1, t, a;

        // Prompt user for input
        System.out.print("Enter starting velocity (m/s): ");
        v0 = input.nextDouble();

        System.out.print("Enter ending velocity (m/s): ");
        v1 = input.nextDouble();

        System.out.print("Enter time (s): ");
        t = input.nextDouble();

        // Calculate average acceleration
        a = (v1 - v0) / t;
       
        // Display result
        System.out.printf("The average acceleration is %.2f m/s^2%n", a);

        input.close();
    }
}