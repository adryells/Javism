package IFMA_2019;

import java.util.*;

public class DescNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Initial number: ");
        int initial_number = input.nextInt();

        while (initial_number > 0) {
            initial_number--;
            System.out.println(initial_number);
        }

    }
}
