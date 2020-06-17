
package maiornumero;
import java.util.*;
/**
 *
 * @author aluno09
 */
public class MaiorNumero {
  
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          Scanner input = new Scanner(System.in);
    
    System.out.println("a: ");
    int a = input.nextInt();
    System.out.println("b: ");
    int b = input.nextInt();
    if (a > b){
        System.out.println("A é maior");
    }else{
        System.out.println("B é maior");
    }
    }
    
}
