/*
1) Dado o código da classe abaixo, faça um programa que instancie um objeto Autor e leia do teclado os dados
necessários para preencher todos atributos do objeto instanciado.
*/

import java.util.Scanner;
import java.util.*;

public class trf1 {

    public static void main(String args[]){

        List<Integer> list = new ArrayList<Integer>();
  
        Scanner in = new Scanner( System.in );

        System.out.println("Insert a value per line");

        for (int i =0; i< 20; i++){
            list.add(in.nextInt());
        }
  
        int minList = Collections.min(list);
  
        int maxList = Collections.max(list);
  
        System.out.println("Minimum value of list is: " + minList);
  
        System.out.println("Maximum value of list is: " + maxList);
    }
} 