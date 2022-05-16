import java.util.Scanner;
import java.util.*;

public class trf1 {

    public static void main(String args[]){

        Valores list = new Valores();
  
        Scanner in = new Scanner( System.in );

        int op =1, soma =0;

        while(op != 2){
            System.out.println("Insira um valor: ");
            int numero = in.nextInt();
            list.Add(numero);
            soma += numero;

            System.out.println("Deseja continua? 1 - sim, 2 - não \n");
            op = in.nextInt();
        }
  
        int minList = Collections.min(list.getList());
  
        int maxList = Collections.max(list.getList());

        double media = soma/ list.Size();
  
        System.out.println("O mínimo: " + minList);
  
        System.out.println("O máximo: " + maxList);

        System.out.println("A média: " + media);
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