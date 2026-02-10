import java.util.Scanner;

public class RunwayLength {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double v, a, length;

        // Prompt user for input
        System.out.print("Enter take-off speed (m/s): ");
        v = input.nextDouble();

        System.out.print("Enter acceleration (m/s^2): ");
        a = input.nextDouble();

        // Calculate runway length
        length = (v * v) / (2 * a);

        // Display result
        System.out.println("The minimum runway length is " + length + " meters.");
        input.close();
    }
}