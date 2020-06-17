/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oleo;

import java.util.Scanner;

/**
 *
 * @author aluno09
 */
public class kohoh {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double r2,altura,v;
        final double pi = 3.1415;
        System.out.println("raio: ");
        r2 = input.nextDouble();
        System.out.println("Altura: ");
        altura = input.nextDouble();
        v = pi * (r2 * r2) * altura;
        System.out.println("Volume: " + v);
    }
        
}
