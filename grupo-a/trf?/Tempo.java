public class Tempo{

    private int hora;
    private int minuto;
    private int ano;
    private int dia;

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
    public void setDia(int dia) {
        this.dia = dia;
    }

    void imprimeDados() {
        System.out.println("Hora: " + this.hora);
        System.out.println("Minuto: " + this.minuto);
        System.out.println("Ano: " + this.ano);
        System.out.println("Dia: " + this.dia);
    }
}