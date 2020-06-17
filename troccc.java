/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ds.troca;

import java.util.Scanner;

/**
 *
 * @author aluno09
 */
public class troccc {
    public static void main(String[] args){
        Scanner input = new Scanner (System.in);
        int a,b,troca;
        System.out.println("valor A: ");
        a = input.nextInt();
        System.out.println("valor B: ");
        b = input.nextInt();
        troca = a; a = b; b = a;
        System.out.println("Valores trocados!!!");
        System.out.println("A: " + a + " B: " + troca);

    }
    
}
