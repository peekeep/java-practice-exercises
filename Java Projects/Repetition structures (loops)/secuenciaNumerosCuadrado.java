import java.util.Scanner;

public class secuenciaNumerosCuadrado {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int numero, cuadrado;

        do {
            System.out.println("Ingrese un numero: ");
            numero = sc.nextInt();

            if (numero !=0) {
                cuadrado = calcularCuadrado(numero);
                System.out.println("El cuadrado de "+numero+" es: "+cuadrado);
            }
        }
        while (numero !=0);
    }

    public static int calcularCuadrado(int numero) {
        int cuadrado;
        cuadrado = numero * numero;
        return cuadrado;
    }
}