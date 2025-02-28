import java.util.Scanner;

public class CelsiusFahrenheit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float temperature;
        int option;

        while (true) {
            try {
                System.out.print("Enter the temperature: ");
                temperature = scanner.nextFloat();

                System.out.println("\nConvert to:");
                System.out.println("[1] - Celsius");
                System.out.println("[2] - Fahrenheit");
                System.out.println("[3] - Exit");
                System.out.print("Option: ");
                option = scanner.nextInt();

                if (option == 1) {
                    float celsius = (temperature - 32) * 5 / 9; // F -> C
                    System.out.printf("%.2f°F is %.2f°C%n", temperature, celsius);
                } else if (option == 2) {
                    float fahrenheit = (temperature * 9 / 5) + 32; // C -> F
                    System.out.printf("%.2f°C is %.2f°F%n", temperature, fahrenheit);
                } else if (option == 3) {
                    System.out.println("Exiting...");
                    break;
                } else {
                    System.out.println("Invalid option. Please enter 1, 2, or 3.");
                }
            } catch (Exception e) {
                System.out.printf("Invalid input! Please enter a valid number. More: %s\n", e);
                scanner.next();
            }
        }

        scanner.close();
    }
}
