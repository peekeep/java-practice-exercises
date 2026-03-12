import java.util.Scanner;

public class conversionMoneda {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        double pesoArgentino, dolar, cotizacion;
        cotizacion = 0.00089;

        System.out.println("Ingrese la cantidad de pesos argentinos: ");
        pesoArgentino = sc.nextDouble();
        
        dolar = pesoArgentino * cotizacion;

        System.out.println("Equivalente en dólares: $" +dolar);

        sc.close();
    }
}