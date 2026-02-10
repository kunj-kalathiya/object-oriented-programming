import java.util.Scanner;

public class ComputeBMI {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt user
        System.out.print("Enter weight in pounds: ");
        double weightPounds = input.nextDouble();

        System.out.print("Enter height in inches: ");
        double heightInches = input.nextDouble();

        // Conversions
        double weightKg = weightPounds * 0.45359237;
        double heightMeters = heightInches * 0.0254;

        // BMI calculation
        double bmi = weightKg / (heightMeters * heightMeters);

        // Display result
        System.out.println("BMI is " + bmi);

        input.close();
    }
}
