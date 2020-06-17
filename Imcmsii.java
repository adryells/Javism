package com.jorjao;
import java.util.*;
public class Imcmsii {

  public static void main(String[] args) {
   double imc;
   Scanner input = new Scanner(System.in);
   System.out.println("Calculadora de Imc");
   System.out.println("Peso: ");
   double peso = input.nextDouble();
   System.out.println("Altura: ");
   double altura = input.nextDouble();
   imc = peso/(altura * altura);
   System.out.printf("Seu imc é: %.2f", imc);
  }
}
