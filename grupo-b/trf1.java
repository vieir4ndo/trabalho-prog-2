
import java.util.Scanner;
import java.util.*;

public class trf1 {

    public static void main(String args[]){

        Valores list = new Valores();

        Scanner in = new Scanner( System.in );

        System.out.println("Insert a value per line");

        for (int i =0; i< 20; i++){
            list.Add(in.nextInt());
        }
  
        int minList = Collections.min(list.getList());
  
        int maxList = Collections.max(list.getList());
  
        System.out.println("Minimum value of list is: " + minList);
  
        System.out.println("Maximum value of list is: " + maxList);
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
    }