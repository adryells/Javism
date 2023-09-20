package IFMA_2019;

import java.util.Scanner;

public class IMCCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your weight (in kilograms): ");
        double weight = getPositiveDoubleInput(scanner);

        System.out.print("Enter your height (in meters): ");
        double height = getPositiveDoubleInput(scanner);

        double imc = calculateIMC(weight, height);
        System.out.printf("Your BMI is: %.2f%n", imc);

        interpretIMC(imc);

        scanner.close();
    }

    private static double getPositiveDoubleInput(Scanner scanner) {
        double input;

        while (true) {
            try {
                input = Double.parseDouble(scanner.nextLine());
                if (input > 0) {
                    return input;
                } else {
                    System.out.print("Please enter a positive value: ");
                }
            } catch (NumberFormatException e) {
                System.out.print("Invalid input. Please enter a valid number: ");
            }
        }
    }

    private static double calculateIMC(double weight, double height) {
        return weight / (height * height);
    }

    private static void interpretIMC(double imc) {
        System.out.print("Interpretation: ");
        if (imc < 16) {
            System.out.println("Severely underweight");
        } else if (imc < 16.9) {
            System.out.println("Underweight");
        } else if (imc < 24.9) {
            System.out.println("Normal weight");
        } else if (imc < 29.9) {
            System.out.println("Overweight");
        } else if (imc < 34.9) {
            System.out.println("Obesity Class 1 (Moderate)");
        } else if (imc < 39.9) {
            System.out.println("Obesity Class 2 (Severe)");
        } else {
            System.out.println("Obesity Class 3 (Very severe or morbidly obese)");
        }
    }
}
