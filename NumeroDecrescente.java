/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maiornumero;
import java.util.*;
/**
 *
 * @author aluno09
 */
public class NumeroDecrescente {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Int: ");
        int a = input.nextInt();
        while (a > 0){
            a--;
            System.out.println(a);
        }
       
    }
}
