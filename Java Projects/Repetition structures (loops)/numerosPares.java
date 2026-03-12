import java.util.Scanner;

public class numerosPares {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int N, i, numeroPar;

        System.out.println("Ingrese su numero natural par: ");
        N = sc.nextInt();

        for (i=1;i<=N;i++) {
            numeroPar = i * 2;
            System.out.println("El numero es: "+numeroPar);
        }
    }
}