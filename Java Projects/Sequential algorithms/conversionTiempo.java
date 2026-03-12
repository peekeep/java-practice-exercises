import java.util.Scanner;

public class conversionTiempo {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int minutosTotales, horas, minutosRestantes;

        System.out.println("Ingrese la cantidad de minutos: ");
        minutosTotales = sc.nextInt();

        horas = minutosTotales / 60;
        minutosRestantes = minutosTotales % 60;

        System.out.println(minutosTotales + " minutos equivalen a " + horas + " hora(s) y " + minutosRestantes + " minuto(s).");

        sc.close();
    }
}