/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maiornumero;

/**
 *
 * @author aluno09
 */

public class sm {
    public static void main(String[] args) {
        int s = 0; 
        long m = 1;
        for (int i = 1; i < 30; i++){
            if (i % 2 == 0){
                m *= i;
            }else{
                s+= i;
            }
            System.out.println("Soma: " + s + "multiplicação: " + m);
            
        }
    }
}
