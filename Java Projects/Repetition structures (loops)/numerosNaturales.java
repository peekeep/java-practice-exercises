import java.util.Scanner;

public class numerosNaturales {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int N, i;

        System.out.println("Ingrese un numero natural: ");
        N = sc.nextInt();

        for (i=1; i<=N;i++) {
            System.out.println("El numero es: "+i);
        }
    }
}