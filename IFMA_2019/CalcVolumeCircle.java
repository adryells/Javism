package IFMA_2019;

import java.util.Scanner;

public class CalcVolumeCircle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double squaredRadius, height, volume;
        final double pi = 3.1415;
        
        System.out.println("Radius: ");
        squaredRadius = input.nextDouble();
        
        System.out.println("Height: ");
        height = input.nextDouble();
        
        volume = pi * (squaredRadius * squaredRadius) * height;
        System.out.println("Volume: " + volume);
    }

}
