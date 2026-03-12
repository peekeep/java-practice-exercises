import java.util.Scanner;

public class numerosMultiplos {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int numero1, numero2;

        System.out.println("Ingrese su primer numero: ");
        numero1 = sc.nextInt();

        System.out.println("Ingrese su segundo numero: ");
        numero2 = sc.nextInt();
          
        if (numero2 !=0) {
            if (numero1 % numero2 ==0) {
                System.out.println(numero1+ " es múltiplo de "+numero2);
            }
            else {
                System.out.println(numero1+ " NO es múltiplo de "+numero2);
            } 
        }
        else {
            System.out.println("No se puede dividir por cero.");
        }

        sc.close();
    }
}