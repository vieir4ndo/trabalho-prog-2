import java.util.Scanner;
import java.util.*;

public class trf1 {

    public static void main(String args[]){

        Valores list = new Valores();
  
        Scanner in = new Scanner( System.in );

        int op =1;
        int primos = 0;
        int multiplosDe2 = 0;
        int muliplosDe3e5 =0;

        while(op != 2){
            System.out.println("Insira um valor: ");
            int numero = in.nextInt();
            list.Add(numero);

            if (numero % 2 == 0){
                multiplosDe2++;
            }
            
            if (numero % 3 ==0 && numero  % 5 ==0){
                muliplosDe3e5++;
            }
            
            if (ehPrimo(numero)){
                primos++;
            }

            System.out.println("Deseja continua? 1 - sim, 2 - não \n");
            op = in.nextInt();
        }
  
        System.out.println("Primos: " + primos);
        System.out.println("Dívisivel de 2: " + multiplosDe2);
        System.out.println("Dívisivel por 3 e 5: " + muliplosDe3e5);
    }

    private static boolean ehPrimo(int numero) {
        if (numero == 1) return false;
    for (int j = 2; j < numero; j++) {
        if (numero % j == 0){
            return false;
        }
    }
    return true;
}
} 
  public class Valores {
        List<Integer> list;

        public Valores(){
            list = new ArrayList<Integer>();
        }

        public void Add(int numero){
            list.add(numero);
        }

        public List<Integer> getList(){
            return this.list;
        }

        public int Size() {
            return this.list.size();
        }
    }