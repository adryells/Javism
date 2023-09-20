package IFMA_2019;

import java.util.Scanner;

public class CelsiusToFarenheitConverter {

    public static void main(String[] args) {

        System.out.println();

        Scanner input = new Scanner(System.in);
        double farenheit_value, celsius_value;

        System.out.println("Digite a temp em f°: ");
        farenheit_value = input.nextDouble();

        celsius_value = (farenheit_value-32) * 5 / 9;
        System.out.println(farenheit_value + "f° em celsius é: " + celsius_value + "°c");
    }

}
