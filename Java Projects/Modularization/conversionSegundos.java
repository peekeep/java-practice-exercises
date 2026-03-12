import java.util.Scanner;

public class conversionSegundos {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int horas, minutos, segundos, segundosTotales;

        System.out.println("Ingrese la cantidad de horas: ");
        horas = sc.nextInt();

        System.out.println("Ingrese la cantidad de minutos: ");
        minutos = sc.nextInt();
        
        System.out.println("Ingrese la cantidad de segundos: ");
        segundos = sc.nextInt();

        segundosTotales = calculoSegundos(horas, minutos, segundos);

        System.out.println("La cantidad de segundos totales es de: "+segundosTotales);

        sc.close();
    }

    public static int calculoSegundos(int horas, int minutos, int segundos) {
        int segundosTotales;
        segundosTotales = (horas * 3600) + (minutos * 60) + segundos;
        return segundosTotales;
    }
}