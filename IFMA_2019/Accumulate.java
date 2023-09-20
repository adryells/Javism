package IFMA_2019;

public class Accumulate {
    public static void main(String[] args) {
        int neutral_sum = 0;
        long neutral_multi = 1;

        for (int index = 1; index < 30; index++){

            if (index % 2 == 0){
                neutral_multi *= index;
            }else{
                neutral_sum += index;
            }

            System.out.println("Sum: " + neutral_sum + " multiplicação: " + neutral_multi);
            
        }
    }
}
