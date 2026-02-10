import java.util.Scanner;

public class EnergyToHeatWater {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double mass, initialTemp, finalTemp, energy;

        // Prompt user for inputs
        System.out.print("Enter the amount of water in kilograms: ");
        mass = input.nextDouble();

        System.out.print("Enter the initial temperature (Celsius): ");
        initialTemp = input.nextDouble();

        System.out.print("Enter the final temperature (Celsius): ");
        finalTemp = input.nextDouble();

        // Calculate energy
        energy = mass * (finalTemp - initialTemp) * 4184;

        // Display result
        System.out.println("The energy needed is " + energy + " joules.");

        input.close();
    }
}