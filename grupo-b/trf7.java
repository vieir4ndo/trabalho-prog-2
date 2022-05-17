import java.util.Scanner;
import java.util.*;

public class trf1 {

  public static void main(String args[]) {
    Scanner in = new Scanner(System.in);

    System.out.println("informe o tam da lista");
    int tam = in.nextInt();

    Valores list = new Valores(tam);
    int soma =0;

    int primos = 0;

    for (int i = 0; i < tam; i++){
        System.out.println("Insira um valor: ");
        float numero = in.nextFloat();
        soma += numero;
        list.Add(numero);

        if (ehPrimo(numero)) {
            primos++;
        }
    }

    float minList = Collections.min(list.getList());

    float maxList = Collections.max(list.getList());

    float media = soma / tam;

    System.out.println("O mínimo: " + minList);

    System.out.println("O máximo: " + maxList);

    System.out.println("A média: " + media);

    System.out.println("Primos: " + primos);

    list.PrintAll();
  }

  private static boolean ehPrimo(float numero) {
    if (numero == 1) return false;
    for (int j = 2; j < numero; j++) {
      if (numero % j == 0) {
        return false;
      }
    }
    return true;
  }

}
public class Valores {
  List<Float> list;
  int tam;

  public Valores(int tam) {
    this.tam = tam;
    list = new ArrayList<Float>(tam);
  }

  public void Add(float numero) {
    list.add(numero);
  }

  public List<Float> getList() {
    return this.list;
  }

  public int Size() {
    return this.list.size();
  }

  public void PrintAll() {
    for (int i = 0; i < tam; i++) {
        System.out.printf(this.list.indexOf(i));
    }
  }
}