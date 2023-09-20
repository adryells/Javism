package IFMA_2019;

import java.util.Scanner;

public class SwitchNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("First Number: ");
        int first_number = input.nextInt();

        System.out.print("Second Number: ");
        int second_number = input.nextInt();
        System.out.print("A: " + second_number + " B: " + first_number);
    }
}
