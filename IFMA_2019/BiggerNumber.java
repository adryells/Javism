package IFMA_2019;

import java.util.*;

public class BiggerNumber {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("First number: ");
        int first_value = input.nextInt();

        System.out.print("Second number: ");
        int second_value = input.nextInt();

        if (first_value > second_value) {
            System.out.println("The first is bigger.");
        } else {
            System.out.println("The second is bigger.");
        }
    }

}
