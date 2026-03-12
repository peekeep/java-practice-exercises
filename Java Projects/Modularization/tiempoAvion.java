import java.util.Scanner;

public class tiempoAvion {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int horas1, minutos1, segundos1, horas2, minutos2, segundos2, salida, llegada, diferencia;

        System.out.println("Ingrese la hora del despegue: ");
        horas1 = sc.nextInt();

        System.out.println("Ingrese los minutos del despegue: ");
        minutos1 = sc.nextInt();

        System.out.println("Ingrese los segundos del despegue: ");
        segundos1 = sc.nextInt();

        System.out.println("Ingrese la hora del aterrizaje: ");
        horas2 = sc.nextInt();

        System.out.println("Ingrese los minutos del aterrizaje: ");
        minutos2 = sc.nextInt();

        System.out.println("Ingrese los segundos del aterrizaje: ");
        segundos2 = sc.nextInt();

        salida = calculoTiempo(horas1, minutos1, segundos1);
        llegada = calculoTiempo(horas2, minutos2, segundos2);
        diferencia = llegada - salida;

        mostrarTiempo(diferencia);

        sc.close();
    }

    public static int calculoTiempo(int horas, int minutos, int segundos) {
        return (horas * 3600) + (minutos * 60) + segundos;
    }

    public static void mostrarTiempo(int totalSegundos) {
        int horas, minutos, segundos;
        horas = totalSegundos/3600;
        minutos = (totalSegundos % 3600)/60;
        segundos = totalSegundos%60;
        System.out.println("Duración del vuelo: "+horas+" horas "+minutos+" minutos "+segundos+" segundos");
    }
}