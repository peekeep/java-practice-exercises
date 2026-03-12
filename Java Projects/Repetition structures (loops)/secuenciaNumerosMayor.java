import java.util.Scanner;

public class secuenciaNumerosMayor {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int numero, mayorNum;
        mayorNum = 0;

        do {
            System.out.println("Ingrese un numero: ");
            numero = sc.nextInt();

            if (mayorNum<numero) {
                mayorNum = numero;
            }
        }
        while (numero !=0);

        System.out.println("El mayor de los numeros es: "+mayorNum);
    }
}