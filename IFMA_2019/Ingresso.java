package exdados.IFMA_2019;


public class Ingresso {
    public static void main(String[] args) {
        
    }
    private static int Valor;
        //int Valor;
        public void ImprimeValor(){
        //Valor valor;
        //valor = new Valor();
        Ingresso.Valor = 200;
        System.out.println(Valor);
        }
public class normal extends Ingresso{
    //ImprimeValor();
        public void norm(){
            System.out.println("Ingresso Normal");
        }
    
}
public class Vip extends Ingresso{
    @Override
    public void ImprimeValor(){
        long sVip = Ingresso.Valor + 20;
        System.out.println(sVip);
    }
}
class CamInf extends Vip{
    String Localização;
    public String getLocalização(){
        return Localização;
    }
    public void setLocalização(){
       this.Localização = Localização;
}
class CamSup extends Vip{
    public void ImprimValor(long sVip){
        //int Vip = ;
        long SupVip = sVip + 30;
        System.out.println(sVip);
    }
    }
    class Valor {

        public Valor() {
        }
    }
}}
