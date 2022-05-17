import java.util.Scanner;

public class Main{
    public static void main(String args[]){
        Tempo receive = new Tempo();
        int horas;
        int minutos;
        int dia;
        int ano;

        Scanner in = new Scanner(System.in);

        System.out.println("Digite o horas:");
        horas = in.nextInt();

        System.out.println("Digite o minutos:");
        minutos = in.nextInt();

        System.out.println("Digite o ano:");
        ano = in.nextInt();

        System.out.println("Digite o dia:");
        dia = in.nextInt();

        receive.setAno(ano);
        receive.setDia(dia);
        receive.setHora(horas);
        receive.setMinuto(minutos);
        receive.imprimeDados();
    }
}