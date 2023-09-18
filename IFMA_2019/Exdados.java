/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exdados.IFMA_2019;

import java.util.Scanner;

/**
 *
 * @author aluno09
 */
public class Exdados {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner(System.in);
        double f,c;
        System.out.println("Digite a temp em c°: ");
        f = input.nextDouble();
        c = (f-32) * 5/9;
        System.out.println(f + "f° em celsius é: " + c + "°c");
    }
    
}
