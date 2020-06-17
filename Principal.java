
package principal;

import java.util.HashMap;
import java.util.Map;

public class Principal {

    public static void main(String[] args) {
       
        conta c1 = new conta();
        conta c2 = new conta();
        
        c1.nome = "joaoderson";
        c1.numero = 234;
        c2.nome = "pauliete";
        c2.numero = 567;
        c1.deposito(98);
        c2.deposito(108);
        
        Map<String, conta> MapaDeContas = new HashMap<>();
        MapaDeContas.put("diretor",c1);
        MapaDeContas.put("gerente",c2);
        conta contadiretor = MapaDeContas.get("diretor");
        
        System.out.println(MapaDeContas);
    }   
    
    
}
