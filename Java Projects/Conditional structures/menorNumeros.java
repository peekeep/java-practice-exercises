import java.util.Scanner;

public class menorNumeros {
    public static void main(String[] args) { 

        Scanner sc = new Scanner(System.in);

        int numero1, numero2;

        System.out.println("Ingrese su primer numero: ");
        numero1 = sc.nextInt();

        System.out.println("Ingrese su segundo numero: ");
        numero2 = sc.nextInt();

        if (numero1 < numero2) {
            System.out.println("El numero menor es el "+numero1);
        }
        else {
            if (numero1 == numero2) {
                System.out.println("El numero "+numero1+" es igual al numero "+numero2);
            }
            else {
                System.out.println("El numero menor es el "+numero2);
            }
        }
        
        sc.close();
    }
}