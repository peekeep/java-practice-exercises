import java.util.Scanner;

public class distanciaRecorrida {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        double velocidad, tiempo, distancia;

        System.out.println("Ingrese la velocidad en km/h: ");
        velocidad = sc.nextDouble();

        System.out.println("Ingrese la cantidad de tiempo en horas: ");
        tiempo = sc.nextDouble();

        distancia = calculoDistancia(velocidad, tiempo);

        System.out.println("La distancia recorrida en km es de: "+distancia);

        sc.close();
    }

    public static double calculoDistancia(double velocidad, double tiempo) {
        double distancia;
        distancia = velocidad * tiempo;
        return distancia;
    }
}