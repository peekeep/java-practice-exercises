import java.util.Scanner;

public class becaComedor {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int edad, localidad;
        double nota1, nota2, promedioNota;

        System.out.println("Ingrese la nota de su primer parcial: ");
        nota1 = sc.nextDouble();

        System.out.println("Ingrese la nota de su segundo parcial: ");
        nota2 = sc.nextDouble();

        System.out.println("Ingrese su edad: ");
        edad = sc.nextInt();

        System.out.println("Que tan lejos esta su localidad de Neuquen: ");
        localidad = sc.nextInt();

        promedioNota = nota1 + nota2/2;

        if ((promedioNota>=7 && edad<25) || (localidad>30)) {
            System.out.println("El alumno puede acceder a la beca: ");
        }
        else {
            System.out.println("El alumno NO puede acceder a la beca: ");
        }

        sc.close();
    }
}