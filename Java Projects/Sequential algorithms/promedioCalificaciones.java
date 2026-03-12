import java.util.Scanner;

public class promedioCalificaciones {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        double nota1, nota2, nota3, promedio;

        System.out.println("Ingrese su primer nota: ");
        nota1 = sc.nextDouble();

        System.out.println("Ingrese su segunda nota: ");
        nota2 = sc.nextDouble();

        System.out.println("Ingrese su tercer nota: ");
        nota3 = sc.nextDouble();

        promedio = (nota1 + nota2 + nota3) / 3;
        System.out.println("Su promedio de notas es de: " +promedio);

        sc.close();
    }
}