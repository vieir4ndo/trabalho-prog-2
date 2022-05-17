import java.util.Scanner;

public class Main{
    public static void main(String args[]){
        Tempo receive = new Tempo();
        int horas;
        int minutos;
        int dia;
        int ano;
        int mes;
        String amoupm = new String();

        Scanner in = new Scanner(System.in);

        System.out.println("Digite o horas:");
        horas = in.nextInt();

        if(horas <= 12){
            amoupm = "am";
        }else{
            amoupm = "pm";
        }

        System.out.println("Digite o minutos:");
        minutos = in.nextInt();

        System.out.println("Digite o ano:");
        ano = in.nextInt();

        System.out.println("Digite o mes:");
        mes = in.nextInt();

        System.out.println("Digite o dia:");
        dia = in.nextInt();

        receive.setAno(ano);
        receive.setDia(dia);
        receive.setHora(mes);
        receive.setHora(horas);
        receive.setMinuto(minutos);
        receive.setAmPm(amoupm);
        receive.imprimeDados();
    }
}

public class Tempo{

    private int hora;
    private int minuto;
    private int ano;
    private int mes;
    private int dia;
    private String amoupm;

    public int getHora() {
        return hora;
    }
    public void setHora(int hora) {
        this.hora = hora;
    }
    public int getMinuto() {
        return minuto;
    }
    public void setMinuto(int minuto) {
        this.minuto = minuto;
    }
    public int getAno() {
        return ano;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }
    public void setMes(int mes) {
        this.mes = mes;
    }
    public void setDia(int dia) {
        this.dia = dia;
    }
    public void setAmPm(String amoupm) {
        this.amoupm = amoupm;
    }

    public void imprimeDados() {
        System.out.println("Hora: " + this.hora + this.amoupm);
        System.out.println("Minuto: " + this.minuto);
        System.out.println("Ano: " + this.ano);
        System.out.println("Mês: " + this.mes);
        System.out.println("Dia: " + this.dia);
    }
}