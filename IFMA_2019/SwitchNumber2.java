package IFMA_2019;

import java.util.Scanner;

public class SwitchNumber2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int first_value, second_value, aux_switch;

        System.out.println("First value: ");
        first_value = input.nextInt();

        System.out.println("Second value: ");
        second_value = input.nextInt();

        aux_switch = first_value;
        first_value = second_value;
        second_value = aux_switch;

        System.out.println("Valores trocados!!!");
        System.out.println("A: " + first_value + " B: " + second_value);

    }

}
