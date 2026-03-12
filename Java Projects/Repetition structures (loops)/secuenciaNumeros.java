import java.util.Scanner;

public class secuenciaNumeros {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int numero, cantidad, suma;
        cantidad = 0;
        suma = 0;

        System.out.println("Ingrese un numero: ");

        while (true) {
            numero = sc.nextInt();

            if (numero <=0) {
                break;
            }

            suma = suma + numero;
            cantidad++;
        }

        if (cantidad >0) {
            double promedio = (double) suma / cantidad;
            System.out.println("Suma total: "+suma);
            System.out.println("Promedio: "+promedio);
        }
        else {
            System.out.println("No se ingresaron números válidos.");
        }
    }
}